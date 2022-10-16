package employess;


public class calisan {

    private String ad;
    private String soyad;
    private int id;
    private int maas;
    public calisan(String ad, String soyad, int id, int maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
        this.maas = maas;
    }
    
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void bilgilerigoster()
    {
        System.out.println("Calisan Bilgileri");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Id: " +id);
        System.out.println("Maas: " + maas);
    }

    
}
