package ru.javacore.gorbachev.server;

import ru.javacore.gorbachev.server.essence.ChatServer;

public class ChatServerMain {
    private static ChatServer chatServer;

    public static void main(String[] args) {
        chatServer = new ChatServer();
    }
}
