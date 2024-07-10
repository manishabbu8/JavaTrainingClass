public class Person {

    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age= age;
    }
    public int getAge(){
        return age;
    }

    public void setCountry(String country){
        this.country=country;
    }
    public String getCountry(){
        return country;
    }
    public void method(){
        System.out.println("The name of the person is " + name + " and his age is " + age + " and he lives in  " + country );
    }
}
