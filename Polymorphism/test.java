package Polymorphism;



class Hayvan {
    private String isim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public void konustur() {
        System.out.println("Hayvan Konuşuyor");
    }

}

class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public void konustur() {

        System.out.println(super.getIsim() + "Miyavliyor");
    }

}

class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public void konustur() {
        
        System.out.println(super.getIsim() + "Havlıyor");
    }
    
    
}
class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }

    @Override
    public void konustur() {
        
        System.out.println(super.getIsim() + "Kisniyor");
      
    }
    
}
public class test {
    public static void konus_method(Hayvan hayvan){
        hayvan.konustur();// poylmorphism olmasa tek tek kontrol gerekecekti instance of kullanarak


    }
    public static void main(String[] args) {
        Hayvan hayvan1 = new Kedi("Tekir");
        Hayvan hayvan2 = new Kopek("Karabas");
        Hayvan hayvan3 = new At("Şahbatur");

        if(hayvan1 instanceof Kedi) // instanceof objenin hangi sınıftan olduğunu söyler
        {
            System.out.println(hayvan1.getIsim() + " Bir kedidir");
            
        }

        
        konus_method(hayvan1);
        konus_method(hayvan2);
        konus_method(hayvan3);

    
    }

    
}
