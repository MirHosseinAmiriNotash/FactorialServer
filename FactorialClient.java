import java.net.Socket;

public class FactorialClient {
public static void main(String[] args) {
    try{
       System.out.println("Client Started...");
       Socket soc = new Socket("localhost",9086);
    }catch(Exception e){
        e.printStackTrace();
    }
}//main
    
}//class