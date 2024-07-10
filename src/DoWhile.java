public class DoWhile {
    public static void main(String[] args) {
        int factorial=10;
        int TempNu=1;
        do {
            TempNu=TempNu*factorial;
            factorial--;
        }
        while (factorial>1);
        System.out.println(TempNu);
    }
    //System.out.println(TempNu);
}
