import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class FactorialClient {
    public static void main(String[] args) {
        try {
            System.out.println("Client Started...");
            Socket soc = new Socket("localhost", 9086);
            BufferedReader userinput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Number : ");
            int number = Integer.parseInt(userinput.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(number);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }// main

}// class