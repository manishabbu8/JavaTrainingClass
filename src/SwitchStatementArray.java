public class SwitchStatementArray {
    public static void main(String[] args) {
        double[] v1={100.0d,50.0d,25.0d,0.0d};
        double[] v2={1.0d,2.0d,5.0d,0.0d};
        char[] opCode={'d','m','a','s'};
        double res[]=new double[4];
        for (int i=0;i<opCode.length;i++){
            switch (opCode[i]){
                case 'd':
                    res[i]=v1[i]/v2[i];
                    break;
                case 'm':
                    res[i]=v1[i]*v2[i];
                    break;
                case 'a':
                    res[i]=v1[i]+v2[i];
                    break;
                case 's':
                    res[i]=v1[i]-v2[i];
                    break;
                default:
                    System.out.println("You have entered invalid input");
                    break;
            }
            System.out.println(res[i]);

        }
        //ystem.out.println(res[i]);

    }
}
