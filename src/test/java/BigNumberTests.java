import org.junit.*;

public class BigNumberTests {

    @Before
    public void before() {
        //
    }

    @Test
    public void instantiationTest() {
        BigNumber number = new BigNumber("12345678912345678912345678909123456789123456781234567823456782345678");
        Assert.assertNotNull(number);
        number = new BigNumber("123123");
        Assert.assertNotNull(number);
    }

    @Test
    public void addTest() {
        BigNumber a = new BigNumber("18");
        BigNumber b = new BigNumber(5);
        BigNumber c = a.add(b);
        Assert.assertEquals("23", c.toString());
    }

    @Test
    public void substractionTest() {

    }

    @Test
    public void multiplyTest() {

    }

    @Test
    public void maxTest() {

    }

    @Test
    public void minTest() {

    }

    @Test
    public void compareToTest() {

    }

    @Test
    public void gcdTest() {

    }

    @Test
    public void absTest() {

    }

    @Test
    public void longValueTest() {

    }
}
