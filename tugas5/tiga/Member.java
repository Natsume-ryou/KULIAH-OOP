package tugas5.tiga;

public class Member {
    protected String nama;
    protected String alamat;

    public Member(){
        System.out.println("Inside Member: Constructor");
        nama="";
        alamat= "";
    }
    public Member (String nama,String alamat){
        this.nama =nama;
        this.alamat = alamat;
    }

    //methode//
    public void setNama (String n){
        this.nama =n;
    }
    public String getNama(){
        return nama;
    }

    public void setAlamat(String a){
        this.alamat=a;
    }
    public String getAlamat(){
        return alamat;
    }
}
