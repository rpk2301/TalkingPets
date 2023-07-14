import org.junit.*;


public class CatTest {

    @Test
    public void TestSpeak()
    {
        Cat c = new Cat();
        String expected = "Meow";
        String actual = c.speak();
        Assert.assertEquals(expected,actual);
    }




    @Test
    public void testGetname()
    {
        Cat c = new Cat();
        String expected = "Boots";
        String actual = c.getName();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testSetName()
    {
        Cat c = new Cat();
        String expected = "Whiskers";
        String actual= c.setName(expected);
        Assert.assertEquals(expected,actual);
    }



}
