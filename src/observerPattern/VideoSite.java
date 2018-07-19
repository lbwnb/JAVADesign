package observerPattern;

import java.util.ArrayList;

//��Ƶ��վĳ��ʵ��Subject�ӿ�
public class VideoSite implements Subject {

	// �۲����б� �Լ� �����˵���Ƶ�б�
	private ArrayList<Observer> userList;
	private ArrayList<String> videos;

	public VideoSite() {
		userList = new ArrayList<Observer>();
		videos = new ArrayList<String>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		userList.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		userList.remove(o);

	}

	@Override
	public void notifyAllObservers() {
		// TODO Auto-generated method stub
		for (Observer o : userList) {
			o.update(this);
		}

	}

	public void addVideos(String video) {
		this.videos.add(video);
		notifyAllObservers();
	}

	public ArrayList<String> getVideos() {
		return videos;
	}
	
	public String toString() {
		return videos.toString();
	}

}
