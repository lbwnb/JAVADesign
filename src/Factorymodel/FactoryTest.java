package Factorymodel;

//��ͨ����ģʽ
/*public class FactoryTest {
public static void main(String[] args) {
	HumanFactory factory = new HumanFactory();
	Human male = factory.createHuman("male");
	male.eat();
	male.sleep();
	male.beat();
}
}
*/
/* �������ģʽ
public class FactoryTest{
	public static void main(String[] args) {
		HumanFactory factory = new HumanFactory();
		Human male = factory.createMale();
		Human Female = factory.createFemale();
		male.eat();
		male.sleep();
		male.beat();
		Female.eat();
		Female.sleep();
		Female.beat();
	}
}*/

public class FactoryTest{
	public static void main(String[] args) {
		Human male = HumanFactory.createMale();
		male.eat();
		male.sleep();
		male.beat();
	}
}