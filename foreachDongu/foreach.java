package foreachDongu;

public class foreach {
    public static void main(String[] args) {
        String[]  array = {"elma" , "armut" , "kiraz"};
        int [] array2 =  {1,2,3,4,5};
        deneme[] array3 = {new deneme("Mustafa") , new deneme("mami") , new deneme("ahmet")};

        for (String a : array) {
            System.out.println(a);
        }
        for (int i : array2) {
            System.out.println(i);
            
        }
        for (deneme b : array3) {
            b.yaz();
        }
    }
    
}
