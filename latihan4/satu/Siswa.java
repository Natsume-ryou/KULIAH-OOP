
package latihan4.satu;

public class Siswa {
    public static void main(String[] args) {
        DataSiswa datasiswa = new DataSiswa();
         
        datasiswa.setNama("Ruth");

        //menampilkan nama siswa//
        System.out.println(datasiswa.getNama());

        //menampilkan jumlah siswa//
        System.out.println("Jumlah Siswa    :"+ DataSiswa.getJumlahSiswa());

        class ReviewOverride extends DataSiswa{
            @Override
            public String getNama(){
                System.out.println("RUTH MERUPAKAN SISWA SEKOLAH INI");
                return nama;
            }
        }
    }
}
