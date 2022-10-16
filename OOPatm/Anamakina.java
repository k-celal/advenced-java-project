package OOPatm;

public class Anamakina {
    public static void main(String[] args) {
        
        atm atm = new atm();
        Account act1 = new Account("421728", "Celal Karahan", "159753", 2000.0);
        atm.calis(act1);
        System.out.println("Program Sonlaniyor...");
    }
    
}
