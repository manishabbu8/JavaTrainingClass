public class MethodExamples {
    public static void main(String[] args) {
        System.out.println("Adding two numbers and printing it how many times according to the count given");
        add(10,20,3);

    }
    static void add(int a, int b, int count){
        int sum=a+b;
        for (int i=0;i<count;i++){

            System.out.println(sum);
        }
    }
}
