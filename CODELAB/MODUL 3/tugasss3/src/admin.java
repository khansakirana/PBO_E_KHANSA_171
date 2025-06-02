class Admin extends User {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        // Memanggil konstruktor superclass (User)
        super(nama, nim);

        // nilai username dan password milik Admin
        this.username = username;
        this.password = password;
    }

    // Override method login khusus untuk Admin
    @Override
    public boolean login(String inputUsername, String inputPassword) {
        // Mengecek apakah username dan password cocok dengan data Admin
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    // Override method displayInfo untuk menampilkan data Admin
    @Override
    public void displayInfo() {
        System.out.println("Login sebagai Admin berhasil!");
        System.out.println("Nama: " + getNama()); // Menampilkan nama Admin
        System.out.println("NIM: " + getNim());   // Menampilkan NIM Admin
    }
}
