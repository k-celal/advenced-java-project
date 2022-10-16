package animals;

public class hayvan {
    private String isim;
    private int kilo;
    private int bacak_sayisi;
    private int boy;


    public hayvan(String isim, int kilo, int bacak_sayisi, int boy) {
        this.isim = isim;
        this.kilo = kilo;
        this.bacak_sayisi = bacak_sayisi;
        this.boy = boy;
    }
    public void yemek_ye()
    {
        System.out.println("Hayvan su an yemek yiyor");
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public int getKilo() {
        return kilo;
    }
    public void setKilo(int kilo) {
        this.kilo = kilo;
    }
    public int getBacak_sayisi() {
        return bacak_sayisi;
    }
    public void setBacak_sayisi(int bacak_sayisi) {
        this.bacak_sayisi = bacak_sayisi;
    }
    public int getBoy() {
        return boy;
    }
    public void setBoy(int boy) {
        this.boy = boy;
    }
    public void harekete_gec(int hız)
    {
        System.out.println("Hayvan " + hız + " ile hareket ediyor...");
    } 
    
}
