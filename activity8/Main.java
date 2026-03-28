public class Main{
    public static void main(String[] args) {

        MyRectangle2d r1 = new MyRectangle2d(0, 0, 4, 4);
        MyRectangle2d r2 = new MyRectangle2d(1, 1, 2, 2);

        System.out.println("Area of r1: " + r1.getArea());
        System.out.println("Perimeter of r1: " + r1.getPerimeter());

        System.out.println("r1 contains point (1,1): " + r1.contains(1, 1));
        System.out.println("r1 contains r2: " + r1.contains(r2));
        System.out.println("r1 overlaps r2: " + r1.overlaps(r2));
    }
}