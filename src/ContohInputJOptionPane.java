import javax.swing.JOptionPane;
public class ContohInputJOptionPane {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "Nama : ");
        JOptionPane.showMessageDialog(null, "Nama anda : " + nama);
    }
}
