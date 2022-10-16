package animals;

public class kopek extends hayvan {

    private int dis_sayisi;

    public kopek(String isim ,int kilo ,int boy , int bacak_sayisi ,int dis_sayisi)
    {
        super(isim, kilo, bacak_sayisi, boy);
        this.dis_sayisi = dis_sayisi ;
    }

    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
    public void harekete_gec(int hız)
    {
        System.out.println("Köpek " + hız + " ile hareket ediyor...");
    } 
    public void kos(int hız)
    {
        System.out.println("Kopek kosuyor");

        harekete_gec(hız);
    }
    
}
