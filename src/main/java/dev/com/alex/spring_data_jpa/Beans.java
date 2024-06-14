package dev.com.alex.spring_data_jpa;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class Beans {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
}
