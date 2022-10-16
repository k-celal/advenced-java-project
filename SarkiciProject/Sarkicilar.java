package SarkiciProject;

import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> sarkiciListesi = new ArrayList<String>();
    
    public void sarkicilariBastir()
    {
        System.out.println("Sarkici Listesinde " + sarkiciListesi.size() + " kisi var. ");

        for (int i = 0; i < sarkiciListesi.size() ; i++) {
            System.out.println((i+1) + ".Sarkici : " + sarkiciListesi.get(i));
            
        }
    }
    public void sarkiciEkle(String isim)
    {
        sarkiciListesi.add(isim);
        System.out.println("Sarkici listesi guncelledi");
    }
    public void sarkiciCikar(int pozisyon)
    {
        String temp = sarkiciListesi.get(pozisyon);
        sarkiciListesi.remove(pozisyon);
        System.out.println(temp + " adli sarkici listeden cikarildi. ");
        System.out.println("Sarkici listesi guncelledi");
    }
    public void sarkici_guncelle(int pozisyon , String yenIsim) {
        String temp = sarkiciListesi.get(pozisyon);

        sarkiciListesi.set(pozisyon, yenIsim);

        System.out.println(temp + " adli sarkici " + yenIsim + " adla yenilendi." );
        
    }
    public void sarkiciAra(String isim) {

        if(sarkiciListesi.indexOf(isim) != -1 )
        {
            System.out.println("Aradiginiz sarkici : " + (sarkiciListesi.indexOf(isim)+1) + " pozisyonda bulunuyor");
        }
        else    
        {
            System.out.println(isim + " Adli sarkici bulunamadi ");
        }
    }
}
