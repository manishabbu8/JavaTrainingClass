public class CalengineExample {
    public static void main(String[] args) {
        double v1 = 100.0d;
        double v2 = 50.0d;
        char opCode = 'm';

        if (opCode == 'm') {
            System.out.println(v1 * v2);
        } else if (opCode == 'a') {
            System.out.println(v1 + v2);
        } else if (opCode == 's') {
            System.out.println(v1 - v2);
        } else if (opCode == 'd') {
            System.out.println(v1 / v2);
        } else {
            System.out.println("You entered a wrong character");
        }


    }
}
