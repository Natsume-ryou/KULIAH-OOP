package tugas5.dua;

public class KonterChina extends HapeChina {
    public char koderam_rom = 'X';

    public KonterChina (){
        super.setHargaHP(4999999.0);
        super.setStokBrg(1000);
        super.setKeterangan("HAPE MURAH MERIAH DENGAN RAM 8/128");
    }
    
    public void InformasiKonterChina(){
        System.out.println("MERK HAPE   :"+ getMerk());
        System.out.println("Keterangan  :"+ getKeterangan());
        System.out.println("Kode RAM/ROM    :"+ koderam_rom);
        System.out.println("Harga HAPE  :"+ getHargaHP());
        System.out.println("Jumlah Stok yang ada    :"+ getStokBrg());
    }
    public static void main(String[] args) {
        KonterChina konterchina = new KonterChina();
        konterchina.InformasiKonterChina();
    }
}
