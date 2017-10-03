/**
 * 
 */
package practice.framework.temptest;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;



import practice.framework.utils.FrameworkListener;

/**
 * @author Dzmitry_Malchanau
 *
 */
public class TempTESTNGtest {
	
	public static void main(String[] args) {
		FrameworkListener frameworkListener= new FrameworkListener();
		TestNG testNg = new TestNG();
		
		XmlSuite customSuite = new XmlSuite();
		customSuite.setName("CustomSiute");
		customSuite.setParallel(XmlSuite.ParallelMode.METHODS);
		customSuite.setThreadCount(2);
		
		List<String> files=new ArrayList<>();
		files.addAll(new ArrayList<String>(){{
			add("suites/test/test.xml");}});
		customSuite.setSuiteFiles(files);
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(customSuite);
		testNg.setXmlSuites(suites);
		testNg.addListener(frameworkListener);
		testNg.run();
		
		}

}
