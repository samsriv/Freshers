package sam;

import java.io.IOException;

class SuperClass{
	int a = 1000;
	public void foo(){
		System.out.println("I m in super class");
	}
}

class SubClass1 extends SuperClass{
	int a = 1001;
	public void foo(){
		System.out.println("I m in sub class");
	}
}

class SubClass2 extends SuperClass{
	int a = 1002;
}

public class DynamicPoly {

	public static void main(String[] args){
		SuperClass superClass = new SubClass1();
		superClass.foo();
		System.out.println(superClass.a);
		superClass = new SubClass2();
		superClass.foo();
	}
}
