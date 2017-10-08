package com.javarush.task.task36.task3608.model;
import com.javarush.task.task36.task3608.bean.User;
import java.util.*;
/**
 * Created by TRACTEL_RND on 27.08.2017.
 */
public class FakeModel implements Model {

    private ModelData modelData = new ModelData();

    public ModelData getModelData() {
      return modelData;
    };

    @Override
    public void loadDeletedUsers() {

        throw new UnsupportedOperationException();

    }

    public void loadUsers(){

        modelData.setUsers(Arrays.asList(new User("A", 1, 1), new User("B",2,2)));
    }

    @Override
    public void loadUserById(long u) {
     throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }
}
