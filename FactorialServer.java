import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for Clients...");
            ServerSocket ss = new ServerSocket(9086);
            Socket soc = ss.accept();
            System.out.println("Connection Established.");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int number = Integer.parseInt(in.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("Factoral of " + number + " is : " + calculateFactorial(number));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }// main
    public static int calculateFactorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;

        }
        return fact;
    }//calculateFactorial
}// class
