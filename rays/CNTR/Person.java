package in.co.rays.CNTR;

public class Person {
	private String name ;
	private int age ;
	private String address;
	private int empid;
	
	Person(){
		
	}
	Person(int age){
		this();
		this.age = age;
		System.out.println("one parameter constructor");
	}
	Person(String name , int age){
		this();
		this.address = name;
		this.age = age;
		System.out.println("two parametr constructor");
	}
		
	
	Person(String name , String addres , int empid){
		this();
		this.address = address;
		this.name = name;
		this.empid = empid; 
		System.out.println("three parameter constructor");
	}
		
	}


