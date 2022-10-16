package arraylar;

import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static int[] array_doldur(int sayi)
    {
        Scanner sc = new Scanner(System.in);
        int[] cikti = new int[sayi];
        for(int i = 0 ; i <sayi ; i++ )
        {
            System.out.print((i+1) +  ". elaman: ");
            cikti[i] = sc.nextInt();
        }
        sc.close();
        return cikti;
    }

    public static void array_sirala(int[] array)
    {
        Arrays.sort(array);
    }
    
    public static void array_bastir(int[] array)
    {
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.println((i+1) +  ". elaman: " + array[i]);

        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kac elemanli bir dizi olusturacaksınız");
        int buyukluk = sc.nextInt();
        int[] i = array_doldur(buyukluk);
        int[] a  = {15,25,35};
        
        array_bastir(i);
        System.out.println("-----Dizi Sıralanmis hali-----");
        array_sirala(i);
        array_bastir(i);
        sc.close();

        if(Arrays.equals(a, i)) // a == i şeklinde sorgularsak farklı referans olduğu için else durumuna girer arrays.equals(a , i ) biçiminde sorgulamak gerek 
        {
            System.out.println("Diziler esittir");
        }
        else
        {
            System.out.println("Diziler esit degildir");
        }

    }
    
}
