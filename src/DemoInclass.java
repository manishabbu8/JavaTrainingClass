public class DemoInclass {
    public static void main(String[] args) {
        double []val1={1,2,3.4};
        double [] val2={2,8,9,3};
        char [] val3= {'a','m'};
        Person obj= new Person();
        obj.setName("Manish");
        String name= m2ArrayWith4Parameters.m2(val1,val2,val3,obj);
        System.out.println(name);
    }
}
