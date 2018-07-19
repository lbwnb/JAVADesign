package test;

public class Test {
public static void main(String[] args) {
	

	// TODO Auto-generated method stub
	
DBSocketInterface dbSoket = new DBSocket();

Hotel hotel = new Hotel(dbSoket);

//ÔÚÂÃ¹Ý³äµç
hotel.charge();
}
}
