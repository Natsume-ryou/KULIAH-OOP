package latihan4.satu;

public class DataSiswa {
    public String nama;
    private String alamat;
    private double nilai_mtk;
    private double nilai_ipa;
    private double nilai_inggris;
    private double nilai_indonesia;
    private double rerata;
    private static int jml_siswa;

    public String getNama(){
        return nama;
    }
    public void setNama(String value){
        this.nama =value;
    }

    //menghitung rerata//

    public double getRerata(){
        double hasil = 0;
        hasil = (nilai_mtk+nilai_ipa+nilai_inggris+nilai_indonesia)/4;
        return hasil;
    }
    
    public static int getJumlahSiswa(){
        return jml_siswa;
    }


}
  
