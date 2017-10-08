package com.javarush.task.task23.task2309.vo;

import com.javarush.task.task23.task2309.AbstractDbSelectExecutor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TRACTEL_RND on 12.08.2017.
 */
public class Server extends NamedItem{


    public List<Server> getServers() {
        return new AbstractDbSelectExecutor<Server>() {
            @Override
            public String getQuery() {
                return "SELECT * FROM SERVER";
            }
        }.execute();
    }

}
