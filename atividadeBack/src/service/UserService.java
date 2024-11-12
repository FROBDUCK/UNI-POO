package service;

import repository.UserRepository;
import model.UserModel;

import java.util.ArrayList;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void insertUser(long id, String username, String password, short age) {
        if (age>10){
            UserModel user = new UserModel(id, username, password, age);
            userRepository.save(user);
        }
    }
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }

    public ArrayList<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    public UserModel getUserById(long id){
        return userRepository.findById(id);
    }
}
