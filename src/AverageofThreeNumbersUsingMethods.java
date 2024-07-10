public class AverageofThreeNumbersUsingMethods {
    public static void main(String[] args) {
        System.out.println("The average of three numbers is:");
        int [] res={25,45,65};
        average(res);
    }
    /*static int average(int a,int b, int c){
        int sum=a+b+c;
        int avg=sum/3;
    System.out.println(avg);
    return avg;
    }*/
    static int average(int[] res){
        int sum=0;
        int length= res.length;
        int avg=0;
        //int avg=0;
        for (int i=0;i<res.length;i++){
            sum+= res[i];
            //int avg=System.out.println(sum/res.length);
             avg=sum/length;

        }
        //int avg= int(sum/res.length);
    System.out.println(avg);
    return avg;

    }
}
