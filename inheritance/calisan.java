package inheritance;

public class calisan { //Superclass Baseclass
    private String isim;
    private String departman;
    private int maas;

    public calisan(String isim, String departman, int maas) {
        this.isim = isim;
        this.departman = departman;
        this.maas = maas;
    }
    
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getdepartman() {
        return departman;
    }
    public void setdepartman(String departman) {
        this.isim = departman;
    }
    public int getMaas() {
        return maas;
    }
    public void setMaas(int maas) {
        this.maas = maas;
    }
    public void bilgilerigoster()
    {
        System.out.println("İsim : " + isim);
        System.out.println("Maas : " + maas);
        System.out.println("Departman : " + departman); 
    }
    public void calis()
    {
        System.out.println("Calisanlar calismaya basladi.");
    }
    public void departman_degistir(String new_departman)
    {
        System.out.println("Departman degistiriliyor");

        this.departman = new_departman;

        System.out.println("Yeni departman : " + this.departman);
    }
}
