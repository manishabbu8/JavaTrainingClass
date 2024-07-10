public class WhileDoWhile {
    public static void main(String[] args) {
        int factorial=10;
        int TempNu=1;
        while(factorial>1){
            TempNu=TempNu*factorial;
            factorial--;
        }
        System.out.println(TempNu);
    }
}
