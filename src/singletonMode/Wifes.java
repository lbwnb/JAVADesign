package singletonMode;


//����ģʽ(�̰߳�ȫ)
public class Wifes {
	//һ��ʼû���½�ʵ��
	private static Wifes wifes;
	
	private Wifes() {
		
	}
	//��Ҫʱ����
	public static synchronized Wifes getWifeS() {
		if(wifes == null) {
			wifes = new Wifes();
		}
		return wifes;
	}

	
}
