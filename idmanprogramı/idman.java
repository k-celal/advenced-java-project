package idmanprogramı;



public class idman {
    private int  burpee_Sayi;
    private int sinav_sayi;
    private int mekik_sayi;
    private int squat_sayi;
    
    public idman(int burpee_Sayi, int sinav_sayi, int mekik_sayi, int squat_sayi) {
        this.burpee_Sayi = burpee_Sayi;
        this.sinav_sayi = sinav_sayi;
        this.mekik_sayi = mekik_sayi;
        this.squat_sayi = squat_sayi;
    }

    public int getBurpee_Sayi() {
        return burpee_Sayi;
    }

    public void setBurpee_Sayi(int burpee_Sayi) {
        this.burpee_Sayi = burpee_Sayi;
    }

    public int getSinav_sayi() {
        return sinav_sayi;
    }

    public void setSinav_sayi(int sinav_sayi) {
        this.sinav_sayi = sinav_sayi;
    }

    public int getMekik_sayi() {
        return mekik_sayi;
    }

    public void setMekik_sayi(int mekik_sayi) {
        this.mekik_sayi = mekik_sayi;
    }

    public int getSquat_sayi() {
        return squat_sayi;
    }

    public void setSquat_sayi(int squat_sayi) {
        this.squat_sayi = squat_sayi;
    }
    public void hareketyap(String hareketTuru , int sayi)
    {
        if(hareketTuru.equals("Burpee"))
        {
            burpeeYap(sayi);
        }
        else if(hareketTuru.equals("Sinav"))
        {
            sinavYap(sayi);
        }
        else if(hareketTuru.equals("Mekik"))
        {
            mekikYap(sayi);
        }
        else if(hareketTuru.equals("Squat"))
        {
            SquatYap(sayi);
        }
        else
        {
            System.out.println("Gecersiz Hareket...");
        }

    }
    public void burpeeYap(int sayi)
    {
        if(burpee_Sayi == 0)
        {
            System.out.println("Yapacak Burpee Kalmadi");
        }
        if(burpee_Sayi - sayi < 0)
        {
            System.out.println("Hedefledigin Burpee sayisini " + (sayi - burpee_Sayi) + " tane gectin tebrikler");
            burpee_Sayi =  0 ; 
            System.out.println("Kalan Burpee : " + burpee_Sayi );
        }
        else
        {
            burpee_Sayi -= sayi;
            System.out.println("Kalan Burpee sayisi  : " + burpee_Sayi);
        }
    }
    public void sinavYap(int sayi)
    {
        if(sinav_sayi == 0)
        {
            System.out.println("Yapacak sinav Kalmadi");
        }
        if(sinav_sayi - sayi < 0)
        {
            System.out.println("Hedefledigin sinav sayisini " + (sayi - sinav_sayi) + " tane gectin tebrikler");
            sinav_sayi =  0 ;
            System.out.println("Kalan Sinav : " + sinav_sayi );
        }
        else
        {
            sinav_sayi -= sayi;
            System.out.println("Kalan Sinav sayisi  : " + sinav_sayi);
        }
    }
    public void mekikYap(int sayi)
    {
        if(mekik_sayi == 0)
        {
            System.out.println("Yapacak mekik Kalmadi");
        }
        if(mekik_sayi - sayi < 0)
        {
            System.out.println("Hedefledigin mekik sayisini " + (sayi - mekik_sayi) + " tane gectin tebrikler");
            mekik_sayi =  0 ; 
            System.out.println("Kalan mekik : " + mekik_sayi );
        }
        else
        {
            mekik_sayi -= sayi;
            System.out.println("Kalan mekik sayisi  : " + mekik_sayi);
        }
    }
    public void SquatYap(int sayi)
    {
        if(squat_sayi == 0)
        {
            System.out.println("Yapacak squat Kalmadi");
        }
        if(squat_sayi - sayi < 0)
        {
            System.out.println("Hedefledigin squat sayisini " + (sayi - squat_sayi) + " tane gectin tebrikler");
            squat_sayi =  0 ; 
            System.out.println("Kalan squat : " + squat_sayi );
        }
        else
        {
            squat_sayi -= sayi;
            System.out.println("Kalan squat sayisi  : " + squat_sayi);
        }
    }
    public boolean idmanbittimi()
    {
        
        return(burpee_Sayi == 0 && sinav_sayi == 0 && mekik_sayi == 0 && squat_sayi == 0);
    }
    
}   
