package OOPatm;

import java.util.Scanner;

public class atm {

    public void calis(Account act) {
        int giris_hak = 3;
        String secim;
        double miktar;
        login log = new login();

        Scanner sc = new Scanner(System.in);

        System.out.println("------Bankamiza Hos Geldiniz------");
        System.out.println("**********************************");
        System.out.println("Kullanici Girisi");
        System.out.println("**********************************");
        while (true) {
            if (log.kontrol(act)) {
                System.out.println("Giris Basarili");
                System.out.println("Hosgeldiniz " + act.kullanici_ad);
                break;
            } else {
                System.out.println("Giris basarisiz");
                giris_hak -= 1;
                System.out.println("Kalan Giris hak " + giris_hak);
            }
            if (giris_hak == 0) {
                sc.close();
                System.out.println("Giris hakki bitti");
                return;

            }
        }
        System.out.println("**********************************");
        String islemler = "Yapmak İstediginiz İslemi Seciniz\n1-)Bakiye Görüntüle\n2-)Para Cek\n3-)Para Yatir\nq-)Cikis";
        
        while (true) {
            System.out.println(islemler);
            System.out.print("islemi seciniz : ");
            secim = sc.nextLine();
            


            if (secim.equals("1")) {
                System.out.println("Bakiyeniz  : " + act.getBakiye());

            } else if (secim.equals("2")) {
                System.out.println("Lutfen cekmek istediginiz miktari giriniz");
                miktar = sc.nextInt();
                sc.nextLine();
                act.paracek(miktar);

            } else if (secim.equals("3")) {
                System.out.println("Lutfen yatirmak istediginiz miktari giriniz");
                miktar = sc.nextInt();
                sc.nextLine();
                act.parayatir(miktar);

            } else if (secim.equals("q")) {
                System.out.println("Cikis yapiliyor...");
                break;
            }
            else
            {
                System.out.println("Gecersiz islem");
            }

        }
        sc.close();

    }
}
