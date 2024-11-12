import repository.UserRepository;
import service.UserService;
import model.UserModel;

public class App {

    public static void main(String[] args) throws Exception {

        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        userService.insertUser(1L,"alo", "senha", (short) 15);
        UserModel user = userService.getUserById(1);
        System.out.println(user);

    }
}
