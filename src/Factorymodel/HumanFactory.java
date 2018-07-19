package Factorymodel;

//普通工厂模式
/*public class HumanFactory {
 public Human createHuman(String gender) {
	 if(gender.equals("male")) {
		 return new Male();
	 }else if (gender.equals("female")) {
		 return new Female();
	 }else {
		 System.out.println("请输入正确类型！");
		 return null;
	 }
 }
}*/
/* 多个工厂模式
public class HumanFactory {
	public Male createMale() {
		return new Male();
	}

	public Female createFemale() {
		return new Female();
	}
}*/

//静态工厂模式
public class HumanFactory{
	public static Male createMale() {
		return new Male();
	}
	public static Female createFemale() {
		return new Female();
	}
}
