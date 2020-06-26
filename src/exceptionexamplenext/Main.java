package exceptionexamplenext;

public class Main {
    public static void main(String[] args) {

        //System.out.println(5/0);
        /*System.out.println("Anything");
        */

        //int [] tab = new int[4];
        try {
            System.out.println(5/0);
        }

        catch(ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Anything");
    }
}


