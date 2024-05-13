import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the host/IP address: ");
        String host = scanner.nextLine();

        System.out.print("Enter the port number: ");
        int port = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Checking if port " + port + " is open on " + host + "...");

        try {
            Socket socket = new Socket(host, port);
            System.out.println("Port " + port + " is open on " + host);
            socket.close();
        } catch (IOException e) {
            System.out.println("Port " + port + " is closed or unreachable on " + host);
        }

        scanner.close();
    }
}