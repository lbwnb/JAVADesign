package singletonMode;


//懒汉模式(线程安全)
public class Wifes {
	//一开始没有新建实例
	private static Wifes wifes;
	
	private Wifes() {
		
	}
	//需要时创建
	public static synchronized Wifes getWifeS() {
		if(wifes == null) {
			wifes = new Wifes();
		}
		return wifes;
	}

	
}
