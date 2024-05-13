package com.java8;
//public class TestInheritance  implements FuncInterface,FuncInterfaceII
public class TestInheritance extends TestInheritanceParent implements FuncInterface,FuncInterfaceII 
//public class TestInheritance extends TestInheritanceAbstract implements FuncInterface,FuncInterfaceII 
{

	@Override
	public void abstractFun(int x) {
		System.out.println("TestInheritance : abstractFun");
		
	}

	

	/*@Override
	void abstractFun() {
		// TODO Auto-generated method stub
		
	}*/
	

}
