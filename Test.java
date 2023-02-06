
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        System.out.println(circle);
        System.out.println("Radius of first circle is "+circle.getRadius());
        System.out.println("Area of first circle is "+circle.getArea());
        System.out.println("Length of first circle is "+circle.getCircumference());
        Circle secondCircle = new Circle(10);
        System.out.println(secondCircle);
        System.out.println("Radius of first circle is "+secondCircle.getRadius());
        System.out.println("Area of first circle is "+secondCircle.getArea());
        System.out.println("Length of first circle is "+secondCircle.getCircumference());
        circle.setRadius(secondCircle.getRadius()+circle.getRadius()); 
        System.out.println(circle);
        System.out.println("Radius of first circle is "+circle.getRadius());
        System.out.println("Area of first circle is "+circle.getArea());
        System.out.println("Length of first circle is "+circle.getCircumference());
    }
}
