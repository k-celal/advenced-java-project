package Bayblade;

public class beyblade {

    private String beybladeci;
    private int donushizi;
    private int  saldirigucu;
    
    public beyblade(String beybladeci, int donushizi, int saldirigucu) {
        this.beybladeci = beybladeci;
        this.donushizi = donushizi;
        this.saldirigucu = saldirigucu;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonushizi() {
        return donushizi;
    }

    public void setDonushizi(int donushizi) {
        this.donushizi = donushizi;
    }

    public int getSaldirigucu() {
        return saldirigucu;
    }

    public void setSaldirigucu(int saldirigucu) {
        this.saldirigucu = saldirigucu;
    }

    public void saldir(){
        System.out.println(getBeybladeci() + " " + saldirigucu + " ve " + donushizi + " ile saldiriyor. ");
    }

    public void kutsal_canavar_mod_on(){
        System.out.println("Bu beyblade nin kutsal canavari bulunmuyor");

    }
    public void bilgileri_goster(){
        System.out.println("Beybladeci adi : " + getBeybladeci());
        System.out.println("Saldiri Gucu : " + getSaldirigucu());
        System.out.println("Donus hizi : " + getDonushizi());

    }
    
}
