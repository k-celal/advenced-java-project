package Encapsulation;

import java.util.Scanner;



public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*Abone abone1 = new Abone();
        abone1.isim = "Celal";
        abone1.bakiye = 200;
        abone1.Sehir  = "Nigde";

        abone1.dogalgaz_kullan(200);*/

        //gelismis abone2 = new gelismis("Celal", "Ankara", 100); // 500 ü kabul etmeyecek 120 olarak geçecek

        System.out.println("Dogalgaz sistemine hosgeldiniz");
        System.out.print("Adınızı giriniz : ");
        String isim = sc.nextLine();
        System.out.print("Şehrinizi giriniz : ");
        String sehir = sc.nextLine();
        System.out.print("Bakiye giriniz(120 den fazla girerseniz 120 sayilacaktır) : ");
        int bakiye = sc.nextInt();
        sc.nextLine();

        gelismis abn1 = new gelismis(isim,sehir, bakiye);

        //abone2.dogalgaz_kullan(119);
       while(true)
       {
           System.out.println("Yapmak istediginiz islemi seciniz\n1-)Dogalgaz Kullan\n2-)Bilgileri Goruntule\n3-)Bakiye Ogren\n4-)Bakiye Ekle\nq-)Cikis");
           String secim = sc.nextLine();
           if(secim.equals("q"))
           {
               System.out.println("Cikis yapiliyor...");
               break;
           }
           else if(secim.equals("1"))
           {
                System.out.println("Kullamak istediginiz dogalgaz miktarini giriniz");
                int miktar = sc.nextInt();
                sc.nextLine();
                abn1.dogalgaz_kullan(miktar);
           }
           else if(secim.equals("2"))
           {
                abn1.bilgileri_goster();
           }
           else if(secim.equals("3"))
           {
               abn1.bakiye_ogren();
           }
           else if(secim.equals("4"))
           {
               System.out.println("Eklemek istediginiz bakiyeyi giriniz");
               int miktar2 = sc.nextInt();
               sc.nextLine();
               abn1.bakiye_ekle(miktar2);
           }
       }

        System.out.println("Kullamak istediginiz dogalgaz miktarini giriniz");
        int miktar = sc.nextInt();
        abn1.dogalgaz_kullan(miktar);
        sc.close();

    }
    
}
