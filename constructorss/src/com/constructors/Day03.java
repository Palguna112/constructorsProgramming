package com.constructors;
class Dog{
	private String name;
	private int age;
	private float cost;
	Dog(String name){
		this();
		this.name=name;
	}
	Dog(int age){
		this.age=age;
		this.cost=15_000;
	}
	Dog(){
		this(2);
		System.out.println("Imside Zero Parameter Constructor");
		
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public float getCost() {
		return cost;
	}
}

public class Day03 {

	public static void main(String[] args) {
		Dog d =new Dog("maxy");
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d.getCost());
	}

}
