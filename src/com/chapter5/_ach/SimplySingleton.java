package com.chapter5._ach;

/**
 *  Ensures a class has only one instance, and provides a global point to access it.
 */
public class SimplySingleton {
	boolean state1;
	boolean state2;
	
	private static SimplySingleton uniqueInstance;
	
	private SimplySingleton(){
		this.state1 = true;
		this.state2 = false;
	}
	
	public static SimplySingleton getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new SimplySingleton();
		}
		return uniqueInstance;
	}
	
}
