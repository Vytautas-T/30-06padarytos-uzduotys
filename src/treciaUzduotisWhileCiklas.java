public class treciaUzduotisWhileCiklas {
    public static void main(String[] args) {
        double[] x = {21.14,78.56,30.30,50.00,45.78,35.48,98.55,5.40};
        System.out.println(masyvoSuskaiciavimas(x));
    }
    public  static double masyvoSuskaiciavimas(double[] skaicius){
        int i = 0;
        double skaicius1 = 0;
        while (i++ < skaicius.length) {
            skaicius1 = skaicius1 + skaicius[i];
            i++;
        }
        return skaicius1;
    }
}
