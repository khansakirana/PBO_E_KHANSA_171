package demoWaktu;

class waktu
{
    //atribut
    public int jam = 10;
    public int menit = 40;
    public int detik = 30;

    //buat method getJam --> mengembalikan jam jika
    //nilai jam dimasukan sesuai dengan format jam

    public int getJam()
    {
        if(jam>0 && jam<23)
        {
            return jam;
        }
        else
        {
            return 0;
        }
    }

    public int getMenit()
    {
            if (menit>0 && menit<60)
            {
                return menit;
            }
            else
            {
                return 0;
            }

    }

    public int getDetik()
    {
        if (detik>0 && detik<60)
        {
            return detik;
        }
        else
        {
        return 0;
    }
}
    //method cetak
    public void cetakWaktu()
    {
        System.out.println("Jam : "+getJam()+"Menit : "+getMenit()+"Detik : "+getDetik()  );
    }
}

public class demoWaktu
{
    public static void main(String[] args) {
        //pembentukan objek
        //nama class nama objek = new nama class();   }
        waktu objWaktu = new waktu();
        //cara pemanggilan mwthod cetakWaktu
        objWaktu.cetakWaktu();
    }
}