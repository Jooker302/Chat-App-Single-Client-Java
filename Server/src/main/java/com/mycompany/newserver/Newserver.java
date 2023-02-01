/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.newserver;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author Joker
 */
public class Newserver {

    public static void main(String[] args) throws IOException {
//        import java.io.*;
//import java.net.*;

//public class ChatServer {
//    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Chat server is listening on port 5000");

        Scanner scanner = new Scanner(System.in);
        
        Socket client = server.accept();
        System.out.println("New client connected: " + client.getInetAddress().getHostAddress());

        BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter output = new PrintWriter(client.getOutputStream(), true);

        while (true) {
            String message = input.readLine();
            if (message == null) {
                break;
            }
            System.out.println("Received message: " + message);
            String msg = scanner.nextLine();
            output.println(msg);
        }

        System.out.println("Client disconnected");
        client.close();
        server.close();
    }
//}

//    }
}
