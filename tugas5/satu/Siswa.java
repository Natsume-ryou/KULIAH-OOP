package tugas5.satu;

public class Siswa{
    protected String nama;
    protected String nis;
    protected String usia;
    protected String tgl_lahir;
    protected String alamat;

    public Siswa (){
        System.out.println("Inside siswa: Constructor");
        nama="";
        nis="";
        usia="";
        tgl_lahir="";
        alamat="";
    }

    public Siswa (String nama,String nis,String usia,String tgl_lahir,String alamat){
        this.nama = nama;
        this.nis = nis;
        this.usia = usia;
        this.tgl_lahir = tgl_lahir;
        this.alamat =alamat;
    }

    public void setNama (String nama){
        this.nama=nama;
    }
    public String getNama (){
        return nama;
    }

    public void setNis (String nis){
        this.nis=nis;
    }
    public String getNis (){
        return nis;
    }

    public void setUsia (String usia){
        this.usia=usia;
    }
    public String getUsia (){
        return usia;
    }

    public void setTgl_lahir(String tgl_lahir){
        this.tgl_lahir=tgl_lahir;
    }
    public String getTgl_lahir(){
        return tgl_lahir;
    }

    public void setAlamat (String alamat){
        this.alamat=alamat;
    }
    public String getAlamat (){
        return alamat;
    }

    
}
