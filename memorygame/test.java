package memorygame;

import java.util.Scanner;

public class test {
    static Scanner sc = new Scanner(System.in);
    private static kart[][] kart1 = new kart[4][4];

    public static void main(String[] args) {

        //kart[][] kart1 = new kart[4][4];

        kart1[0][0] = new kart('E');
        kart1[0][1] = new kart('A');
        kart1[0][2] = new kart('B');
        kart1[0][3] = new kart('F');
        kart1[1][0] = new kart('G');
        kart1[1][1] = new kart('A');
        kart1[1][2] = new kart('D');
        kart1[1][3] = new kart('H');
        kart1[2][0] = new kart('F');
        kart1[2][1] = new kart('C');
        kart1[2][2] = new kart('D');
        kart1[2][3] = new kart('H');
        kart1[3][0] = new kart('E');
        kart1[3][1] = new kart('G');
        kart1[3][2] = new kart('B');
        kart1[3][3] = new kart('C');

        while (oyunBittiMi() == false) {
        
            oyunTahtasi();
            tahminEt();
        }

        
    
    }
    public static void tahminEt()
    {
        
        System.out.print("Birinci tahminin i ve j degerlerini bir boşluklu giriniz : ");
        int i1 = sc.nextInt();
        int j1 = sc.nextInt();
        sc.nextLine();
        kart1[i1][j1].setTahmin(true);
        oyunTahtasi();
        System.out.print("ikinci tahminin i ve j degerlerini bir boşluklu giriniz : ");
        int i2 = sc.nextInt();
        
        int j2 = sc.nextInt();
        sc.nextLine();
        if(kart1[i1][j1].getDeger()  == kart1[i2][j2].getDeger())
        {
            System.out.println("Doğru bildiniz");
            kart1[i2][j2].setTahmin(true);
        }
        else
        {
            System.out.println("Yanlis secim");
            kart1[i1][j1].setTahmin(false);
        }
        
    }
    public static boolean oyunBittiMi()
    {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if(kart1[i][j].isTahmin() == false)
                {
                    return false;
                }
                
            }
        }
        return true;
    }

    public static void oyunTahtasi() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kart1[i][j].isTahmin()) {
                    System.out.print(" |" + kart1[i][j].getDeger() + "| ");
                } else {
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }

    }

    
}
