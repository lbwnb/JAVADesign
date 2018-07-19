package singletonMode;

//饿汉模式
public class Wife {

	//一开始就新建一个实例
	private static final Wife wife = new Wife();

	//默认构造方法
	private Wife() {
		
	}
	
	//获得实例的方法
	public static Wife getWife() {
		return wife;
	}
}
