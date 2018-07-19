package singletonMode;
//˫������getWifess()����
public class Wifess{
	private volatile static Wifess wifess;
	private Wifess() {
		
	}
	
public static Wifess getWifess() {
	//��һ�����������Ϊ��ֱ�ӷ���ʵ������Ϊ�ս�����һ��
	if(wifess == null) {
		synchronized(Wifess.class) {
			//�ڶ�������������Ϊ�п��ܶ���߳̽��뵽if�����
			if(wifess == null) {
				wifess = new Wifess();
			}
		}
	}
	return wifess;

}
}