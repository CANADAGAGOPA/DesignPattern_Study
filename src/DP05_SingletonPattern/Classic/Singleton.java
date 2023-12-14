package DP05_SingletonPattern.Classic;

// NOTE: This is not thread safe!

public class Singleton {
	private static Singleton uniqueInstance; // private static 이여야 한다.
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a classic Singleton!";
	}
}
