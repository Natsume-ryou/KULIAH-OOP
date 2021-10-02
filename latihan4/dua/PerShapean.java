package latihan4.dua;

abstract class PerShapean {
    private String value;

    PerShapean(String nama){
        value = nama;
    }
    
    public String getNama(){
        return value;
    }
    abstract float getArea();
}

class Lingkaran extends PerShapean {
    int jari_jari;
    Lingkaran(String nama){
        super(nama);
        jari_jari = 7;
    }
    float getArea(){
        float area;
        area = (float)(3.14*jari_jari*jari_jari);
        return area;
    }
}

class Persegi extends PerShapean{
    private int sisi;
    Persegi(String nama){
        super(nama);
        sisi =7;
    }
    float getArea(){
        float area;
        area = sisi*sisi;
        return area;
    }
}