import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExtentreportsTest {
    @Test
    public void test01(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test02(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test03(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test04(){
        Assert.assertEquals(1,3);
    }
//    抛出一个日志
    @Test
    public void runtimelog(){
        Reporter.log("日志记录");
        throw new RuntimeException("这是个人抛出的");
    }
}
