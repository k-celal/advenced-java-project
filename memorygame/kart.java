package memorygame;

public class kart {

    private char deger ;
    private boolean tahmin = false;
    
    public kart(char deger) {
        this.deger = deger;
    }

    public char getDeger() {
        return deger;
    }

    public void setDeger(char deger) {
        this.deger = deger;
    }

    public boolean isTahmin() {
        return tahmin;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
    
    //private int[][] kart = new int[3][3];
    
    
    

    
}
