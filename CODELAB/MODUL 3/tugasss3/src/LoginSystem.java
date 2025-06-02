import java.util.Scanner;

// kelas utama
public class LoginSystem {
    // (main method)
    public static void main(String[] args) {

        // untuk input dari user
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("Khansa", "202410370110171", "Khansa", "2323");
        Mahasiswa mahasiswa = new Mahasiswa("Khansa", "202410370110171");

        // Menampilkan pilihan login kepada user
        System.out.println("Pilih login sebagai:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");

        // Meminta input pilihan dari user
        System.out.print("Pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine();


        if (choice == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            // method login untuk mengecek apakah usn dan pw cocok
            if (admin.login(username, password)) {
                // Jika login berhasil
                admin.displayInfo();
            } else {
                // Jika login gagal
                System.out.println("Login gagal! Username atau password salah.");
            }
        }
        // Jika user memilih login sebagai Mahasiswa
        else if (choice == 2) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        }
        else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
