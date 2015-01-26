package com.chapter5._ach;

/**
 * By adding the synchronized keyword to getInstance(), 
 * we force every thread to wait its turn before it can enter the method. 
 * That is , no two threads may enter the method at the same time.
 * 
 * @WARN 
 * Do nothing if the performance of getInstance() is not critical.
 * if getInstance() method is not causing substantial overhead for your application, forget about it. 
 * Synchronizing getInstance is straightforward and effective. Just remember that synchronizing a method
 * can decrease performance by factor of 100, so if height traffic part of your code begins using getInstance()
 * you may have to look at 'double-check locking' implementation. 
 */

public class SingletonUsedByThreads {
	private static SingletonUsedByThreads uniqueInstance;
	
	private SingletonUsedByThreads(){};
	
	public static synchronized SingletonUsedByThreads getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new SingletonUsedByThreads();
		}
		return uniqueInstance;
	}
	
}
