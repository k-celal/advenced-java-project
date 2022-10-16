package arrayList;

import java.util.ArrayList;



public class test {
    public static void yazdir(ArrayList<String> a) {
        for (int i = 0 ; i<a.size() ; i++ ) {
            System.out.println("Element " + (i+1) + " : " + a.get(i));
            
        }
        
    }

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
        
        str.add("Rap");
        str.add("Pop");
        str.add("Arabesk");
        System.out.println("----------------");

        System.out.println(str.get(1));
        for (String string : str) {
            System.out.println(string);
        }
        System.out.println("----------------");

        System.out.println("Boyut : " + str.size());
        System.out.println("----------------");

        str.remove("Rap");
        for (String string : str) {
            System.out.println(string);
        }
        System.out.println("----------------");
        str.remove(1);
        for (String string : str) {
            System.out.println(string);
        }
        System.out.println("----------------");
        str.add("Rap");
        str.add("Pop");
        str.add("Arabesk");
        str.add("Rap");
        for (String string : str) {
            System.out.println(string);
        }
        System.out.println("Rap yeri : " + str.indexOf("Rap"));
        System.out.println("İkinci rap yeri " + str.lastIndexOf("Rap")); // eger yoksa -1 dönderir
        System.out.println("Rock yeri " + str.lastIndexOf("Rock"));
        System.out.println("----------------");
        str.set(4, "Rock");
        for (String string : str) {
            System.out.println(string);
        }
        System.out.println("----------------");
        yazdir(str);

    }
    
}
