package rectangle;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testRectangleTest() {
        Double height = 12.00;
        Double width = 12.00;
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(height);
        rectangle.setWidth(width);
        Assert.assertTrue( rectangle.getHeight() == height);
        Assert.assertTrue(rectangle.getWidth() == width);
        Assert.assertTrue(rectangle.getArea() == height * width);
        Assert.assertTrue(rectangle.getPerimeter() == 2 * (height + width));
    }
}
