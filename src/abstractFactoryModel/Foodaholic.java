package abstractFactoryModel;

//抽象食物
interface Food{
	public String getFoodName();
}

//抽象餐具
interface TableWare{
	public String getToolName();
}

//抽象工厂
interface KitchenFactory{
	public Food getFood();
	public TableWare getTableWare();
}

//具体食物Apple的定义如下
class Apple implements Food{
	public String getFoodName() {
		return "apple";
	}
}

//具体餐具Knife的定义如下
class Knife implements TableWare{
	public String getToolName() {
		return "knife";
	}
	
}

//以具体工厂AKitchen为例
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
