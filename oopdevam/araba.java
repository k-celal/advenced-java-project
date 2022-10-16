package oopdevam;

public class araba {
    private String renk;
    private String model;
    private int kapilar;
    private String motor;
    private int fiyat;

    public void setRenk(String renk)
    {
        this.renk =renk;//this dememizin sebebi karışması bunun yerine modeldeki biçimde yapabiliriz.
    }
    
    public String getRenk()
    {
        return this.renk;
    }
    public void setmodel(String modelasd)
    {
        model =modelasd;
    }
    
    public String getmodel()
    {
        return this.model;
    }
    public void setkapilar(int kapilar)
    {
        if(kapilar <= 0)
        {
            System.out.println("Kapi sayisi bu degerde olamaz");

        }
        else
        {
        this.kapilar = kapilar;
        }
    }
    
    public int getkapilar()
    {
        return this.kapilar;
    }
    public void setmotor(String motor)
    {
        this.motor =motor;
    }
    
    public String getmotor()
    {
        return this.motor;
    }
    public void setfiyat(int fiyat)
    {
        if(fiyat <= 0)
        {
            System.out.println("Fiyat bu degerde olamaz");

        }
        else
        {
        this.fiyat = fiyat;

        }
    }
    
    public int getfiyat()
    {
        return this.fiyat;
    }

    
    
    
}
