package com.packages.main;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class newclient {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		public class ChatClient {
		    public static void main(String[] args) throws IOException {
		        Socket socket = new Socket("localhost", 5000);
		        System.out.println("Connected to server");

		        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("Enter your message: ");
		            String message = scanner.nextLine();
		            output.println(message);

		            String response = input.readLine();
		            System.out.println("Server says: " + response);
		        }
		    }
//		}

//	}

}
