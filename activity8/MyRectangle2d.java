public class MyRectangle2d {

    // data fields
    private double x;
    private double y;
    private double width;
    private double height;

    // no-arg constructor
    public MyRectangle2d() {
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    // constructor with values
    public MyRectangle2d(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // getters and setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double px, double py) {
        return (px >= x - width / 2 && px <= x + width / 2 &&
                py >= y - height / 2 && py <= y + height / 2);
    }

    public boolean contains(MyRectangle2d r) {
        return contains(r.x - r.width / 2, r.y - r.height / 2) &&
               contains(r.x + r.width / 2, r.y + r.height / 2);
    }

    public boolean overlaps(MyRectangle2d r) {
        return (Math.abs(this.x - r.x) * 2 < (this.width + r.width)) &&
               (Math.abs(this.y - r.y) * 2 < (this.height + r.height));
    }
}