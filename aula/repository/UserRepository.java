package repository;

import java.util.ArrayList;

import model.UserModel;

public class UserRepository {
    private ArrayList<UserModel> userDatabase;

    public UserRepository(){
        this.userDatabase= new ArrayList<>();
}
public void save(UserModel user){
    userDatabase.add(user);
}
public ArrayList<UserModel> findall(){
    return userDatabase;
}
//fazer metodos deleteById e getById
}
