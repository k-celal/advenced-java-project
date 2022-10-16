package Bayblade;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Beyblade Programina Hosgeldiniz");


        System.out.println("Cikis icin  q ya  basiniz");

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Hangi Beyblade üretmek istiyorsunuz\n" + "Dragon , Draciel , Dranza , Drayga");
            String islem = sc.nextLine();
            System.out.println("*******************************************");

            if(islem.equals("q"))
            {
                System.out.println("Programdan cikiliyor...");
                break;
            }
            else
            {
                beybladeuretim fabrika = new beybladeuretim();
                beyblade beyblade = fabrika.beybladeuret(islem);
                 
                if(beyblade == null)
                {
                    System.out.println("Lutfen gecerli bir beyblade adi giriniz");
                }
                else
                {
                    beyblade.bilgileri_goster();
                    beyblade.saldir();
                    beyblade.kutsal_canavar_mod_on();

                }

            }
            

        }
        sc.close();
    }
    
}
