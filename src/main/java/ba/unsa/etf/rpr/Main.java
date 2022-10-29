package ba.unsa.etf.rpr;

public class Main {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[1]);
        if(args[0].equals("sin"))
            System.out.println("sin(n) = " + Math.sin(n));
        else if(args[0].equals("fact"))
            System.out.println("fact(n) = " + factorial((int) n));
        else
            System.out.println("Pogrešna komanda");
    }

    public static double factorial(double x) {
        int fakt = 1;
        for(int i = 2; i <= x; i++)
            fakt *= i;
        return fakt;
    }
}