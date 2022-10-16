package StringClass;

public class test {

    public static void main(String[] args) {
        
        String b = new String("Celal Karahan");// iki şekilde de tanımlanabilirler
        System.out.println("Harf Sayisi" + b.length());
        
        System.out.println("İlk harf : " + b.charAt(0));
        System.out.println("Son harf : " + b.charAt(b.length()-1));

        for (int i = 0; i < b.length(); i++) {

            System.out.println(b.charAt(i));
            
        }

        System.out.println(b.startsWith("Ce")); //Başlıyor mu anlamına gelir başlıyosa true döner

        System.out.println(b.endsWith("an")); // bitiyor mu anlamına gelir bitiyosa true döner
        
        System.out.println(b.indexOf("b"));//harfi arar ilk gördüğünde durur yoksa -1 dönderir
        
        System.out.println(b.lastIndexOf("a"));//aramaya tersten başlar ilk gördügünde durur yoksa -1    

        System.out.println(b.toLowerCase()); // tüm harfleri kücültür

        System.out.println(b.toUpperCase());//tüm harfleri büyütür

        String a = "1907";
        int c = Integer.parseInt(a);//String i integere cevirdi
        System.out.println(c);

        int b1 = 1999;
        String c1 = String.valueOf(b1);
        System.out.println(c1);

        String a1  = "Celal";
        String a2 ="Celal";
        if(a1 == a2)//aynı referanstanmış gibi gorunur true döner //ama yinede a1.equals(a2) kullan
        {
            System.out.println("eşitler");
        }

        String d1  =new String("Celal");
        String d2 =new String("Celal");
        if(d1 == d2)//farklı referans false döner true donmesi icin b1.equals(b2)
        {
            System.out.println("eşitler");
        }

    }

    
}
