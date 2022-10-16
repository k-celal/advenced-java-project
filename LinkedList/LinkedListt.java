package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListt {

    public static void diziyiBatir(LinkedList<String> yapilacak_isler) {

        /*for (String string : yapilacak_isler) {
            System.out.println(string);
        }
        */
        ListIterator<String> It = yapilacak_isler.listIterator();
            
        while(It.hasNext()) //ıT HERHANGİ BİR OBJE GÖSTERİYOMU TRUE VEYA FALSE
        {
            System.out.println(It.next());
        }

        
    }
    public static void siraliekle(LinkedList<String> yapilacak_isler ,String yeni) {
        ListIterator<String> It = yapilacak_isler.listIterator();

        while(It.hasNext())
        {
            int karsilastir = It.next().compareTo(yeni);

            if(karsilastir == 0)
            {
                //iki deger esit
                System.out.println("Listenizde bu eleman zaten var");
                return;
            }
            else if(karsilastir < 0)
            {
                //yeni deger It.next den daha buyuk
            }
            else
            {
                It.previous();  
                It.add(yeni);
                return;
            }    

        }
        It.add(yeni);

        
    }
    public static void main(String[] args) {

        LinkedList<String> yapilacak_isler = new LinkedList<String>();
        
        /*yapilacak_isler.add("Duj");
        yapilacak_isler.add("Okul");
        yapilacak_isler.add("Ders");
        yapilacak_isler.add("Market");
        yapilacak_isler.add("Oyun");
        yapilacak_isler.add("Calisma");

        diziyiBatir(yapilacak_isler);
        System.out.println("---------------------");

        yapilacak_isler.add(5,"Kitap okuma");
        diziyiBatir(yapilacak_isler);*/

        siraliekle(yapilacak_isler, "Okul");
        siraliekle(yapilacak_isler,"Ders");
        siraliekle(yapilacak_isler,"Kitap okuma");
        siraliekle(yapilacak_isler,"Uyuma");

        diziyiBatir(yapilacak_isler);
        
        
    }
    
}
