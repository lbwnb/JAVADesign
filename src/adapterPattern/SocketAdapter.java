package adapterPattern;

//ʵ�־ɽӿ�
public class SocketAdapter implements DBSocketInterface {

	
	//����½ӿ�
	private GBSocketInterface gbSocket;
	
	/**
	 * ����һ���½ӿڵ�ʵ����
	 * @param gbSocket
	 */
	public SocketAdapter(GBSocketInterface gbSocket) {
		this.gbSocket = gbSocket;
	}



	/**
	 * ���Ծɽӿڵĵ������䵽�½ӿ�
	 */
	@Override
	public void powerWithTwoRound() {
		// TODO Auto-generated method stub
		gbSocket.powerWithThreeFlat();

	}

}
