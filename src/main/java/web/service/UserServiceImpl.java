package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    @Transactional
    public User saveUser(User user) {
        return userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public User updateUser(User user) {
        return userDAO.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUserById(Long id) {
        userDAO.deleteUserById(id);
    }
}
