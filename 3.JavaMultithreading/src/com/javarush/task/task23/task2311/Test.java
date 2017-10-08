package com.javarush.task.task23.task2311;

import java.io.ByteArrayOutputStream;
import java.io.*;

/**
 * Created by TRACTEL_RND on 13.08.2017.
 */
public class Test {

    public static void main(String[] args) {

        Test objectOriginal = new Test(); //создали объект, который будем клонировать

         try {
             ByteArrayOutputStream writeBuffer = new ByteArrayOutputStream();//массив байт, который будет динамически растягиваться при добавлении к нему новых данных (как ArrayList).
             ObjectOutputStream outputStream = new ObjectOutputStream(writeBuffer); //используется для сериализации
             outputStream.writeObject(objectOriginal); //cериализуем объект objectOriginal в массив байт с помощью outputStream и сохраняем его в массив writeBuffer.
             outputStream.close();

             byte[] buffer = writeBuffer.toByteArray(); //мы преобразовываем writeBuffer в обычный массив байт
             ByteArrayInputStream readBuffer = new ByteArrayInputStream(buffer); //мы оборачиваем buffer в класс ByteArrayInputStream, чтобы из него можно было читать, как из InputStream
             ObjectInputStream inputStream = new ObjectInputStream(readBuffer); // readBuffer классу ObjectInputStream, для чтения (десериализации) объекта
             Test objectCopy = (Test) inputStream.readObject(); //читаем наш объект и преобразуем его к типу Test
         }

         catch (Exception ex) {
             ex.printStackTrace();
         }
    }
}






