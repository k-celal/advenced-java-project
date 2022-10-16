package constructor;

public class Account {
    private String hesapNo;
    private double bakiye;

    public Account()
    {
        //System.out.println("Kendi Constructorumuz...");
        /*this.hesapNo = "bilgi yok";
        this.bakiye  = 0.0;*/
        this("Bilgi Yok" , 0.0);
        


    }
    public Account(String hesapNo,double bakiye)
    {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
    }

    public void sethesapNo(String hesapNo)
    {
        this.hesapNo = hesapNo;
    }
    public String gethesapNo()
    {
        return this.hesapNo;
    }
    public void setbakiye(double bakiye)
    {
        this.bakiye = bakiye;
    }
    public double getbakiye()
    {
        return this.bakiye;
    }
    public void parayatir(double miktar)
    {
        bakiye += miktar;
        System.out.println("Yeni bakiye = " + bakiye);
    }
    public void paracek(double miktar)
    {
        if(miktar<=bakiye)
        {
            bakiye -= miktar;
            System.out.println("Yeni bakiye = " + bakiye);
        }
        else
        {
            System.out.println("Bakiye Yetersiz. Bakiye = " + bakiye);
        }
    }
}
