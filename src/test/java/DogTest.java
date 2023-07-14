import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class DogTest extends TestCase {



    @Test
    public void testSpeak()
    {
        //Given
        Dog snoopy = new Dog("Snoopy");
        String expected = "WOOF";
        //When
        String actual = snoopy.speak();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetName()
    {
        //Given
        Dog snoopy = new Dog("Snoopy");
        String expected = "Snoopy";
        //When
        String actual = snoopy.getName();
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSetName()
    {
        Dog c = new Dog("Bob");
        String expected = "Whiskers";
        String actual= c.setName(expected);
        Assert.assertEquals(expected,actual);
    }

}