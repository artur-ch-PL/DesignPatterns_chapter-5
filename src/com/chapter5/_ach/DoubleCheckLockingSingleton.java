package com.chapter5._ach;

/**
 * More efficiency but less readable way to use singleton by multi-threads architecture.
 */
public class DoubleCheckLockingSingleton {
	/**
	 * Volatile keyword ensures that multiple threads handle the uniqueInstance variable 
	 * correctly when it is being initialized to the Singletone instance
	 */
	private volatile static DoubleCheckLockingSingleton uniqueInstance;
	
	private DoubleCheckLockingSingleton(){};
	
	/**
	 * TIP: Synchronized block is done only once (at the first time). 
	 */
	public static DoubleCheckLockingSingleton getInstance(){
		if(uniqueInstance == null){
			synchronized(DoubleCheckLockingSingleton.class){
				if(uniqueInstance == null){
					uniqueInstance = new DoubleCheckLockingSingleton();
				}
			}
		}
		return uniqueInstance;
	}
	
	
}
