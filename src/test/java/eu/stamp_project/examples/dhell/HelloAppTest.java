package eu.stamp_project.examples.dhell;


import java.io.File;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class HelloAppTest {
    @BeforeClass
    public static void runOnceAtTheBeginning() {
        System.out.println("dhell.HelloAppTest: @BeforeClass - runOnceAtTheBeginning");
    }

    @org.junit.AfterClass
    public static void runOnceAtTheEnd() {
        System.out.println("dhell.HelloAppTest: @AfterClass - runOnceAtTheEnd");
    }

    @Test(timeout = 10000)
    public void testHelloAppDefault_literalMutationNumber1() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        myApp = new HelloApp();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppDefault__7 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault__7)));
        boolean boolean_0 = (myApp.returnSomething()) > 1;
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppDefault__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppDefault__13);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault__7)));
        Assert.assertFalse(o_testHelloAppDefault__13);
    }

    @Test(timeout = 10000)
    public void testHelloAppDefault_literalMutationNumber2() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        myApp = new HelloApp();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppDefault__7 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault__7)));
        boolean boolean_0 = (myApp.returnSomething()) > -1;
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppDefault__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppDefault__13);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault__7)));
        Assert.assertFalse(o_testHelloAppDefault__13);
    }

    @Test(timeout = 10000)
    public void testHelloAppInt_literalMutationNumber17() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 4;
        Assert.assertEquals(4, ((int) (myCount)));
        myApp = new HelloApp(myCount);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppInt__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppInt__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppInt__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppInt__12);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(4, ((int) (myCount)));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppInt__8)));
        Assert.assertFalse(o_testHelloAppInt__12);
    }

    @Test(timeout = 10000)
    public void testHelloAppInt_literalMutationNumber18() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 16;
        Assert.assertEquals(16, ((int) (myCount)));
        myApp = new HelloApp(myCount);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(16, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppInt__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppInt__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppInt__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppInt__12);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(16, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(16, ((int) (myCount)));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(16, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppInt__8)));
        Assert.assertFalse(o_testHelloAppInt__12);
    }

    @Test(timeout = 10000)
    public void testHelloAppInt_literalMutationNumber1_literalMutationNumber157() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 2;
        Assert.assertEquals(2, ((int) (myCount)));
        myApp = new HelloApp(myCount);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(2, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppInt_literalMutationNumber1__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber1__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppInt_literalMutationNumber1__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppInt_literalMutationNumber1__13);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(2, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(2, ((int) (myCount)));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(2, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber1__9)));
        Assert.assertFalse(o_testHelloAppInt_literalMutationNumber1__13);
    }

    @Test(timeout = 10000)
    public void testHelloAppInt_literalMutationNumber1_literalMutationNumber158() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 8;
        Assert.assertEquals(8, ((int) (myCount)));
        myApp = new HelloApp(myCount);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppInt_literalMutationNumber1__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber1__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppInt_literalMutationNumber1__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppInt_literalMutationNumber1__13);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(8, ((int) (myCount)));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber1__9)));
        Assert.assertFalse(o_testHelloAppInt_literalMutationNumber1__13);
    }

    @Test(timeout = 10000)
    public void testHelloAppInt_literalMutationNumber2_literalMutationNumber177() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 8;
        Assert.assertEquals(8, ((int) (myCount)));
        myApp = new HelloApp(myCount);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppInt_literalMutationNumber2__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber2__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppInt_literalMutationNumber2__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppInt_literalMutationNumber2__13);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(8, ((int) (myCount)));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber2__9)));
        Assert.assertFalse(o_testHelloAppInt_literalMutationNumber2__13);
    }

    @Test(timeout = 10000)
    public void testHelloAppInt_literalMutationNumber2_literalMutationNumber178() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 32;
        Assert.assertEquals(32, ((int) (myCount)));
        myApp = new HelloApp(myCount);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(32, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppInt_literalMutationNumber2__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber2__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppInt_literalMutationNumber2__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppInt_literalMutationNumber2__13);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(32, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(32, ((int) (myCount)));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(32, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber2__9)));
        Assert.assertFalse(o_testHelloAppInt_literalMutationNumber2__13);
    }

    @Test(timeout = 10000)
    public void testHelloAppString_literalMutationString1045() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        String MyTracesName = "";
        Assert.assertEquals("", MyTracesName);
        myApp = new HelloApp(MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppString__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppString__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppString__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppString__12);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppString__8)));
        Assert.assertFalse(o_testHelloAppString__12);
    }

    @Test(timeout = 10000)
    public void testHelloAppString_literalMutationString1046() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        String MyTracesName = "fooI.traces";
        Assert.assertEquals("fooI.traces", MyTracesName);
        myApp = new HelloApp(MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("fooI.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppString__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppString__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppString__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppString__12);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("fooI.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("fooI.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("fooI.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppString__8)));
        Assert.assertFalse(o_testHelloAppString__12);
    }

    @Test(timeout = 10000)
    public void testHelloAppString_literalMutationString249_literalMutationString1069() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        String MyTracesName = "";
        Assert.assertEquals("", MyTracesName);
        myApp = new HelloApp(MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppString_literalMutationString249__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString249__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppString_literalMutationString249__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppString_literalMutationString249__12);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString249__8)));
        Assert.assertFalse(o_testHelloAppString_literalMutationString249__12);
    }

    @Test(timeout = 10000)
    public void testHelloAppString_literalMutationString249_literalMutationString1070() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        String MyTracesName = "foo1taces";
        Assert.assertEquals("foo1taces", MyTracesName);
        myApp = new HelloApp(MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo1taces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppString_literalMutationString249__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString249__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppString_literalMutationString249__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppString_literalMutationString249__12);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo1taces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("foo1taces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo1taces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString249__8)));
        Assert.assertFalse(o_testHelloAppString_literalMutationString249__12);
    }

    @Test(timeout = 10000)
    public void testHelloAppString_literalMutationString250_literalMutationString1093() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        String MyTracesName = "";
        Assert.assertEquals("", MyTracesName);
        myApp = new HelloApp(MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppString_literalMutationString250__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString250__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppString_literalMutationString250__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppString_literalMutationString250__12);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString250__8)));
        Assert.assertFalse(o_testHelloAppString_literalMutationString250__12);
    }

    @Test(timeout = 10000)
    public void testHelloAppString_literalMutationString250_literalMutationString1094() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        String MyTracesName = "FINEST";
        Assert.assertEquals("FINEST", MyTracesName);
        myApp = new HelloApp(MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("FINEST", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppString_literalMutationString250__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString250__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppString_literalMutationString250__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppString_literalMutationString250__12);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("FINEST", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("FINEST", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("FINEST", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString250__8)));
        Assert.assertFalse(o_testHelloAppString_literalMutationString250__12);
    }

    @Test(timeout = 10000)
    public void testHelloAppIntString_literalMutationNumber37() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 4;
        Assert.assertEquals(4, ((int) (myCount)));
        String MyTracesName = "foo2.traces";
        Assert.assertEquals("foo2.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppIntString__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppIntString__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppIntString__13);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(4, ((int) (myCount)));
        Assert.assertEquals("foo2.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString__9)));
        Assert.assertFalse(o_testHelloAppIntString__13);
    }

    @Test(timeout = 10000)
    public void testHelloAppIntString_literalMutationString42() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 8;
        Assert.assertEquals(8, ((int) (myCount)));
        String MyTracesName = "";
        Assert.assertEquals("", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppIntString__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppIntString__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppIntString__13);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(8, ((int) (myCount)));
        Assert.assertEquals("", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString__9)));
        Assert.assertFalse(o_testHelloAppIntString__13);
    }

    @Test(timeout = 10000)
    public void testHelloAppIntString_literalMutationNumber21_literalMutationNumber81() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 2;
        Assert.assertEquals(2, ((int) (myCount)));
        String MyTracesName = "foo2.traces";
        Assert.assertEquals("foo2.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(2, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTraces();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppIntString_literalMutationNumber21__10 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationNumber21__10)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppIntString_literalMutationNumber21__14 = theFile.exists();
        Assert.assertFalse(o_testHelloAppIntString_literalMutationNumber21__14);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(2, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(2, ((int) (myCount)));
        Assert.assertEquals("foo2.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(2, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationNumber21__10)));
        Assert.assertFalse(o_testHelloAppIntString_literalMutationNumber21__14);
    }

    @Test(timeout = 10000)
    public void testHelloAppIntString_literalMutationNumber21_literalMutationString86() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 4;
        Assert.assertEquals(4, ((int) (myCount)));
        String MyTracesName = "";
        Assert.assertEquals("", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTraces();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppIntString_literalMutationNumber21__10 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationNumber21__10)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppIntString_literalMutationNumber21__14 = theFile.exists();
        Assert.assertFalse(o_testHelloAppIntString_literalMutationNumber21__14);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(4, ((int) (myCount)));
        Assert.assertEquals("", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationNumber21__10)));
        Assert.assertFalse(o_testHelloAppIntString_literalMutationNumber21__14);
    }

    @Test(timeout = 10000)
    public void testHelloAppIntString_literalMutationString26_literalMutationNumber125() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 4;
        Assert.assertEquals(4, ((int) (myCount)));
        String MyTracesName = "";
        Assert.assertEquals("", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTraces();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppIntString_literalMutationString26__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationString26__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppIntString_literalMutationString26__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppIntString_literalMutationString26__13);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(4, ((int) (myCount)));
        Assert.assertEquals("", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationString26__9)));
        Assert.assertFalse(o_testHelloAppIntString_literalMutationString26__13);
    }

    @Test(timeout = 10000)
    public void testHelloAppIntString_literalMutationString26_literalMutationString130() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 8;
        Assert.assertEquals(8, ((int) (myCount)));
        String MyTracesName = "";
        Assert.assertEquals("", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTraces();
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppIntString_literalMutationString26__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationString26__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppIntString_literalMutationString26__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppIntString_literalMutationString26__13);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyTraces();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(8, ((int) (myCount)));
        Assert.assertEquals("", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationString26__9)));
        Assert.assertFalse(o_testHelloAppIntString_literalMutationString26__13);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_literalMutationNumber197() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        myApp = new HelloApp();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1__17 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun1__17);
        boolean o_testHelloAppRun1__18 = countString.equals(myApp.getMyTraces().getData(1));
        Assert.assertFalse(o_testHelloAppRun1__18);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        fileContent.readData();
        boolean o_testHelloAppRun1__25 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1__25);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1__17);
        Assert.assertFalse(o_testHelloAppRun1__18);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun1__25);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_literalMutationNumber198_failAssert5() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            String countString;
            myApp = new HelloApp();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTraces();
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            countString = Integer.toString(myApp.getMyPrintCount());
            boolean o_testHelloAppRun1__17 = theFile.exists();
            boolean o_testHelloAppRun1__18 = countString.equals(myApp.getMyTraces().getData(-1));
            fileContent = new MyStorage(myApp.getMyTracesName());
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            fileContent.readData();
            boolean o_testHelloAppRun1__25 = fileContent.isEqual(myApp.getMyTraces());
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            org.junit.Assert.fail("testHelloAppRun1_literalMutationNumber198 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_literalMutationNumber65() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        myApp = new HelloApp();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_literalMutationNumber65__17 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__17);
        boolean o_testHelloAppRun1_literalMutationNumber65__18 = countString.equals(myApp.getMyTraces().getData(1));
        Assert.assertFalse(o_testHelloAppRun1_literalMutationNumber65__18);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        fileContent.readData();
        boolean o_testHelloAppRun1_literalMutationNumber65__26 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__26);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__17);
        Assert.assertFalse(o_testHelloAppRun1_literalMutationNumber65__18);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__26);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_literalMutationNumber65_literalMutationNumber212() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        myApp = new HelloApp();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_literalMutationNumber65__17 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__17);
        boolean o_testHelloAppRun1_literalMutationNumber65__18 = countString.equals(myApp.getMyTraces().getData(2));
        Assert.assertFalse(o_testHelloAppRun1_literalMutationNumber65__18);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        fileContent.readData();
        boolean o_testHelloAppRun1_literalMutationNumber65__26 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__26);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__17);
        Assert.assertFalse(o_testHelloAppRun1_literalMutationNumber65__18);
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__26);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_literalMutationNumber65_literalMutationNumber213() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        myApp = new HelloApp();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_literalMutationNumber65__17 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__17);
        boolean o_testHelloAppRun1_literalMutationNumber65__18 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__18);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        fileContent.readData();
        boolean o_testHelloAppRun1_literalMutationNumber65__26 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__26);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__17);
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__18);
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__26);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber228() throws Exception {
        {
            HelloApp myApp = null;
            Assert.assertNull(myApp);
            File theFile = null;
            MyStorage fileContent = null;
            Assert.assertNull(fileContent);
            String countString;
            myApp = new HelloApp();
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            countString = Integer.toString(myApp.getMyPrintCount());
            Assert.assertEquals("1", countString);
            boolean o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber228__15 = theFile.exists();
            Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber228__15);
            boolean o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber228__16 = countString.equals(myApp.getMyTraces().getData(2));
            Assert.assertFalse(o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber228__16);
            fileContent = new MyStorage(myApp.getMyTracesName());
            Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
            fileContent.readData();
            boolean o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber228__23 = fileContent.isEqual(myApp.getMyTraces());
            Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber228__23);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertEquals("1", countString);
            Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber228__15);
            Assert.assertFalse(o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber228__16);
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber229() throws Exception {
        {
            HelloApp myApp = null;
            Assert.assertNull(myApp);
            File theFile = null;
            MyStorage fileContent = null;
            Assert.assertNull(fileContent);
            String countString;
            myApp = new HelloApp();
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            countString = Integer.toString(myApp.getMyPrintCount());
            Assert.assertEquals("1", countString);
            boolean o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber229__15 = theFile.exists();
            Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber229__15);
            boolean o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber229__16 = countString.equals(myApp.getMyTraces().getData(0));
            Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber229__16);
            fileContent = new MyStorage(myApp.getMyTracesName());
            Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
            fileContent.readData();
            boolean o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber229__23 = fileContent.isEqual(myApp.getMyTraces());
            Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber229__23);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertEquals("1", countString);
            Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber229__15);
            Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber66_failAssert0_literalMutationNumber229__16);
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber244() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 4;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("4", countString);
        String MyTracesName = "foo3.traces";
        Assert.assertEquals("foo3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppRun2__17 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun2__17);
        boolean o_testHelloAppRun2__18 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun2__18);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        fileContent.readData();
        boolean o_testHelloAppRun2__25 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun2__25);
        boolean o_testHelloAppRun2__27 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun2__27);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("4", countString);
        Assert.assertEquals("foo3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertTrue(o_testHelloAppRun2__17);
        Assert.assertTrue(o_testHelloAppRun2__18);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun2__25);
        Assert.assertTrue(o_testHelloAppRun2__27);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber246() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 0;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("0", countString);
        String MyTracesName = "foo3.traces";
        Assert.assertEquals("foo3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppRun2__17 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun2__17);
        boolean o_testHelloAppRun2__18 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun2__18);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        fileContent.readData();
        boolean o_testHelloAppRun2__25 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun2__25);
        boolean o_testHelloAppRun2__27 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun2__27);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("0", countString);
        Assert.assertEquals("foo3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertTrue(o_testHelloAppRun2__17);
        Assert.assertTrue(o_testHelloAppRun2__18);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun2__25);
        Assert.assertTrue(o_testHelloAppRun2__27);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationString249_failAssert6() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 8;
            String countString = Integer.toString(myCount);
            String MyTracesName = "";
            myApp = new HelloApp(myCount, MyTracesName);
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTraces();
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            boolean o_testHelloAppRun2__17 = theFile.exists();
            boolean o_testHelloAppRun2__18 = countString.equals(myApp.getMyTraces().getData(0));
            fileContent = new MyStorage(myApp.getMyTracesName());
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            fileContent.readData();
            boolean o_testHelloAppRun2__25 = fileContent.isEqual(myApp.getMyTraces());
            boolean o_testHelloAppRun2__27 = countString.equals(fileContent.getData(0));
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            org.junit.Assert.fail("testHelloAppRun2_literalMutationString249 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber256_failAssert7() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 8;
            String countString = Integer.toString(myCount);
            String MyTracesName = "foo3.traces";
            myApp = new HelloApp(myCount, MyTracesName);
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTraces();
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            boolean o_testHelloAppRun2__17 = theFile.exists();
            boolean o_testHelloAppRun2__18 = countString.equals(myApp.getMyTraces().getData(-1));
            fileContent = new MyStorage(myApp.getMyTracesName());
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            fileContent.readData();
            boolean o_testHelloAppRun2__25 = fileContent.isEqual(myApp.getMyTraces());
            boolean o_testHelloAppRun2__27 = countString.equals(fileContent.getData(0));
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber256 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber80_literalMutationNumber317() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 2;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("2", countString);
        String MyTracesName = "foo3.traces";
        Assert.assertEquals("foo3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(2, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppRun2_literalMutationNumber80__18 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__18);
        boolean o_testHelloAppRun2_literalMutationNumber80__19 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__19);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        fileContent.readData();
        boolean o_testHelloAppRun2_literalMutationNumber80__26 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__26);
        boolean o_testHelloAppRun2_literalMutationNumber80__28 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__28);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(2, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("2", countString);
        Assert.assertEquals("foo3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(2, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__18);
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__19);
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__26);
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__28);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber80_literalMutationNumber319() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 0;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("0", countString);
        String MyTracesName = "foo3.traces";
        Assert.assertEquals("foo3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppRun2_literalMutationNumber80__18 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__18);
        boolean o_testHelloAppRun2_literalMutationNumber80__19 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__19);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        fileContent.readData();
        boolean o_testHelloAppRun2_literalMutationNumber80__26 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__26);
        boolean o_testHelloAppRun2_literalMutationNumber80__28 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__28);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("0", countString);
        Assert.assertEquals("foo3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__18);
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__19);
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__26);
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__28);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber80_literalMutationString322_failAssert9() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 4;
            String countString = Integer.toString(myCount);
            String MyTracesName = "";
            myApp = new HelloApp(myCount, MyTracesName);
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTraces();
            ((HelloApp) (myApp)).getMyPrintCount();
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            boolean o_testHelloAppRun2_literalMutationNumber80__18 = theFile.exists();
            boolean o_testHelloAppRun2_literalMutationNumber80__19 = countString.equals(myApp.getMyTraces().getData(0));
            fileContent = new MyStorage(myApp.getMyTracesName());
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            fileContent.readData();
            boolean o_testHelloAppRun2_literalMutationNumber80__26 = fileContent.isEqual(myApp.getMyTraces());
            boolean o_testHelloAppRun2_literalMutationNumber80__28 = countString.equals(fileContent.getData(0));
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber80_literalMutationString322 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber80_literalMutationNumber329_failAssert10() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 4;
            String countString = Integer.toString(myCount);
            String MyTracesName = "foo3.traces";
            myApp = new HelloApp(myCount, MyTracesName);
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTraces();
            ((HelloApp) (myApp)).getMyPrintCount();
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            boolean o_testHelloAppRun2_literalMutationNumber80__18 = theFile.exists();
            boolean o_testHelloAppRun2_literalMutationNumber80__19 = countString.equals(myApp.getMyTraces().getData(-1));
            fileContent = new MyStorage(myApp.getMyTracesName());
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            fileContent.readData();
            boolean o_testHelloAppRun2_literalMutationNumber80__26 = fileContent.isEqual(myApp.getMyTraces());
            boolean o_testHelloAppRun2_literalMutationNumber80__28 = countString.equals(fileContent.getData(0));
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber80_literalMutationNumber329 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber82_literalMutationNumber390() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 1;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("1", countString);
        String MyTracesName = "foo3.traces";
        Assert.assertEquals("foo3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppRun2_literalMutationNumber82__18 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber82__18);
        boolean o_testHelloAppRun2_literalMutationNumber82__19 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber82__19);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        fileContent.readData();
        boolean o_testHelloAppRun2_literalMutationNumber82__26 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber82__26);
        boolean o_testHelloAppRun2_literalMutationNumber82__28 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber82__28);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("foo3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber82__18);
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber82__19);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber82__26);
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber82__28);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber82_literalMutationString394_failAssert12() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 0;
            String countString = Integer.toString(myCount);
            String MyTracesName = "";
            myApp = new HelloApp(myCount, MyTracesName);
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTraces();
            ((HelloApp) (myApp)).getMyPrintCount();
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            boolean o_testHelloAppRun2_literalMutationNumber82__18 = theFile.exists();
            boolean o_testHelloAppRun2_literalMutationNumber82__19 = countString.equals(myApp.getMyTraces().getData(0));
            fileContent = new MyStorage(myApp.getMyTracesName());
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            fileContent.readData();
            boolean o_testHelloAppRun2_literalMutationNumber82__26 = fileContent.isEqual(myApp.getMyTraces());
            boolean o_testHelloAppRun2_literalMutationNumber82__28 = countString.equals(fileContent.getData(0));
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber82_literalMutationString394 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber82_literalMutationNumber401_failAssert13() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 0;
            String countString = Integer.toString(myCount);
            String MyTracesName = "foo3.traces";
            myApp = new HelloApp(myCount, MyTracesName);
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTraces();
            ((HelloApp) (myApp)).getMyPrintCount();
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            boolean o_testHelloAppRun2_literalMutationNumber82__18 = theFile.exists();
            boolean o_testHelloAppRun2_literalMutationNumber82__19 = countString.equals(myApp.getMyTraces().getData(-1));
            fileContent = new MyStorage(myApp.getMyTracesName());
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            fileContent.readData();
            boolean o_testHelloAppRun2_literalMutationNumber82__26 = fileContent.isEqual(myApp.getMyTraces());
            boolean o_testHelloAppRun2_literalMutationNumber82__28 = countString.equals(fileContent.getData(0));
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber82_literalMutationNumber401 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber82_literalMutationNumber405_failAssert14() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 0;
            String countString = Integer.toString(myCount);
            String MyTracesName = "foo3.traces";
            myApp = new HelloApp(myCount, MyTracesName);
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTraces();
            ((HelloApp) (myApp)).getMyPrintCount();
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            boolean o_testHelloAppRun2_literalMutationNumber82__18 = theFile.exists();
            boolean o_testHelloAppRun2_literalMutationNumber82__19 = countString.equals(myApp.getMyTraces().getData(0));
            fileContent = new MyStorage(myApp.getMyTracesName());
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            fileContent.readData();
            boolean o_testHelloAppRun2_literalMutationNumber82__26 = fileContent.isEqual(myApp.getMyTraces());
            boolean o_testHelloAppRun2_literalMutationNumber82__28 = countString.equals(fileContent.getData(-1));
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber82_literalMutationNumber405 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationString85_failAssert1_literalMutationString587() throws Exception {
        {
            HelloApp myApp = null;
            Assert.assertNull(myApp);
            File theFile = null;
            MyStorage fileContent = null;
            Assert.assertNull(fileContent);
            int myCount = 8;
            String countString = Integer.toString(myCount);
            Assert.assertEquals("8", countString);
            String MyTracesName = "!";
            Assert.assertEquals("!", MyTracesName);
            myApp = new HelloApp(myCount, MyTracesName);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("!", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            boolean o_testHelloAppRun2_literalMutationString85_failAssert1_literalMutationString587__15 = theFile.exists();
            Assert.assertTrue(o_testHelloAppRun2_literalMutationString85_failAssert1_literalMutationString587__15);
            boolean o_testHelloAppRun2_literalMutationString85_failAssert1_literalMutationString587__16 = countString.equals(myApp.getMyTraces().getData(0));
            Assert.assertTrue(o_testHelloAppRun2_literalMutationString85_failAssert1_literalMutationString587__16);
            fileContent = new MyStorage(myApp.getMyTracesName());
            Assert.assertEquals("!", ((MyStorage) (fileContent)).getFileName());
            Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
            fileContent.readData();
            boolean o_testHelloAppRun2_literalMutationString85_failAssert1_literalMutationString587__23 = fileContent.isEqual(myApp.getMyTraces());
            Assert.assertTrue(o_testHelloAppRun2_literalMutationString85_failAssert1_literalMutationString587__23);
            boolean o_testHelloAppRun2_literalMutationString85_failAssert1_literalMutationString587__25 = countString.equals(fileContent.getData(0));
            Assert.assertTrue(o_testHelloAppRun2_literalMutationString85_failAssert1_literalMutationString587__25);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("!", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals("!", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertEquals("!", ((MyStorage) (fileContent)).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("8", countString);
            Assert.assertEquals("!", MyTracesName);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("!", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals("!", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertTrue(o_testHelloAppRun2_literalMutationString85_failAssert1_literalMutationString587__15);
            Assert.assertTrue(o_testHelloAppRun2_literalMutationString85_failAssert1_literalMutationString587__16);
            Assert.assertEquals("!", ((MyStorage) (fileContent)).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertTrue(o_testHelloAppRun2_literalMutationString85_failAssert1_literalMutationString587__23);
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationString85_failAssert1_literalMutationNumber581_failAssert45() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 4;
                String countString = Integer.toString(myCount);
                String MyTracesName = "";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                theFile = new File(myApp.getMyTracesName());
                theFile.exists();
                countString.equals(myApp.getMyTraces().getData(0));
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
            }
            org.junit.Assert.fail("testHelloAppRun2_literalMutationString85_failAssert1_literalMutationNumber581 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationString85_failAssert1_literalMutationNumber583_failAssert47() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 0;
                String countString = Integer.toString(myCount);
                String MyTracesName = "";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                theFile = new File(myApp.getMyTracesName());
                theFile.exists();
                countString.equals(myApp.getMyTraces().getData(0));
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
            }
            org.junit.Assert.fail("testHelloAppRun2_literalMutationString85_failAssert1_literalMutationNumber583 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationString85_failAssert1_literalMutationNumber590_failAssert52() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 8;
                String countString = Integer.toString(myCount);
                String MyTracesName = "";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                theFile = new File(myApp.getMyTracesName());
                theFile.exists();
                countString.equals(myApp.getMyTraces().getData(-1));
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
            }
            org.junit.Assert.fail("testHelloAppRun2_literalMutationString85_failAssert1_literalMutationNumber590 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationString85_failAssert1_literalMutationNumber591_failAssert53() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 8;
                String countString = Integer.toString(myCount);
                String MyTracesName = "";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                theFile = new File(myApp.getMyTracesName());
                theFile.exists();
                countString.equals(myApp.getMyTraces().getData(0));
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
            }
            org.junit.Assert.fail("testHelloAppRun2_literalMutationString85_failAssert1_literalMutationNumber591 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber470() throws Exception {
        {
            HelloApp myApp = null;
            Assert.assertNull(myApp);
            File theFile = null;
            MyStorage fileContent = null;
            Assert.assertNull(fileContent);
            int myCount = 8;
            String countString = Integer.toString(myCount);
            Assert.assertEquals("8", countString);
            String MyTracesName = "foo3.traces";
            Assert.assertEquals("foo3.traces", MyTracesName);
            myApp = new HelloApp(myCount, MyTracesName);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            boolean o_testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber470__15 = theFile.exists();
            Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber470__15);
            boolean o_testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber470__16 = countString.equals(myApp.getMyTraces().getData(2));
            Assert.assertFalse(o_testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber470__16);
            fileContent = new MyStorage(myApp.getMyTracesName());
            Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
            Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
            fileContent.readData();
            boolean o_testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber470__23 = fileContent.isEqual(myApp.getMyTraces());
            Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber470__23);
            boolean o_testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber470__25 = countString.equals(fileContent.getData(0));
            Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber470__25);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("8", countString);
            Assert.assertEquals("foo3.traces", MyTracesName);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber470__15);
            Assert.assertFalse(o_testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber470__16);
            Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber470__23);
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber459_failAssert15() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 4;
                String countString = Integer.toString(myCount);
                String MyTracesName = "foo3.traces";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                theFile = new File(myApp.getMyTracesName());
                theFile.exists();
                countString.equals(myApp.getMyTraces().getData((-1)));
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
            }
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber459 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber461_failAssert17() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 0;
                String countString = Integer.toString(myCount);
                String MyTracesName = "foo3.traces";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                theFile = new File(myApp.getMyTracesName());
                theFile.exists();
                countString.equals(myApp.getMyTraces().getData((-1)));
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
            }
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationNumber461 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationString464_failAssert20() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 8;
                String countString = Integer.toString(myCount);
                String MyTracesName = "";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                theFile = new File(myApp.getMyTracesName());
                theFile.exists();
                countString.equals(myApp.getMyTraces().getData((-1)));
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
            }
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationString464 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationString466_failAssert22() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 8;
                String countString = Integer.toString(myCount);
                String MyTracesName = "=SO/woO!OKS";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                theFile = new File(myApp.getMyTracesName());
                theFile.exists();
                countString.equals(myApp.getMyTraces().getData((-1)));
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
            }
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationString466 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationString468_failAssert24() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 8;
                String countString = Integer.toString(myCount);
                String MyTracesName = "foo3.tr0ces";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                theFile = new File(myApp.getMyTracesName());
                theFile.exists();
                countString.equals(myApp.getMyTraces().getData((-1)));
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
            }
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber92_failAssert2_literalMutationString468 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber535() throws Exception {
        {
            HelloApp myApp = null;
            Assert.assertNull(myApp);
            File theFile = null;
            MyStorage fileContent = null;
            Assert.assertNull(fileContent);
            int myCount = 8;
            String countString = Integer.toString(myCount);
            Assert.assertEquals("8", countString);
            String MyTracesName = "foo3.traces";
            Assert.assertEquals("foo3.traces", MyTracesName);
            myApp = new HelloApp(myCount, MyTracesName);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            boolean o_testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber535__15 = theFile.exists();
            Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber535__15);
            boolean o_testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber535__16 = countString.equals(myApp.getMyTraces().getData(0));
            Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber535__16);
            fileContent = new MyStorage(myApp.getMyTracesName());
            Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
            fileContent.readData();
            boolean o_testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber535__23 = fileContent.isEqual(myApp.getMyTraces());
            Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber535__23);
            boolean o_testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber535__25 = countString.equals(fileContent.getData(2));
            Assert.assertFalse(o_testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber535__25);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
            Assert.assertEquals("8", countString);
            Assert.assertEquals("foo3.traces", MyTracesName);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber535__15);
            Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber535__16);
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
            Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber535__23);
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber520_failAssert30() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 4;
                String countString = Integer.toString(myCount);
                String MyTracesName = "foo3.traces";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                theFile = new File(myApp.getMyTracesName());
                theFile.exists();
                countString.equals(myApp.getMyTraces().getData(0));
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData((-1)));
            }
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber520 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber522_failAssert32() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 0;
                String countString = Integer.toString(myCount);
                String MyTracesName = "foo3.traces";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                theFile = new File(myApp.getMyTracesName());
                theFile.exists();
                countString.equals(myApp.getMyTraces().getData(0));
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData((-1)));
            }
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber522 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationString526_failAssert36() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 8;
                String countString = Integer.toString(myCount);
                String MyTracesName = "";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                theFile = new File(myApp.getMyTracesName());
                theFile.exists();
                countString.equals(myApp.getMyTraces().getData(0));
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData((-1)));
            }
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationString526 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber532_failAssert42() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 8;
                String countString = Integer.toString(myCount);
                String MyTracesName = "foo3.traces";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                theFile = new File(myApp.getMyTracesName());
                theFile.exists();
                countString.equals(myApp.getMyTraces().getData(-1));
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData((-1)));
            }
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber532 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber533_failAssert43() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 8;
                String countString = Integer.toString(myCount);
                String MyTracesName = "foo3.traces";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                theFile = new File(myApp.getMyTracesName());
                theFile.exists();
                countString.equals(myApp.getMyTraces().getData(0));
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData((-1)));
            }
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber96_failAssert3_literalMutationNumber533 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber153_literalMutationNumber631() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 1;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("1", countString);
        String helloString = "---------------------- Hello World !";
        Assert.assertEquals("---------------------- Hello World !", helloString);
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.run();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        fileContent.readData();
        boolean o_testHelloAppRun3_literalMutationNumber153__20 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber153__20);
        boolean o_testHelloAppRun3_literalMutationNumber153__22 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber153__22);
        boolean o_testHelloAppRun3_literalMutationNumber153__24 = helloString.equals(fileContent.getData(2));
        Assert.assertFalse(o_testHelloAppRun3_literalMutationNumber153__24);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("1", countString);
        Assert.assertEquals("---------------------- Hello World !", helloString);
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber153__20);
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber153__22);
        Assert.assertFalse(o_testHelloAppRun3_literalMutationNumber153__24);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber153_literalMutationString635() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 0;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("0", countString);
        String helloString = "";
        Assert.assertEquals("", helloString);
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.run();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        fileContent.readData();
        boolean o_testHelloAppRun3_literalMutationNumber153__20 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber153__20);
        boolean o_testHelloAppRun3_literalMutationNumber153__22 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber153__22);
        boolean o_testHelloAppRun3_literalMutationNumber153__24 = helloString.equals(fileContent.getData(2));
        Assert.assertFalse(o_testHelloAppRun3_literalMutationNumber153__24);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("0", countString);
        Assert.assertEquals("", helloString);
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber153__20);
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber153__22);
        Assert.assertFalse(o_testHelloAppRun3_literalMutationNumber153__24);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber153_literalMutationString641_failAssert59() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 0;
            String countString = Integer.toString(myCount);
            String helloString = "---------------------- Hello World !";
            String MyTracesName = "";
            myApp = new HelloApp(myCount, MyTracesName);
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTraces();
            ((HelloApp) (myApp)).getMyPrintCount();
            myApp.run();
            fileContent = new MyStorage(myApp.getMyTracesName());
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            fileContent.readData();
            boolean o_testHelloAppRun3_literalMutationNumber153__20 = fileContent.isEqual(myApp.getMyTraces());
            boolean o_testHelloAppRun3_literalMutationNumber153__22 = countString.equals(fileContent.getData(0));
            boolean o_testHelloAppRun3_literalMutationNumber153__24 = helloString.equals(fileContent.getData(2));
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            org.junit.Assert.fail("testHelloAppRun3_literalMutationNumber153_literalMutationString641 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber154_literalMutationNumber724() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 0;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("0", countString);
        String helloString = "---------------------- Hello World !";
        Assert.assertEquals("---------------------- Hello World !", helloString);
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.run();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        fileContent.readData();
        boolean o_testHelloAppRun3_literalMutationNumber154__20 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber154__20);
        boolean o_testHelloAppRun3_literalMutationNumber154__22 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber154__22);
        boolean o_testHelloAppRun3_literalMutationNumber154__24 = helloString.equals(fileContent.getData(2));
        Assert.assertFalse(o_testHelloAppRun3_literalMutationNumber154__24);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("0", countString);
        Assert.assertEquals("---------------------- Hello World !", helloString);
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber154__20);
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber154__22);
        Assert.assertFalse(o_testHelloAppRun3_literalMutationNumber154__24);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber154_literalMutationNumber725() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 20;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("20", countString);
        String helloString = "---------------------- Hello World !";
        Assert.assertEquals("---------------------- Hello World !", helloString);
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(20, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTraces();
        ((HelloApp) (myApp)).getMyPrintCount();
        myApp.run();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        fileContent.readData();
        boolean o_testHelloAppRun3_literalMutationNumber154__20 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber154__20);
        boolean o_testHelloAppRun3_literalMutationNumber154__22 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber154__22);
        boolean o_testHelloAppRun3_literalMutationNumber154__24 = helloString.equals(fileContent.getData(2));
        Assert.assertFalse(o_testHelloAppRun3_literalMutationNumber154__24);
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getShouldPrintOnStdout();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((HelloApp) (myApp)).getMyTracesName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((HelloApp) (myApp)).getMyPrintCount();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getDataSize();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        ((MyStorage) (fileContent)).getFileName();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(20, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("20", countString);
        Assert.assertEquals("---------------------- Hello World !", helloString);
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(20, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber154__20);
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber154__22);
        Assert.assertFalse(o_testHelloAppRun3_literalMutationNumber154__24);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber154_literalMutationString736_failAssert62() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 21;
            String countString = Integer.toString(myCount);
            String helloString = "---------------------- Hello World !";
            String MyTracesName = "";
            myApp = new HelloApp(myCount, MyTracesName);
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTraces();
            ((HelloApp) (myApp)).getMyPrintCount();
            myApp.run();
            fileContent = new MyStorage(myApp.getMyTracesName());
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            fileContent.readData();
            boolean o_testHelloAppRun3_literalMutationNumber154__20 = fileContent.isEqual(myApp.getMyTraces());
            boolean o_testHelloAppRun3_literalMutationNumber154__22 = countString.equals(fileContent.getData(0));
            boolean o_testHelloAppRun3_literalMutationNumber154__24 = helloString.equals(fileContent.getData(2));
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            org.junit.Assert.fail("testHelloAppRun3_literalMutationNumber154_literalMutationString736 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber154_literalMutationNumber746_failAssert64() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 21;
            String countString = Integer.toString(myCount);
            String helloString = "---------------------- Hello World !";
            String MyTracesName = "hello_run3.traces";
            myApp = new HelloApp(myCount, MyTracesName);
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTraces();
            ((HelloApp) (myApp)).getMyPrintCount();
            myApp.run();
            fileContent = new MyStorage(myApp.getMyTracesName());
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            fileContent.readData();
            boolean o_testHelloAppRun3_literalMutationNumber154__20 = fileContent.isEqual(myApp.getMyTraces());
            boolean o_testHelloAppRun3_literalMutationNumber154__22 = countString.equals(fileContent.getData(0));
            boolean o_testHelloAppRun3_literalMutationNumber154__24 = helloString.equals(fileContent.getData(4));
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getShouldPrintOnStdout();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((HelloApp) (myApp)).getMyTracesName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((HelloApp) (myApp)).getMyPrintCount();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getDataSize();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            ((MyStorage) (fileContent)).getFileName();
            org.junit.Assert.fail("testHelloAppRun3_literalMutationNumber154_literalMutationNumber746 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 4, Size: 4", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationString164_failAssert4_literalMutationString912() throws Exception {
        {
            HelloApp myApp = null;
            Assert.assertNull(myApp);
            File theFile = null;
            MyStorage fileContent = null;
            Assert.assertNull(fileContent);
            int myCount = 22;
            String countString = Integer.toString(myCount);
            Assert.assertEquals("22", countString);
            String helloString = "---------------------- Hello World !";
            Assert.assertEquals("---------------------- Hello World !", helloString);
            String MyTracesName = "T";
            Assert.assertEquals("T", MyTracesName);
            myApp = new HelloApp(myCount, MyTracesName);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("T", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
            myApp.run();
            fileContent = new MyStorage(myApp.getMyTracesName());
            Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("T", ((MyStorage) (fileContent)).getFileName());
            fileContent.readData();
            boolean o_testHelloAppRun3_literalMutationString164_failAssert4_literalMutationString912__17 = fileContent.isEqual(myApp.getMyTraces());
            Assert.assertTrue(o_testHelloAppRun3_literalMutationString164_failAssert4_literalMutationString912__17);
            boolean o_testHelloAppRun3_literalMutationString164_failAssert4_literalMutationString912__19 = countString.equals(fileContent.getData(0));
            Assert.assertTrue(o_testHelloAppRun3_literalMutationString164_failAssert4_literalMutationString912__19);
            boolean o_testHelloAppRun3_literalMutationString164_failAssert4_literalMutationString912__21 = helloString.equals(fileContent.getData(2));
            Assert.assertTrue(o_testHelloAppRun3_literalMutationString164_failAssert4_literalMutationString912__21);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("T", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertEquals("T", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("T", ((MyStorage) (fileContent)).getFileName());
            Assert.assertEquals("22", countString);
            Assert.assertEquals("---------------------- Hello World !", helloString);
            Assert.assertEquals("T", MyTracesName);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("T", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertEquals("T", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("T", ((MyStorage) (fileContent)).getFileName());
            Assert.assertTrue(o_testHelloAppRun3_literalMutationString164_failAssert4_literalMutationString912__17);
            Assert.assertTrue(o_testHelloAppRun3_literalMutationString164_failAssert4_literalMutationString912__19);
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationString164_failAssert4_literalMutationNumber900_failAssert86() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 0;
                String countString = Integer.toString(myCount);
                String helloString = "---------------------- Hello World !";
                String MyTracesName = "";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
                helloString.equals(fileContent.getData(2));
            }
            org.junit.Assert.fail("testHelloAppRun3_literalMutationString164_failAssert4_literalMutationNumber900 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationString164_failAssert4_literalMutationNumber901_failAssert87() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 21;
                String countString = Integer.toString(myCount);
                String helloString = "---------------------- Hello World !";
                String MyTracesName = "";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
                helloString.equals(fileContent.getData(2));
            }
            org.junit.Assert.fail("testHelloAppRun3_literalMutationString164_failAssert4_literalMutationNumber901 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationString164_failAssert4_literalMutationNumber920_failAssert104() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 22;
                String countString = Integer.toString(myCount);
                String helloString = "---------------------- Hello World !";
                String MyTracesName = "";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
                helloString.equals(fileContent.getData(0));
            }
            org.junit.Assert.fail("testHelloAppRun3_literalMutationString164_failAssert4_literalMutationNumber920 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationString167_failAssert5_literalMutationString980() throws Exception {
        {
            HelloApp myApp = null;
            Assert.assertNull(myApp);
            File theFile = null;
            MyStorage fileContent = null;
            Assert.assertNull(fileContent);
            int myCount = 22;
            String countString = Integer.toString(myCount);
            Assert.assertEquals("22", countString);
            String helloString = "---------------------- Hello World !";
            Assert.assertEquals("---------------------- Hello World !", helloString);
            String MyTracesName = "P=,y4JV)d4}^w[&oD";
            Assert.assertEquals("P=,y4JV)d4}^w[&oD", MyTracesName);
            myApp = new HelloApp(myCount, MyTracesName);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("P=,y4JV)d4}^w[&oD", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
            myApp.run();
            fileContent = new MyStorage(myApp.getMyTracesName());
            Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("P=,y4JV)d4}^w[&oD", ((MyStorage) (fileContent)).getFileName());
            fileContent.readData();
            boolean o_testHelloAppRun3_literalMutationString167_failAssert5_literalMutationString980__17 = fileContent.isEqual(myApp.getMyTraces());
            Assert.assertTrue(o_testHelloAppRun3_literalMutationString167_failAssert5_literalMutationString980__17);
            boolean o_testHelloAppRun3_literalMutationString167_failAssert5_literalMutationString980__19 = countString.equals(fileContent.getData(0));
            Assert.assertTrue(o_testHelloAppRun3_literalMutationString167_failAssert5_literalMutationString980__19);
            boolean o_testHelloAppRun3_literalMutationString167_failAssert5_literalMutationString980__21 = helloString.equals(fileContent.getData(2));
            Assert.assertTrue(o_testHelloAppRun3_literalMutationString167_failAssert5_literalMutationString980__21);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("P=,y4JV)d4}^w[&oD", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertEquals("P=,y4JV)d4}^w[&oD", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("P=,y4JV)d4}^w[&oD", ((MyStorage) (fileContent)).getFileName());
            Assert.assertEquals("22", countString);
            Assert.assertEquals("---------------------- Hello World !", helloString);
            Assert.assertEquals("P=,y4JV)d4}^w[&oD", MyTracesName);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("P=,y4JV)d4}^w[&oD", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertEquals("P=,y4JV)d4}^w[&oD", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("P=,y4JV)d4}^w[&oD", ((MyStorage) (fileContent)).getFileName());
            Assert.assertTrue(o_testHelloAppRun3_literalMutationString167_failAssert5_literalMutationString980__17);
            Assert.assertTrue(o_testHelloAppRun3_literalMutationString167_failAssert5_literalMutationString980__19);
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationString167_failAssert5_literalMutationNumber968_failAssert106() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 0;
                String countString = Integer.toString(myCount);
                String helloString = "---------------------- Hello World !";
                String MyTracesName = "`_8;0L`A=SO/woO!O";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
                helloString.equals(fileContent.getData(2));
            }
            org.junit.Assert.fail("testHelloAppRun3_literalMutationString167_failAssert5_literalMutationNumber968 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationString167_failAssert5_literalMutationNumber969_failAssert107() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 21;
                String countString = Integer.toString(myCount);
                String helloString = "---------------------- Hello World !";
                String MyTracesName = "`_8;0L`A=SO/woO!O";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
                helloString.equals(fileContent.getData(2));
            }
            org.junit.Assert.fail("testHelloAppRun3_literalMutationString167_failAssert5_literalMutationNumber969 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationString167_failAssert5_literalMutationNumber972_failAssert110() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 23;
                String countString = Integer.toString(myCount);
                String helloString = "---------------------- Hello World !";
                String MyTracesName = "`_8;0L`A=SO/woO!O";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
                helloString.equals(fileContent.getData(2));
            }
            org.junit.Assert.fail("testHelloAppRun3_literalMutationString167_failAssert5_literalMutationNumber972 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationString167_failAssert5_literalMutationString979_failAssert117() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 22;
                String countString = Integer.toString(myCount);
                String helloString = "---------------------- Hello World !";
                String MyTracesName = "";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData(0));
                helloString.equals(fileContent.getData(2));
            }
            org.junit.Assert.fail("testHelloAppRun3_literalMutationString167_failAssert5_literalMutationString979 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationNumber838() throws Exception {
        {
            HelloApp myApp = null;
            Assert.assertNull(myApp);
            File theFile = null;
            MyStorage fileContent = null;
            Assert.assertNull(fileContent);
            int myCount = 22;
            String countString = Integer.toString(myCount);
            Assert.assertEquals("22", countString);
            String helloString = "---------------------- Hello World !";
            Assert.assertEquals("---------------------- Hello World !", helloString);
            String MyTracesName = "hello_run3.traces";
            Assert.assertEquals("hello_run3.traces", MyTracesName);
            myApp = new HelloApp(myCount, MyTracesName);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
            myApp.run();
            fileContent = new MyStorage(myApp.getMyTracesName());
            Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
            fileContent.readData();
            boolean o_testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationNumber838__17 = fileContent.isEqual(myApp.getMyTraces());
            Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationNumber838__17);
            boolean o_testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationNumber838__19 = countString.equals(fileContent.getData(2));
            Assert.assertFalse(o_testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationNumber838__19);
            boolean o_testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationNumber838__21 = helloString.equals(fileContent.getData(2));
            Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationNumber838__21);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
            Assert.assertEquals("22", countString);
            Assert.assertEquals("---------------------- Hello World !", helloString);
            Assert.assertEquals("hello_run3.traces", MyTracesName);
            Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
            Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
            Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
            Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
            Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
            Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
            Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
            Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationNumber838__17);
            Assert.assertFalse(o_testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationNumber838__19);
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationNumber821_failAssert65() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 0;
                String countString = Integer.toString(myCount);
                String helloString = "---------------------- Hello World !";
                String MyTracesName = "hello_run3.traces";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData((-1)));
                helloString.equals(fileContent.getData(2));
            }
            org.junit.Assert.fail("testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationNumber821 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationNumber822_failAssert66() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 21;
                String countString = Integer.toString(myCount);
                String helloString = "---------------------- Hello World !";
                String MyTracesName = "hello_run3.traces";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData((-1)));
                helloString.equals(fileContent.getData(2));
            }
            org.junit.Assert.fail("testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationNumber822 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationString830_failAssert74() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 22;
                String countString = Integer.toString(myCount);
                String helloString = "--------------------- Hello World !";
                String MyTracesName = "hello_run3.traces";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData((-1)));
                helloString.equals(fileContent.getData(2));
            }
            org.junit.Assert.fail("testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationString830 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationString832_failAssert76() throws Exception {
        try {
            {
                HelloApp myApp = null;
                File theFile = null;
                MyStorage fileContent = null;
                int myCount = 22;
                String countString = Integer.toString(myCount);
                String helloString = "---------------------- Hello World !";
                String MyTracesName = "";
                myApp = new HelloApp(myCount, MyTracesName);
                myApp.run();
                fileContent = new MyStorage(myApp.getMyTracesName());
                fileContent.readData();
                fileContent.isEqual(myApp.getMyTraces());
                countString.equals(fileContent.getData((-1)));
                helloString.equals(fileContent.getData(2));
            }
            org.junit.Assert.fail("testHelloAppRun3_literalMutationNumber171_failAssert6_literalMutationString832 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }
}

