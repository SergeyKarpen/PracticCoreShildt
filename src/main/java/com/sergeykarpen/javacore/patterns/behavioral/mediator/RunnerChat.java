package main.java.com.sergeykarpen.javacore.patterns.behavioral.mediator;

public class RunnerChat {
    public static void main(String[] args) {
        ChatVK chat = new ChatVK();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User1");
        User user2 = new SimpleUser(chat, "User2");


        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Привет я User1");
        admin.sendMessage("Привет я Admin");

    }
}
