package adapterPattern;

//实现旧接口
public class SocketAdapter implements DBSocketInterface {

	
	//组合新接口
	private GBSocketInterface gbSocket;
	
	/**
	 * 传入一个新接口的实现类
	 * @param gbSocket
	 */
	public SocketAdapter(GBSocketInterface gbSocket) {
		this.gbSocket = gbSocket;
	}



	/**
	 * 将对旧接口的调用适配到新接口
	 */
	@Override
	public void powerWithTwoRound() {
		// TODO Auto-generated method stub
		gbSocket.powerWithThreeFlat();

	}

}
