package employess;

public class yazlimci extends calisan{

    private String alan;

    public yazlimci(String ad, String soyad, int id, int maas, String alan) {
        super(ad, soyad, id, maas);
        this.alan = alan;
    }

    public void formatAt(String isletim_sistemi)
    {
        System.out.println(getAd() + " Adli Yazilimci " + isletim_sistemi + " yukluyor");
    }
    
    @Override
        public void bilgilerigoster()
        {
            super.bilgilerigoster();
            System.out.println("Yazilimcinin Alani: " + alan);

        }

}
