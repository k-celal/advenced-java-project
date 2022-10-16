package Bayblade;

public class beybladeuretim {
    public beyblade beybladeuret(String beyblade_turu)
    {
        if(beyblade_turu.equals("Dragon"))
        {
            return new Dragon("Takao", 800, 300, "Mavi Ejderya", "Kutsal Canavarla Konusma");

        }
        else if(beyblade_turu.equals("Draciel"))
        {
            return new dranza("Kai", 600, 400, "Kırmızı Anka Kusu");
        }
        else if(beyblade_turu.equals("Drayga"))
        {
            return new Draciel("Rei", 800, 250, "Beyaz Kaplan");
        }
        else if(beyblade_turu.equals("Dranza"))
        {
            return new dranza("Max", 400, 1000, "Kara Kaplumbağa");
        }
        else
        {
            return null;
        }
    }
    
}
