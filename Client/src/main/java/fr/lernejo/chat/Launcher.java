package fr.lernejo.chat;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Launcher {



    public static void main (String []args) {
        RabbitTemplate rt = new AnnotationConfigApplicationContext(Launcher.class).getBean(RabbitTemplate.class);
        System.out.println("Input a message , we will sent it for you (q for quit)");
        Scanner scan = new Scanner(System.in);
        String currentLine = scan.nextLine();
        while (!currentLine.equals("q"))
        {
            rt.convertAndSend("","chat_messages",currentLine);
            System.out.println("Message sent, Input a message , we will sent it for you (q for quit)");
            currentLine = scan.nextLine();
        }

    }
}
