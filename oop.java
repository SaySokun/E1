class Rectangle {
    protected double width;
    protected double length;
    public Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
        }
    public double getArea() {
        return length * width;
        }
    public double getPerimeter() {
        return 2 * (length + width);
        }
}
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}
