package com.task;
import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(101,"gopi");
		m.put(102, "krishna");
		System.out.println(m);

	System.out.println(m.hashCode());
	System.out.println(m.get(101));
	System.out.println(m.values());
	System.out.println(m.keySet());
	}
		}

