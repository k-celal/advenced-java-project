package Encapsulation;

public class gelismis {

    private String isim;
    private String Sehir;
    private int bakiye = 120;

    public gelismis(String isim, String sehir, int bakiye) {
        this.isim = isim;
        this.Sehir = sehir;
        if(bakiye >= 0 && bakiye <=120)
        {
        this.bakiye = bakiye;

        }
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getSehir() {
        return Sehir;
    }
    public void setSehir(String sehir) {
        Sehir = sehir;
    }
    public int getBakiye() {
        return bakiye;
    }
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void dogalgaz_kullan(int miktar)
    {
        if(bakiye - miktar < 0)
        {
            System.out.println("Bakiyeniz Yetersiz");

        }
        else
        {
            
            if(bakiye == 0)
            {
                System.out.println("bakiyeniz bitmiştir");
                System.out.println("En yakin bakiye yükleme merkezine gidip bakiye yükleyiniz Limit = 120 Tl");
            }
            else
            {
                bakiye -=miktar;
                System.out.println("Dogalgaz kullanildi kalan bakiye = " + bakiye);
            }
        }
    }
    public void bakiye_ogren()
    {
        System.out.println("Bakiyeniz : " + bakiye);
    }
    public void bilgileri_goster()
    {
        System.out.println("Adiniz : " + getIsim());
        System.out.println("Sehiriniz : " + getSehir());
        System.out.println("Bakiyeniz : " + getBakiye());
    }
    public void bakiye_ekle(int miktar)
    {
        if(bakiye + miktar  <= 120)
        {
            setBakiye((bakiye+miktar));
        }
        else
        {
            
            setBakiye(120);
        }
    }
    
}
