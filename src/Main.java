import models.Register;
import models.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Oat", "oanchana.c@ku.th", 21);
        User user1 = new User("", "oanchana.c@ku.th", 21);
        User user2 = new User("Oat", "", 21);
        User user3 = new User("123", "oanchana.c@ku.th", 21);
        User user4 = new User("Oat", "oanchana.c", 21);
        User user5 = new User("Oat", "oanchana.c@dom1.cc", 21);
        User user6 = new User("Oat", "oanchana.c@ku.th", 19);

        Register register = new Register();
        register.register(user);
    }
}

//6510405865 Oanchana Changcharoen