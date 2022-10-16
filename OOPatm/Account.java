package OOPatm;

public class Account {
    String tcno;
    String kullanici_ad;
    String parola;
    double bakiye;

    



    public String getKullanici_ad() {
        return kullanici_ad;
    }




    public void setKullanici_ad(String kullanici_ad) {
        this.kullanici_ad = kullanici_ad;
    }




    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }




    public Account(String tcno, String kullanici_ad, String parola, double bakiye) {
        this.tcno = tcno;
        this.kullanici_ad = kullanici_ad;
        this.parola = parola;
        this.bakiye = bakiye;
    }




    public String getTcno() {
        return tcno;
    }


    public void setTcno(String tcno) {
        this.tcno = tcno;
    }


    public String getParola() {
        return parola;
    }


    public void setParola(String parola) {
        this.parola = parola;
    }


    public double getBakiye() {
        return bakiye;
    }


    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }


    public void parayatir(double miktar) {
        bakiye += miktar;
        System.out.println("Yeni bakiye = " + bakiye);
    }

    public void paracek(double miktar) {
        if (miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println("Yeni bakiye = " + bakiye);
        } else {
            System.out.println("Bakiye Yetersiz. Bakiye = " + bakiye);
        }
    }

}
