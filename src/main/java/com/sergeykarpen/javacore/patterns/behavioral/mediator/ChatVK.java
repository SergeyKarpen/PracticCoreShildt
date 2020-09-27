package main.java.com.sergeykarpen.javacore.patterns.behavioral.mediator;

import main.java.com.sergeykarpen.javacore.patterns.structural.flyweight.Car;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class ChatVK implements Chat {

    User admin;
    List<User> userList = new ArrayList<>();

    public void addUserToChat(User user) {
        this.userList.add(user);
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User user1 : userList) {
            if (user1 != user) {
                user1.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
