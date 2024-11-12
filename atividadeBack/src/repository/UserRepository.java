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
    public UserModel findById(long id) {
        for (int i = 0; i < userDatabase.size(); i++) {
            if (userDatabase.get(i).getId() == id) {
                return userDatabase.get(i);
            }
        }
        return null;
    }
    public void deleteById(long id){
        UserModel user = findById(id);
        if (user != null) {
            userDatabase.remove(user);
        }
    }
}
