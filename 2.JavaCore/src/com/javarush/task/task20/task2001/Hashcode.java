package com.javarush.task.task20.task2001;

import com.javarush.task.task20.task2002.User;

/**
 * Created by TRACTEL_RND on 06.03.2017.
 */
public class Hashcode {



    public static void main(String[] args)
    {
        User user = new User();
        Object o = new Object();
        Object o2 = new Object();
        int hCode = o.hashCode();
        int hCode2 = o2.hashCode();
        System.out.println("hashCode = " + hCode);// номер ячейки памяти, где объект сохраняется.
        System.out.println("hashCode2 = " + hCode2);
        System.out.println(o.getClass());
        System.out.println(user.getClass());

    }

}
