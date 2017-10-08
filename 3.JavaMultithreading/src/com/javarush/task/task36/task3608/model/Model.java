package com.javarush.task.task36.task3608.model;

/**
 * Created by TRACTEL_RND on 27.08.2017.
 */
public interface Model {
    ModelData getModelData();
    void loadDeletedUsers();
    void loadUsers();
    void loadUserById(long u);
    void deleteUserById(long id);
    void changeUserData(String name, long id, int level);

}
