package rectangle;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testRectangleTest() {
        //given
        Double height = 12.00;
        Double width = 12.00;
        Rectangle rectangle = new Rectangle(width, height);
        Assert.assertTrue(rectangle.getArea() == height * width);
        Assert.assertTrue(rectangle.getPerimeter() == 2 * (height + width));
    }
}
