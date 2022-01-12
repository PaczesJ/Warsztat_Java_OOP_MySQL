package pl.coderslab.project2;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.util.Arrays;

public class Main_Dao {
    public static void main(String[] args) {
        System.out.println("Zaczynamy warsztat");

        UserDao userDao1 = new UserDao();

//        User user1 = userDao1.read(2);

//        User user = new User("Grzegorz", "grigory2000Xd@interia.pl", "??programistyRuleZ?");
//        userDao1.create(user);

//        user1.setUserName("Franciszek");
//        user1.setEmail("franek.przygoda@faithmail.com");
//        user1.setPassword("franki4Przygodzianki");
//        userDao1.update(user1);

//        userDao1.delete(3);
        System.out.println(Arrays.toString(userDao1.findAll()));
    }
}
