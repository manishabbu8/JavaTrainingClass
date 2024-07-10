public class CalengineUsingMethods {
    public static void main(String[] args) {
        double[] val1 = {100.0d, 50.0d, 25.0d, 10.0d};
        double[] val2 = {10.0d, 5.0d, 1.0d, 10.0d};
        char[] opCode = {'a', 's', 'm', 'd'};
        double[] res = new double[4];
        for (int i = 0; i < opCode.length; i++) {
            res[i] = execute(opCode[i], val1[i], val2[i]);
            System.out.println(res);
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

    static double execute(char opCode, double val1, double val2) {
        double res1=0.0d;
        switch (opCode) {
            case 'a':
                res1 = val1 + val2;
                break;
            case 's':
                res1 = val1 - val2;
                break;
            case 'm':
                res1 = val1 * val2;
                break;
            case 'd':
                res1 = val1 / val2;
                break;
            default:
                System.out.println("Here is the program");
                break;
        //return res1;

        }
    return res1;


    }

}
