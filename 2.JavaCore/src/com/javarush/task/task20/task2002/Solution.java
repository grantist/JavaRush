package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream("C:\\Users\\TRACTEL_RND\\Desktop\\file1.txt");
            InputStream inputStream = new FileInputStream("C:\\Users\\TRACTEL_RND\\Desktop\\file1.txt");

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.users = new ArrayList<>();
            User user = new User();
            user.setFirstName("Vangelis");
            user.setLastName("Kondratevi");
            user.setBirthDate(new Date());
            user.setMale(true);
            user.setCountry(User.Country.UKRAINE);
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);

            System.out.println(javaRush.equals(loadedObject));
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }
    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            String areUsersPresent = users != null ? "yes" : "no";
            writer.println(areUsersPresent);
            if(users != null) {
                int size = users.size();
                writer.println(size);
                for (int i = 0; i < size; i++) {
                    writer.println(users.get(i).getFirstName());
                    writer.println(users.get(i).getLastName());
                    writer.println(new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy").format(users.get(i).getBirthDate()));
                    writer.println(users.get(i).isMale() ? "true" : "false");
                    writer.println(users.get(i).getCountry().getDisplayedName());
                }
            }
            writer.flush();
        }
        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String areUsersPresent = reader.readLine();
            if(areUsersPresent.equals("yes")){
                int size = Integer.parseInt(reader.readLine());
                if(size>0) {
                    for (int i = 0; i < size; i++) {
                        User user = new User();

                        String firstName = reader.readLine();
                        user.setFirstName(firstName);

                        String lastName = reader.readLine();
                        user.setLastName(lastName);

                         long d= new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy").parse(reader.readLine()).getTime();
                         Date der = new Date (d);
                         user.setBirthDate(der);
                        System.out.println(d);
                        boolean isMale = reader.readLine().equals("true");
                        user.setMale(isMale);
                        String country = reader.readLine();
                        User.Country country1;
                        if (country.equals("Ukraine")) {
                            country1 = User.Country.UKRAINE;
                        } else if (country.equals("Russia")) {
                            country1 = User.Country.RUSSIA;
                        } else {
                            country1 = User.Country.OTHER;
                        }
                        user.setCountry(country1);
                        users.add(user);
                    }
                }
            }
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            JavaRush javaRush = (JavaRush) o;
            return users != null ? users.equals(javaRush.users) : javaRush.users == null;
        }
        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}