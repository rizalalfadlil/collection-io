import java.io.*;

public class ContohInput {
    public static void main(String[] args) {
        String nama = " ";
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("nama : ");
        try{
            nama = input.readLine();
        } catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("nama anda adalah : " + nama);
    }
}
