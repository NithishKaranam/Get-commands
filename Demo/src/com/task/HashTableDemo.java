package com.task;
import java.util.*;
public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		h.put(1, "abc");
		h.put(2,"cde");
		h.put(3, "agh");
	//	h.put(null, "gfh");
		h.put(4, null);
		System.out.println(h);

	}

}
