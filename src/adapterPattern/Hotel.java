package adapterPattern;

/**
 * �¹�����
 * @author qiux
 *
 */
public class Hotel {

	//��һ���±���
	private DBSocketInterface dbSocket;

	
	
	public Hotel() {
		
	}



	public Hotel(DBSocketInterface dbSocket) {
		
		this.dbSocket = dbSocket;
	}



	public void setDbSocket(DBSocketInterface dbSocket) {
		this.dbSocket = dbSocket;
	}
	
	//��繦��
	public void charge() {
		
		//ʹ�õ±��ڳ��
		dbSocket.powerWithTwoRound();
	}
	
	
	
}
