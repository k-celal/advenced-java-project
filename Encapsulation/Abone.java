package Encapsulation;

public class Abone {

    public String isim;
    public String Sehir;
    public int bakiye;

    public void dogalgaz_kullan(int miktar)
    {
        if(bakiye - miktar < 0)
        {
            System.out.println("Bakiyeniz Yetersiz");

        }
        else
        {
            bakiye -=miktar;
            if(bakiye == 0)
            {
                System.out.println("bakiyeniz bitmiştir");
                System.out.println("En yakin bakiye yükleme merkezine gidip bakiye yükleyiniz Limit = 120 Tl");
            }
            else
            {
               
                System.out.println("Dogalgaz kullanildi kalan bakiye = " + bakiye);
            }
        }
    }
    public void bakiye_ogren()
    {
        System.out.println("Bakiyeniz : " + bakiye);
    }
}