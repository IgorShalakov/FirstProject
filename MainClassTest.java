import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("The result is not equal to 14", getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("The result is more than 45", getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        Assert.assertTrue("The result does not include the substring Hello or hello",
                getClassString().contains("Hello") || getClassString().contains("hello"));}

}
