package adapterPattern;

public class TestAdapter {
public static void main(String[] args) {
	
	//去德国旅游带了一个国标充电器
	GBSocketInterface gbSocket = new GBSocket();
	
	//来到德国，找到宾馆，使用的德国标准插口
	Hotel hotel =  new Hotel();
	
	//将自己带的充电器插到适配器上中
	SocketAdapter socketAdapter = new SocketAdapter(gbSocket);
	//将适配器插入到宾馆插座上
	hotel.setDbSocket(socketAdapter);
	
	//使用适配器充电了
	hotel.charge();
}
}
