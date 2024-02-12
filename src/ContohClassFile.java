public class ContohClassFile {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("teks-ku.txt");
        try {
            if(file.createNewFile())
                System.out.println("File Berhasil Dibuat");
            else
                System.out.println("File Gagal Dibuat");
        }catch(Exception e){
            System.out.println("Error");
        }

        System.out.println("Apakah File Ada? " + file.exists());
        System.out.println("Apakah Bisa Dibaca? " + file.canRead());
        System.out.println("Apakah Bisa Ditulis? " + file.canWrite());
        System.out.println("Apakah Berupa Direktori? " + file.isDirectory());
        System.out.println("Apa Namanya? " + file.getName());
        System.out.println("Dimana Lokasinya? " + file.getPath());
        System.out.println("Dimana Lokasinya Lengkapnya? " + file.getAbsolutePath());
    }
}
