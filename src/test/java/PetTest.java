import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PetTest extends TestCase {
    @Test
    public void testTestGetName() {

        Pet p = new Pet("Jeff") {
            public String speak() {
                return null;
            }
        };
        String expected = "Jeff";
        String actual = p.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTestSetName() {
        Pet p = new Pet("Jeff") {
            public String speak() {
                return null;
            }
        };
        String expected = "whiskers";
        String actual = p.setName("whiskers");
        Assert.assertEquals(expected, actual);


    }

}