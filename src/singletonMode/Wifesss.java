package singletonMode;

//��̬�ڲ���
public class Wifesss {
	private static class WifeHolder{
		private static final Wifesss wifesss = new Wifesss();
	}
	private Wifesss() {
		
	}
	public static Wifesss getWifesss() {
		return WifeHolder.wifesss;
	}

}
