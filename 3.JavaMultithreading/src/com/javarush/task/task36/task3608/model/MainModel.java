package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;


import java.util.Arrays;
import com.javarush.task.task36.task3608.model.service.UserService;
import com.javarush.task.task36.task3608.model.service.UserServiceImpl;
import java.util.List;

/**
 * Created by TRACTEL_RND on 28.08.2017.
 */
public class MainModel implements Model {

    private ModelData modelData = new ModelData();
    private  UserService userService = new UserServiceImpl();

    public ModelData getModelData() {
        return modelData;
    };

    private List<User> getAllUsers(){
        return userService.filterOnlyActiveUsers(userService.getUsersBetweenLevels(1, 100));

    }

    public void loadUsers(){
        modelData.setDisplayDeletedUserList(false);
        modelData.setUsers(getAllUsers());

       }

    public void loadDeletedUsers() {
        List<User> users = userService.getAllDeletedUsers();
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(true);
    }

    public void loadUserById(long userId) {
        User user = userService.getUsersById(userId);
        modelData.setActiveUser(user);
    }

    @Override
    public void deleteUserById(long id) {
        userService.deleteUser(id);
        modelData.setDisplayDeletedUserList(false);
        modelData.setUsers(getAllUsers());
    }

    public void changeUserData(String name, long id, int level) {
        userService.createOrUpdateUser(name,id,level);
        modelData.setUsers(getAllUsers());
    }
}


