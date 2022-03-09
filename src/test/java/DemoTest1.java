import com.itheima.DestTest.DemoTest;
import org.junit.Assert;
import org.junit.Test;

public class DemoTest1 {
    @Test
    public void testSay(){
        DemoTest demoTest = new DemoTest();
        String mvn = demoTest.say("mvn");
        Assert.assertEquals("hello mvn",mvn);
    }
}
