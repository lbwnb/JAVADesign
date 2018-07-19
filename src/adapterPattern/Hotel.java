package adapterPattern;

/**
 * 德国宾馆
 * @author qiux
 *
 */
public class Hotel {

	//有一个德标插口
	private DBSocketInterface dbSocket;

	
	
	public Hotel() {
		
	}



	public Hotel(DBSocketInterface dbSocket) {
		
		this.dbSocket = dbSocket;
	}



	public void setDbSocket(DBSocketInterface dbSocket) {
		this.dbSocket = dbSocket;
	}
	
	//充电功能
	public void charge() {
		
		//使用德标插口充电
		dbSocket.powerWithTwoRound();
	}
	
	
	
}
