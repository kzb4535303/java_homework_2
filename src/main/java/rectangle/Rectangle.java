package rectangle;

public class Rectangle {
    private Double width;
    private Double height;
    public Rectangle(Double width, Double height) {
        this.height = height;
        this.width = width;
    }

    public Double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public Double getArea() {
        return this.width * this.height;
    }
}
