package oopgiris;

import java.util.Scanner;

public class object {
    public static void main(String[] args) {
        araba araba1 = new araba();
        Scanner scan = new Scanner(System.in);
        araba1.renk="kırmızı";
        araba1.model="Opel Astra";
        araba1.motor="1.6";
        araba1.kapilar = 4;  
        System.out.println("Arabanin rengi = " + araba1.renk);
        
        System.out.println("Arabanin model = " + araba1.model);
        System.out.println("Arabanin motor = " + araba1.motor);
        System.out.println("Arabanin kapilar = " + araba1.kapilar);
        System.out.println("Lutfen arabaniza vermek istediginiz fiyati giriniz");
        araba1.fiyat= scan.nextInt();
        System.out.println("Arabanin fiyat = " + araba1.fiyat);
        scan.close();
    
        
    }
    
}
