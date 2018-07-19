package adapterPattern;

public class Test {
public static void main(String[] args) {
	

	// TODO Auto-generated method stub
	
DBSocketInterface dbSoket = new DBSocket();

Hotel hotel = new Hotel(dbSoket);

//ÔÚÂÃ¹İ³äµç
hotel.charge();
}
}
