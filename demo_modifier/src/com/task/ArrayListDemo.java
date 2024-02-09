package com.task;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(100);
		a.add("gopi");
		a.add(10.3);
		a.add('A');
		a.add(100);
		System.out.println(a);
		ArrayList a1=new ArrayList();
		a1.add("task");
		a1.addAll(a);
		System.out.println(a1);
		System.out.println(a.contains("gopi"));
		System.out.println(a.hashCode());
		
	}

}
