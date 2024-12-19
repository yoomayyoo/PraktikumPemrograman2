package soal1;

public class Rectangle extends Shape{
	 private double length, width;

    public Rectangle(double l, double w) {
        super("Rectangle");
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }

    public String toString() {
        return super.toString() + " with length " + length + " and width " + width;
    }

}
