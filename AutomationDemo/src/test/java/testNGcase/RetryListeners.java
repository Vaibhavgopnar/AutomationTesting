package testNGcase;

//import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListeners implements IAnnotationTransformer{

	  public void transform(ITestAnnotation annotation,Method testMethod) {
		  
		  annotation.setRetryAnalyzer(Retry.class);
		}
	
}
