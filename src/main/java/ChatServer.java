package main.java;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

public class ChatServer {
    public static void main (String[] args) throws IOException {
        try (ServerSocket listener = new ServerSocket(Integer.parseInt(args[0]))) {
            while (true) {
                Socket socket = listener.accept();
                List<Socket> sockets = new LinkedList<>();
                try {
                    sockets.add(socket);
                } catch (Exception e) {
                    socket.close();
                }
            }
        }
    }
}
