package com.javarush.task.task23.task2309.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TRACTEL_RND on 12.08.2017.
 */
public class Subject extends NamedItem {

    public List<Subject> getSubjects() {

        List subject_List = new ArrayList();
        Subject subject = new Subject();
        try {
            for (int i = 0; i < subject_List.size(); i++) {
                subject_List.add(subject);

            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        return subject_List;

    }

}
