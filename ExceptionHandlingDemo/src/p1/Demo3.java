
package p1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.NamingException;


class TestClass
{
		public void doTest()throws NamingException
		{
			if(true)
			{
				throw new NamingException(); // throw is used to manually generate the exception
				
			}
			if(true)
			{
				throw new NullPointerException();
			}
			if(true)
			{
				throw new ArithmeticException();
			}
		}

}
	

public class Demo3 {

	public static void main(String[] args) {
	
		TestClass test = new TestClass();
		try {
			test.doTest();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			System.out.println(" --- code finally ---");
		}
		
	}
}
