package Factorymodel;

//��ͨ����ģʽ
/*public class HumanFactory {
 public Human createHuman(String gender) {
	 if(gender.equals("male")) {
		 return new Male();
	 }else if (gender.equals("female")) {
		 return new Female();
	 }else {
		 System.out.println("��������ȷ���ͣ�");
		 return null;
	 }
 }
}*/
/* �������ģʽ
public class HumanFactory {
	public Male createMale() {
		return new Male();
	}

	public Female createFemale() {
		return new Female();
	}
}*/

//��̬����ģʽ
public class HumanFactory{
	public static Male createMale() {
		return new Male();
	}
	public static Female createFemale() {
		return new Female();
	}
}
