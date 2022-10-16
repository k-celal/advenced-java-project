package inheritance;

public class yonetici extends calisan{

        private int kackisi; 

    public yonetici(String isim, String departman, int maas , int kackisi) {
        super(isim, departman, maas);
        this.kackisi  = kackisi;
    }
    public void zamyap(int zam_miktar)
    {
        System.out.println("Calisanlara " + zam_miktar + "tl kadar zam yapildi");
    }
    public void bilgilerigoster()//calisan icindeki iptal olur bu kullanılır
    {
        /*System.out.println("İsim : " + getIsim()); // ya böyle yapılır yada asagidaki gibi
        System.out.println("Maas : " + getMaas());
        System.out.println("Departman : " + getdepartman()); */
        super.bilgilerigoster();
        System.out.println("Altında " + kackisi + " kadar kisi calisiyor");
    }

    

    
}
