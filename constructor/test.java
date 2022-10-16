package constructor;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int secim = 0;
        double miktar;

        Scanner scanner = new Scanner(System.in);
        Account act1 = new Account();
        act1.sethesapNo("42174285");
        act1.setbakiye(1000.0);

        Account act2 = act1;//act2 artık act1 ile aynı referanstalar ayni bilgilere sahip aynı objeyi gösteriyolar
        

        while (secim != 'q') {
            System.out.println("Hangi hesapla islem yapmak istediginizi seciniz(cıkıs = q)");
            System.out.println("Hesap 1-)\nHesap No = " + act1.gethesapNo() + "\nBakiye = " + act1.getbakiye());
            System.out.println("Hesap 2-)\nHesap No = " + act2.gethesapNo() + "\nBakiye = " + act2.getbakiye());
            secim = scanner.nextInt();
            if (secim == 1) {
                System.out.println("Yapmak istediginiz islemi seciniz 1-)Para Yatir 2-)Para Cekme");
                secim = scanner.nextInt();
                switch (secim) {
                    case 1:
                        System.out.println("Yatırmak istediginiz miktari giriniz");
                        miktar = scanner.nextDouble();
                        act1.parayatir(miktar);
                        break;
                    case 2:
                        System.out.println("Cekmek istediginiz miktari giriniz");
                        miktar = scanner.nextDouble();
                        act1.paracek(miktar);
                        break;
                    default:
                        System.out.println("Lutfen duzgun secim yapiniz");
                        break;
                }
            } else if (secim == 2) {
                System.out.println("Yapmak istediginiz islemi seciniz 1-)Para Yatir 2-)Para Cekme");
                secim = scanner.nextInt();
                switch (secim) {
                    case 1:
                        System.out.println("Yatırmak istediginiz miktari giriniz");
                        miktar = scanner.nextDouble();
                        act2.parayatir(miktar);
                        break;
                    case 2:
                        System.out.println("Cekmek istediginiz miktari giriniz");
                        miktar = scanner.nextDouble();
                        act2.paracek(miktar);
                        break;
                    default:
                        System.out.println("Lutfen duzgun secim yapiniz");
                        break;
                }
            } else {
                System.out.println("Lutfen duzgun secim yapiniz");
            }
            scanner.close();
        }

    }

}
