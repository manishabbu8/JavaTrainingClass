public class CalengineUsingSwitch {
    public static void main(String[] args) {
        double v1=100.0d;
        double v2=50.0d;
        char alp = 'd';
        switch (alp){
            case 'a':
                System.out.println(v1+v2);
                break;
            case 's':
                System.out.println(v1-v2);
                break;
            case 'm':
                System.out.println(v1*v2);
                break;
            case 'd':
                System.out.print(v1/v2);
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("End of the program");

    }
}
