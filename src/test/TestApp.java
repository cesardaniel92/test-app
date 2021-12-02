/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import common_tools.Common_Tools;

/**
 *
 * @author ctamayo
 */
public class TestApp {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws Exception{
       
       
        System.out.println("Main tester code with args ...");
        
        for (String arg:args){
            System.out.println(arg);
        }
        
//        Helper1 myHelper1 = new Helper1();       
        
//        Common_Tools.runTestNgXml("testng.xml");                
//        String FILENAME = "test-output/testng-results.xml";
//        Common_Tools.DisplayTestReport(FILENAME);
        
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testNG = new TestNG();
        List<String> suites = new ArrayList();
        suites.add("testng.xml");//path to xml..
        testNG.setTestSuites(suites);
        String TestOutputPath = System.getProperty("user.dir");         
        testNG.setOutputDirectory(TestOutputPath + "/testng-output");  
        testNG.run();
        
        // simple change to trigger Team City build ...
        
//        return;
    }
    public static int returnOne(){
        return 1;
    }
    
}
