package SehirTuru;

import java.util.LinkedList;
import java.util.ListIterator;

public class test {

        public static void sehirleriTurla(LinkedList<String> sehirTuru) {
            ListIterator<String> ıterator = sehirTuru.listIterator();

            System.out.println(ıterator);

            
            
        }

    public static void main(String[] args) {

        LinkedList<String> sehirTuru = new LinkedList<String>();

        sehirTuru.add("Ankara");
        sehirTuru.add("Nigde");
        sehirTuru.add("Sanliurfa");
        sehirTuru.add("Trabzon");
        sehirTuru.add("Hatay");




    }
    
}
