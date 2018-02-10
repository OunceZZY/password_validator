package zhiyuanzhang.password_validator;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class JUnitTest {

    static int count;

    @BeforeClass
    public static void init()
    {
        count = 0;

        System.out.println("Before Test to see my JUnit is actually running");
    }

    @AfterClass
    public static void finished(){
        System.out.println("This means done, tested: "+count);
    }

    @After
    public void afterEachTest(){

        System.out.println("One sample test done");
    }

    @Before
    public void beforeEachTest(){
        count++;
        System.out.println("Start one test");
    }


    @Test
    public void testStrength(){
        assertEquals(Validator.strengthTest("Owen"), 3);
        assertEquals(Validator.strengthTest("ZhangZhiyuan1"),5);

    }


}