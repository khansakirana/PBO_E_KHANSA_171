import java.util.Scanner;

class Admin{
    //method
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.mainA();
    }
    //method main
    public void mainA(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan username: ");
        String username = input.nextLine();
        System.out.print("Masukan password: ");
        String password = input.nextLine();
        System.out.println("");
        System.out.println("");

        //mengecek apakah usn dan pw cocok
        if(username.equals("Khansa171") && password.equals("Password171")){
            login();
        }else{System.out.println("Username atau Password salah");}
        input.close();
    }

    //method login
    void login(){
        System.out.println("Login sebagai Admin berhasil");
    }
}