import java.util.Scanner;

// kelas Mahasiswa
class Mahasiswa {

    // Method main
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa(); // membuat objek Mahasiswa
        mhs.mainM(); // Memanggil method mainM() untuk menjalankan proses login
    }

    // Method utama login mahasiswa
    public void mainM(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan username: ");
        String username = input.nextLine();

        System.out.print("Masukan nim: ");
        String nim = input.nextLine();

        System.out.println("");
        System.out.println("");

        // Cek apakah username dan nim cocok dengan data yang ditentukan
        if(username.equals("Khansa Kirana Putri Paraswati") && nim.equals("202410370110171")){
            login(); // Jika cocok, panggil method login()
            DisplayInfo(username, nim); // Tampilkan info mahasiswa
        } else {
            // jika tidak cocok tampilkan pesan kesalahan
            System.out.println("Username atau password salah");
        }

        input.close();
    }

    // Method untuk menampilkan pesan berhasil login
    void login(){
        System.out.println("Login sebagai Mahasiswa berhasil");
    }

    // Method untuk menampilkan informasi mahasiswa
    void DisplayInfo(String username, String nim){
        System.out.println("Nama Mahasiswa: " + username); // Tampilkan nama
        System.out.println("Nim nya adalah: " + nim);       // Tampilkan NIM
    }
}
