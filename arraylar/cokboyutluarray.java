package arraylar;

import java.util.Scanner;

public class cokboyutluarray {

    public static void arraybastir(int[][] array ,int a , int b)
    {
        for(int i = 0 ; i < a; i++)
        {
            for(int j = 0; j < b  ;j++)
            {
                System.out.println(i + " " + j + ": " + array[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        
        int[][] array1 = new int[2][2];
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 2  ; i++)
        {
            for(int j = 0  ; j < 2 ; j++)
            {
                array1[i][j]= sc.nextInt();
            }
        }
        arraybastir(array1, 2, 2);
        sc.close();
        
    }
    
}
