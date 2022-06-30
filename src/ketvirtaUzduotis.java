
public class ketvirtaUzduotis {
    public static void main(String[] args) {
        String[] zodziai = {"zodziai","kelmas", "botAGAS", "laumė","UmUs," "mašina", "burlaivis"};
        System.out.println(zodziuGaluniuPatikrinimas(zodziai));
    }
    public static int zodziuGaluniuPatikrinimas(String[] zodziai){
        int teisingiZodziai = 0;
        for (String zodis : zodziai) {
            if (zodis.toLowerCase().contains("as")) {
                teisingiZodziai++;
            } else if (zodis.toLowerCase().contains("us")) {
                teisingiZodziai++;
            } else if (zodis.toLowerCase().contains("is")) {
                teisingiZodziai++;
            }
            }

        return teisingiZodziai;
    }
}

