package rectangle;

public class Rectangle {
    private Double width;
    private Double height;

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public Double getArea() {
        return this.width * this.height;
    }
}
