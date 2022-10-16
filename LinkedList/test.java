package LinkedList;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("Celal");
        array.add("Hasan");
        array.add("Ahmet");
        array.add("Mehmet");
        array.add("Harezmi");
        for (String string : array) {
            System.out.println(string);
        }
        System.out.println("************************");
        array.add(3, "Selami"); //eklemek istedigimiz indeksi yazabiliriz
        for (String string : array) {
            System.out.println(string);
        }
        /*Peki linked list ne işe yarar arraylistlerde araya bir eleman ekleneceği zaman eklenen kısmın altı bir aşağı kayar
        ve performans kaybı olur linked listler sırali obje gibi çalıştığından araya eklemek sadece 3 tane objeyi ilgilendirir
        bu yüzden avantıjlıdır fakat linked listin dezavantajı çok hafıza kaplar çünkü her biri objedir*/

        
    }
     
    
}
