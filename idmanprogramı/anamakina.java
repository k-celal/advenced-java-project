package idmanprogramı;

import java.util.Scanner;

public class anamakina {

    
      

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("---İdman Programına Hosgeldiniz---");
        System.out.println("*****************************");

        String idmanlar = "Gecerli hareketler...\n"
                        +"Burpee\n"
                        +"Sinav\n"
                        +"Mekik\n"
                        +"Squat\n";
        
        System.out.println(idmanlar);

        System.out.println("Bir idman olusturun...");
        System.out.print("Burpee sayisi : ");
        int burpee = sc.nextInt();
        System.out.print("Sinav sayisi : ");
        int sinav = sc.nextInt();
        System.out.print("Mekik sayisi : ");
        int mekik = sc.nextInt();
        System.out.print("Squat sayisi : ");
        int squat = sc.nextInt();
        sc.nextLine();

        idman idm  = new idman(burpee, sinav, mekik, squat);

        System.out.println("İdmanınız olusturuldu ve basliyor...");
        
        
        while(idm.idmanbittimi() == false)
        {
            System.out.println("*********************************************");
            System.out.println("Kalan İdman bilgileri : ");
            System.out.print("Burpee sayisi : " + idm.getBurpee_Sayi() + "\n");
            System.out.print("Sinav sayisi : " + idm.getSinav_sayi() + "\n");
            System.out.print("Mekik sayisi : " + idm.getMekik_sayi() + "\n");
            System.out.print("Squat sayisi : " + idm.getSquat_sayi() + "\n");
            System.out.println("*********************************************");
            
            System.out.print("Hareket türü(Burpee,Sinav,Mekik,Squat) : ");
            String tur = sc.nextLine();
            System.out.print("Bu hareketten kac tane yapicaksiniz  : ");
            int sayi = sc.nextInt();
            sc.nextLine();// hata vermesin diye genelde yapilir
            idm.hareketyap(tur, sayi);
            
            
            if(burpee == 0 && sinav == 0 && mekik == 0 && squat == 0)
            {
                System.out.println("idmaniniz bitmistir tesekkürler");;
            }
            
        }
        sc.close();

    }
    

    
}
