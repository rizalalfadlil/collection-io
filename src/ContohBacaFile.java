
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContohBacaFile {
    public static void main(String[] args) {
        try {
            java.io.File file = new java.io.File("teks-ku.txt");
            Scanner input = new Scanner(file);
            input.useDelimiter("\n");
            
            while (input.hasNext()) {
                String nama = input.next();
                String mk = input.next();
                String pt = input.next();
                
                System.out.println("Nama : " + nama);
                System.out.println("Mata Kuliah : " + mk);
                System.out.println("Perguruan Tinggi : " + pt);
            }
            
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
