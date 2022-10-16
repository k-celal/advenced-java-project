package OOPatm;

import java.util.Scanner;

public class login {

    public boolean kontrol(Account act) {

        Scanner scan = new Scanner(System.in);
        try {

            String tcno;
            String parola;

            System.out.println("Tc No Giriniz: ");
            tcno = scan.nextLine();

            System.out.println("Sifre giriniz: ");
            parola = scan.nextLine();

            if (act.getTcno().equals(tcno) && act.getParola().equals(parola)) {

                return true;
            } else {
                return false;
            }
        } finally {
            scan.close();
        }

    }

}