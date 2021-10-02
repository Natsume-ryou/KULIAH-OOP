package tugas5.dua;

public class HapeChina {

    private int merk =0;
    private String keterangan = "- keterangan -";
    private double hargahape = 0.0;
    private int stokbrg = 0;
    private static int unik_merk=0;

    public HapeChina(){
        merk =unik_merk++;
    }

    public int getMerk(){
        return merk;
    }
    
    public void setKeterangan (String value){
        keterangan = value;
    }
    public String getKeterangan(){
        return keterangan;
    }

    public void setHargaHP (double h){
        hargahape=h;
    }
    public double getHargaHP(){
        return hargahape;
    }

    public void setStokBrg(int brg){
        stokbrg = brg;
    }
    public int getStokBrg(){
        return stokbrg;
    }
}
