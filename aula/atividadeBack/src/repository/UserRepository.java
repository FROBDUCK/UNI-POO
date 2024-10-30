package repository;
import model.UserModel;

import java.util.ArrayList;

public class UserRepository {
    private ArrayList<UserModel> userDatabase;

    public UserRepository(){
        this.userDatabase = new ArrayList<>();
    }
    public void save(UserModel user){
        this.userDatabase.add(user);
    }
    public ArrayList<UserModel> findAll(){
        return userDatabase;
    }
    public UserModel getById(int id){
        return userDatabase.get(id);
    }
    public UserModel deleteById(int id){
        return userDatabase.remove(id);
    }
}
