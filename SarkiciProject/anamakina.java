package SarkiciProject;

import java.util.Scanner;

public class anamakina {

    private static Sarkicilar sarkiciListesi = new Sarkicilar();
    private static Scanner sc  = new Scanner(System.in);    
        
    public static void islemleriBastir() {
        System.out.println("\t 0-)İslemleri goruntule");
        System.out.println("\t 1-)Sarkicilari Goruntule");
        System.out.println("\t 2-)Sarkici ekle");
        System.out.println("\t 3-)Sarkici guncelle");
        System.out.println("\t 4-)Sarkici Sil");
        System.out.println("\t 5-)Sarkici ara");
        System.out.println("\t 6-)Uygulamadan cik");

        
    }
    public static void sarkiciGoruntule()
    {
        sarkiciListesi.sarkicilariBastir();
    }
    public static void sarkiciekle() {
        System.out.print("Eklemek istediginiz sarkicinin ismini giriniz : ");
        String isim = sc.nextLine();
        sarkiciListesi.sarkiciEkle(isim);
        
    }
    public static void sarkciguncelle() {
        System.out.print("Guncellemek istediginiz pozisyon : ");
        int pozisyon = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Guncellemek istediginiz yeni ismi  giriniz : ");
        String yenIsim = sc.nextLine();

        sarkiciListesi.sarkici_guncelle(pozisyon-1, yenIsim);

        
    }
    public static void sil() {
        System.out.println("Silmek istediginiz pozisyon : ");
        int pozisyon = sc.nextInt();
        sc.nextLine();
        sarkiciListesi.sarkiciCikar(pozisyon);
        
    }
    public static void ara() {
        System.out.println("Aramak istediginiz sarkiciyi giriniz : ");
        String isim = sc.nextLine();
        sarkiciListesi.sarkiciAra(isim);
        
    }
    public static void main(String[] args) {

        System.out.println("\t Sarkici uygulamasına hosgeldiniz");
        islemleriBastir();

        boolean cikis = false;  
        int islem;
        while(!cikis)
        {
            System.out.print("Bir islem seciniz : ");
            islem = sc.nextInt();
            sc.nextLine(); 
            switch (islem) {
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    sarkiciGoruntule();
                    break;
                case 2:
                    sarkiciekle();
                    break;
                case 3:
                    sarkciguncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6: 
                    System.out.println("Cikis yapiliyor");
                    cikis = true;
                    break; 
                default:
                    System.out.println("Lutfen duzgun secim yapiniz");
                    break;
            }

        }
        
    }
    
}
