package adapterPattern;

public class TestAdapter {
public static void main(String[] args) {
	
	//ȥ�¹����δ���һ����������
	GBSocketInterface gbSocket = new GBSocket();
	
	//�����¹����ҵ����ݣ�ʹ�õĵ¹���׼���
	Hotel hotel =  new Hotel();
	
	//���Լ����ĳ�����嵽����������
	SocketAdapter socketAdapter = new SocketAdapter(gbSocket);
	//�����������뵽���ݲ�����
	hotel.setDbSocket(socketAdapter);
	
	//ʹ�������������
	hotel.charge();
}
}
