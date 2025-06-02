class Mahasiswa extends User {

    // Konstruktor Mahasiswa
    public Mahasiswa(String nama, String nim) {
        // Memanggil konstruktor superclass (User) untuk set nilai nama dan nim
        super(nama, nim);
    }

    // Override method login untuk Mahasiswa
    @Override
    public boolean login(String inputNama, String inputNim) {
        // Mengecek apakah input nama dan nim sama dengan data Mahasiswa
        return getNama().equals(inputNama) && getNim().equals(inputNim);
    }

    // Override method displayinfo untuk Mahasiswa
    @Override
    public void displayInfo() {
        System.out.println("Login sebagai Mahasiswa berhasil!");
        System.out.println("Nama: " + getNama()); // Menampilkan nama Mahasiswa
        System.out.println("NIM: " + getNim());   // Menampilkan NIM Mahasiswa
    }
}
