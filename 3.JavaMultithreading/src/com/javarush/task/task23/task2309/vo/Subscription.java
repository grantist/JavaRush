package com.javarush.task.task23.task2309.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TRACTEL_RND on 12.08.2017.
 */
public class Subscription extends NamedItem{


    public List<Subscription> getSubscriptions() {

        List subscriptions_List = new ArrayList();
        Subscription subscription = new Subscription();
        try {
            for (int i = 0; i < subscriptions_List.size(); i++) {
                subscriptions_List.add(subscription);

            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        return subscriptions_List;



    }

}
