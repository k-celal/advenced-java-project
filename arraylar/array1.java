package arraylar;


import java.util.Scanner;

public class array1 {

    public static void diziyibastir(int[] array)
    {
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.println((i+1) + ". eleman: " + array[i]);
        }
    }
    public static  double ortbul(int[] array)
    {
        int top = 0 , i;
        double ort;
        for( i = 0; i< array.length ; i++)
        {
            top += array[i];
        }
        
        ort = (double)top/array.length;
        return ort;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        int[] b = {10,20,30,40,50,60,70,80,90};
        
        for(int i = 0; i<10 ; i++)
        {
            System.out.print((i + 1) + ". elamani giriniz: " );
            a[i] = sc.nextInt();
        }
        System.out.println("-----------------------------------");

        diziyibastir(a);
        System.out.println("-----------------------------------");

        diziyibastir(b);
        System.out.println("Dizisinin elemanarinin ortalamasi : " + ortbul(b));

        sc.close();


        
        
    }
    
}
