package employess;

import java.util.Scanner;



public class anamakina {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calisanlar Programina Hosgeldiniz");
        String islemler = "İslemler...\n"
                          +"1.Yazilimci İslemleri\n"
                          +"2.Yonetici islemleri\n"
                          +"Cikis icin q basiniz";
        

        while(true)
        {
            System.out.println("*********************************");
            System.out.println(islemler);
            System.out.println("*********************************");
            System.out.println("İslemi seciniz: ");
            String islem = sc.nextLine();
            if(islem.equals("q")) 
            {
                System.out.println("Programdan Cikiliyor");
                break;
            }
            else if(islem.equals("1"))
            {
                yazlimci yzlm = new yazlimci("MuyuX", "Team", 002, 15000, "BackEnd");
                String yazilimciislem = "Yazilimci islemleri\n"
                                        +"1-)Format At\n"
                                        +"2-)Bilgileri Goster\n"
                                        +"Cikis icin q basiniz";
                System.out.println("*********************************");
                System.out.println(yazilimciislem);
                System.out.println("*********************************");
                while(true)
                {
                    System.out.println("İslemi seciniz: ");
                    String yzislem = sc.nextLine();
                    if(yzislem.equals("q")) 
                    {
                        System.out.println("Yazilimci islemlerinden Cikiliyor");
                        break;
                    }
                    else if(yzislem.equals("1"))
                    {
                        System.out.println("Format Atmak istediginiz isletim sistemi seciniz");
                        String yz_isletim_sistemi = "İsletim Sistemleri"
                                                    +"1-)Windows"
                                                    +"2-)MACOS"
                                                    +"3-)Linux";
                        System.out.println("*********************************");
                        System.out.println(yz_isletim_sistemi);
                        System.out.println("*********************************");                            
                        String isletim_sistemi= sc.nextLine();
                        if(isletim_sistemi.equals("1"))
                        {
                            isletim_sistemi = "Windows";
                            yzlm.formatAt(isletim_sistemi);
                        }
                        else if(isletim_sistemi.equals("2"))
                        {
                            isletim_sistemi = "MACOS";
                            yzlm.formatAt(isletim_sistemi);
                        }
                        else if(isletim_sistemi.equals("3"))
                        {
                            isletim_sistemi = "Linux";
                            yzlm.formatAt(isletim_sistemi);
                        }
                        else
                        {
                            System.out.println("Gecersiz islem");
                        }

                                         
                    }
                    else if(yzislem.equals("2"))
                    {
                        yzlm.bilgilerigoster();
                    }
                    else
                    {
                        System.out.println("Gecersiz islem");
                    }


                }
                

            }
            else if(islem.equals("2"))
            {
                yonetici ynt = new yonetici("Celal","Karahan",001, 20000, 10);
                String yoneticiislem = "Yonetici islemleri\n"
                                        +"1-)Zam Yap\n"
                                        +"2-)Bilgileri Goster\n"
                                        +"Cikis icin q basiniz";
                System.out.println("*********************************");
                System.out.println(yoneticiislem);
                System.out.println("*********************************");
                while (true) {
                    System.out.println("İslemi seciniz: ");
                    String yntislem = sc.nextLine();
                    
                    if(yntislem.equals("q"))
                    {
                        System.out.println("Yonetici islemlerinden Cikiliyor");
                        break;
                    }
                    else if(yntislem.equals("1"))
                    {
                        System.out.println("Yapmak İstediginiz Zam Miktarini Giriniz");;
                        int zammiktar = sc.nextInt();
                        sc.nextLine();
                        ynt.zamyap(zammiktar);
                    }
                    else if(yntislem.equals("2"))
                    {
                        ynt.bilgilerigoster();
                    }
                    else
                    {
                        System.out.println("Gecersiz İslem");
                    }
                
                }

            }
            else
            {
                System.out.println("Gecersiz islem" );;
            }
        }
        sc.close();
    }
}
