package oopdevam;



public class object {
    public static void main(String[] args) {
      
        araba araba1 = new araba();

        araba1.setRenk("Kırmızı");
        araba1.setfiyat(100000);
        araba1.setkapilar(4);
        araba1.setmodel("renault");
        araba1.setmotor("1.6 motor");

        System.out.println("Arabanın rengi  = " + araba1.getRenk());
        System.out.println("Arabanin model = " + araba1.getmodel());
        System.out.println("Arabanin motor = " + araba1.getmotor());
        System.out.println("Arabanin kapilar = " + araba1.getkapilar());

        /*araba araba2 = null; //null pointer acces hatası verir çünkü bir objeye atamadık

        araba2.setRenk("kırmızı");
        
        System.out.println(araba2.getRenk()); */       
    }
    
}
