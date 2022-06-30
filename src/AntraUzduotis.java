import java.util.Arrays;

public class AntraUzduotis {
    public static void main(String[] args) {
        int[] x = {3, 5, 8};
        int[] y = {2, 7, 12, 9};

        int length = x.length + y.length;
       // System.out.println(length);
        int[] array = new int[length];
        System.out.println(kopijuotiElementus(x,array,y));
    }

    public static String kopijuotiElementus(int[] x, int[] array, int[] y) {
        int skaicius = 0;
        for (int element : x) {
            array[skaicius] = element;
            skaicius++;
        }
        for (int element : y) {
            array[skaicius] = element;
            skaicius++;
        }
        return Arrays.toString(array);
    }
}
