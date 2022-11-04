package javalangEx;

import inheritance.VIPCustomer;

public class ClassEx02 {

	public static void main(String[] args) throws Exception  {
		Class c1 = Class.forName("java.lang.String");
		System.out.println(c1.toString());
		System.out.println(c1.toGenericString());
		System.out.println();
		
		c1 = Class.forName("java.util.List");
		System.out.println(c1.toString());
		System.out.println(c1.toGenericString());
		System.out.println();	
		
		c1 = Class.forName("java.lang.Object");
		System.out.println(c1.toString());
		System.out.println(c1.toGenericString());
		System.out.println();
				
		c1 = Class.forName("java.awt.event.WindowAdapter");
		System.out.println(c1.toString());
		System.out.println(c1.toGenericString());
		
	
		c1 = Class.forName(VIPCustomer.class.getName());
		VIPCustomer v = (VIPCustomer) c1.newInstance();
		System.out.println("아이디: " + v.getAgentID());


	}

}
