package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getUsers();
    User saveUser(User user);
    User updateUser(User user);
    void deleteUserById(Long id);
}
