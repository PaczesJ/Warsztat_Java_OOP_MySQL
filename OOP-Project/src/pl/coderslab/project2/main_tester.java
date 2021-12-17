package pl.coderslab.project2;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class main_tester {
    public static void main(String[] args) {
        System.out.println("Zaczynamy warsztat");

        User user1 = new User("Jan", "jak.kowalski@gmail.com", "janekCyganek1985!");

        UserDao userDao1 = new UserDao();

        userDao1.create(user1);

    }
}
