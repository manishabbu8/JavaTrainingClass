public class SmallestNumberUsingMethods {
    public static void main(String[] args) {
        System.out.println("The smallest number is: ");
        smallest(25, 35, 29);
        //System.out.println()
    }

    static int smallest(int a, int b, int c) {
        int result=0;
        if (a < b && a < c) {
            result= a;
        } else if (b < c && b < a) {
            result= b;
        } else if (c < a && c < b) {
            result= c;
        }

    System.out.println(result);
    return result;
    }
}


