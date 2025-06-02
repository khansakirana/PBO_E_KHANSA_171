import java.util.Scanner;

class LoginSystem{
    //method
    public static void main(String[] a){
        Scanner input = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        Admin admin = new Admin();
        System.out.println("----------HALAMAN LOGIN----------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Login sebagai:");
        int pilihan = input.nextInt(); //membaca input int
        input.nextLine();

        switch(pilihan){
            case 1: admin.mainA(); break;
            case 2: mahasiswa.mainM(); break;
        }
        input.close();
    }
}