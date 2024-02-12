import java.io.*;
public class ContohTulisFile {
    public static void main(String[] args) {
        File  file = new File("teks-ku.txt");
        try {
            PrintWriter output = new PrintWriter(file);
            output.println("Herman Yuliansyah, S.T., M.eng");
            output.println("Pemrograman Berorientasi Obyek");
            output.println("Universitas Ahmad Dahlan");
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
