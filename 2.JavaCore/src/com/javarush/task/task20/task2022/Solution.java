package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName=fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream=new FileOutputStream(this.fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception {

        Solution sol = new Solution("C:\\Users\\TRACTEL_RND\\Desktop\\file1.txt");
        sol.writeObject("GREGOR");

        //сериализация
        ByteArrayOutputStream storage = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(storage);
        objectOutputStream.writeObject(sol);
        objectOutputStream.close();

        //десериализация
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(storage.toByteArray()));
        Solution read = (Solution) objectInputStream.readObject();
        System.out.println(read);
        read.writeObject("Hello");
        read.writeObject("Hello2");
        read.writeObject("Hello3");
        read.close();

    }
}
