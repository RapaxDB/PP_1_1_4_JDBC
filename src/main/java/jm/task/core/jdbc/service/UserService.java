package jm.task.core.jdbc.service;

import jm.task.core.jdbc.model.User;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface UserService {
    void createUsersTable() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;

    void dropUsersTable();

    void saveUser(String name, String lastName, byte age) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}
