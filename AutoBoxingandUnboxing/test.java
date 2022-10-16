package AutoBoxingandUnboxing;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        
        /*
        boolean ->  Boolean
        char -> Character
        byte -> Byte
        short -> Short
        int -> Integer
        long -> Long
        float -> Float
        double -> Double
        */

        //int a = 5; // ozelliksiz ilkel veri tipi
        //Integer b = 5; // ozellikli olur b 
        ArrayList<Double>  arrayList1 = new ArrayList<Double>(); // Double yerine double yazzsak hata verir
        
        for (int i = 0; i < 10; i++) {
            arrayList1.add(Double.valueOf(i*4)); // AutoBoxing //Java otomatik yapar
        }
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i).doubleValue()); //unboxing //Java otomatik yapar
            
        }
    }
    
}
