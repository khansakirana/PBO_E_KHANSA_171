import java.util.Scanner;

public class LoginSystem { //mendefinisikan kelas utama loginsystem
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //membuat objek scannner agar input terbaca

        //menampilkan menu pilihan login        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt(); //membaca input angka 1 atau 2
        scanner.nextLine(); // newline setelah rnextInt

        if (pilihan == 1) {
            // Login Admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            String nimAkhir = "171"; // 3 digit terakhir NIM Anda
            String validUsername = "Admin" + nimAkhir;
            String validPassword = "password" + nimAkhir;

            //memeriksa apakah nim dan nama cocok
            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Login Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            String validNama = "khansa"; // Ganti dengan nama Anda
            String validNim = "171"; // Ganti dengan NIM Anda

            //memeriksa apakah nim dan nama cocok
            if (nama.equals(validNama) && nim.equals(validNim)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}