package observerPattern;

//ʵ�ֹ۲��ߣ�������Ƶ����������
public class VideoFans implements Observer{
	private String name;
	
	public VideoFans(String name) {
		this.name = name;
	}

	@Override
	public void update(Subject s) {
		// TODO Auto-generated method stub
		System.out.println(this.name+", new videos are availabel! ");
		
		System.out.println(s);
		
	}
	

}
