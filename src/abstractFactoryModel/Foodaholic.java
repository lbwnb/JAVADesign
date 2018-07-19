package abstractFactoryModel;

//����ʳ��
interface Food{
	public String getFoodName();
}

//����;�
interface TableWare{
	public String getToolName();
}

//���󹤳�
interface KitchenFactory{
	public Food getFood();
	public TableWare getTableWare();
}

//����ʳ��Apple�Ķ�������
class Apple implements Food{
	public String getFoodName() {
		return "apple";
	}
}

//����;�Knife�Ķ�������
class Knife implements TableWare{
	public String getToolName() {
		return "knife";
	}
	
}

//�Ծ��幤��AKitchenΪ��
class AKitchen implements KitchenFactory{

	@Override
	public Food getFood() {
		// TODO Auto-generated method stub
		return new Apple();
	}

	@Override
	public TableWare getTableWare() {
		// TODO Auto-generated method stub
		return new Knife();
	}
	
}
public class Foodaholic {
	
	public void eat(KitchenFactory k) {
		System.out.println("A foodaholic is eating" + k.getFood().getFoodName() + " with " + k.getTableWare().getToolName() );
	}
   public static void main(String[] args) {
	   Foodaholic fh = new Foodaholic();
	   KitchenFactory kf = new AKitchen();
	   fh.eat(kf);
   }
}
