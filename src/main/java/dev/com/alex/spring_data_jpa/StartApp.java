package dev.com.alex.spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dev.com.alex.spring_data_jpa.model.User;
import dev.com.alex.spring_data_jpa.repository.UserRepository;

import java.util.Scanner;

@Component
public class StartApp implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Scanner sc;

    @Override
    public void run(String... args) throws Exception {
        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Username: ");
            String username = sc.nextLine();

            System.out.print("Password: ");
            String password = sc.nextLine();

            User user = new User();
            user.setName(name);
            user.setUsername(username);
            user.setPassword(password);
            userRepository.save(user);

            System.out.print("Add more ? [y/n]: ");
            String decision = String.valueOf(sc.nextLine().charAt(0));
            if (decision.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }


        for (User u: userRepository.findAll())
            System.out.println(u);
    }
    
}
