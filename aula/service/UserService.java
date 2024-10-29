package service;

import repository.UserRepository;

public class UserService {
    private UserRepository userRepository;

public UserService(UserRepository userRepository){
    this.userRepository=userRepository;
}
public void insertUser(long id, String username, String password, short age){
    if(age>=10){
        UserModel user= new UserModel(id,username,password,age);
        userRepository.save(user);
    }
}
    
}
