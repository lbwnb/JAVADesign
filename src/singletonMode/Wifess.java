package singletonMode;
//双重锁的getWifess()方法
public class Wifess{
	private volatile static Wifess wifess;
	private Wifess() {
		
	}
	
public static Wifess getWifess() {
	//第一歌检验锁，不为空直接返回实例对象，为空进入下一步
	if(wifess == null) {
		synchronized(Wifess.class) {
			//第二个检验锁，因为有可能多个线程进入到if语句内
			if(wifess == null) {
				wifess = new Wifess();
			}
		}
	}
	return wifess;

}
}