package DP05_SingletonPattern.ThreadSafe;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getDescription());

		Singleton singleton2 = Singleton.getInstance(); // 동일 인스턴스
		System.out.println(singleton2.getDescription());
	}
}
