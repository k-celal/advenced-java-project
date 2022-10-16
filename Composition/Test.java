package Composition;

public class Test {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920, 1080);

        Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);

        Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Temperli Cam");

        Anakart anakart = new Anakart("B450M", "Gigabyte", 10, "Windows");

        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);

        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().moniyoru_kapat();
        pc.getAnakart().isletim_sistemi_yukle("Ubuntu");
    }
    
}
