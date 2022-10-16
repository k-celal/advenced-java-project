package employess;

public class yonetici extends calisan {
    private int sorumlu_kisi;

    public yonetici(String ad, String soyad, int id, int maas, int sorumlu_kisi) {
        super(ad, soyad, id, maas);
        this.sorumlu_kisi = sorumlu_kisi;
    }

    public int getSorumlu_kisi() {
        return sorumlu_kisi;
    }

    public void setSorumlu_kisi(int sorumlu_kisi) {
        this.sorumlu_kisi = sorumlu_kisi;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Yoneticinin Sorumlu kisi sayisi : " + sorumlu_kisi);
    }
    public void zamyap(int zammiktar)
    {
        System.out.println(getAd() + " Adli yönetici Calisalara " + zammiktar + " tl zam yapti");
        System.out.println("Zamlanmis hali : " +  (getMaas() + zammiktar));
        
    } 
}
