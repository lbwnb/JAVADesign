package singletonMode;

//����ģʽ
public class Wife {

	//һ��ʼ���½�һ��ʵ��
	private static final Wife wife = new Wife();

	//Ĭ�Ϲ��췽��
	private Wife() {
		
	}
	
	//���ʵ���ķ���
	public static Wife getWife() {
		return wife;
	}
}
