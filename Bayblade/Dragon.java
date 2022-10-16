package Bayblade;

public class Dragon extends beyblade {
    private String kutsalcanavar;
    private String gizliyetenek;

    public Dragon(String beybladeci, int donushizi, int saldirigucu, String kutsalcanavar , String gizliyetenek) {
        super(beybladeci, donushizi, saldirigucu);
        this.kutsalcanavar = kutsalcanavar;
        this.gizliyetenek = gizliyetenek;
    }

    @Override
    public void bilgileri_goster() {
        
        super.bilgileri_goster();
        System.out.println("Kutsal Canavar Adı : " + kutsalcanavar);
        System.out.println("Gizli Yetenek : " + gizliyetenek);

    }

    @Override
    public void kutsal_canavar_mod_on() {
        
        System.out.println(getBeybladeci() + " " + kutsalcanavar + "'ı ortaya cıkarıyor ");
        System.out.println(getBeybladeci() + "ın saldirisi : Hayalet kasirgasi ");
        System.out.println("*******************************************");

    }
    
}
