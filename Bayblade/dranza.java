package Bayblade;

public class dranza extends beyblade{
    private String kutsalcanavar;

    public dranza(String beybladeci, int donushizi, int saldirigucu, String kutsalcanavar) {
        super(beybladeci, donushizi, saldirigucu);
        this.kutsalcanavar = kutsalcanavar;
    }

    @Override
    public void bilgileri_goster() {
        
        super.bilgileri_goster();

        System.out.println("Kutsal Canavar Adı : " + kutsalcanavar);
    }

    @Override
    public void kutsal_canavar_mod_on() {
        System.out.println(getBeybladeci() + " " + kutsalcanavar + "'ı ortaya cıkarıyor ");
        System.out.println(getBeybladeci() + "ın saldırısı : Alev kılıcı");
        System.out.println("*******************************************");

        
    }

    

    
    
}
