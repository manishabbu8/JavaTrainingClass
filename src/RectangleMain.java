public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle(23,25);
        int area= rectangle.width*rectangle.height;
        System.out.println("The area of the circle is " + area);
        double circumference= 2* rectangle.sq * area;
        System.out.println("The circumference of the circle is " + circumference);

    }
}
