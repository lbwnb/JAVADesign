package observerPattern;

import java.util.ArrayList;

//视频网站某狐实现Subject接口
public class VideoSite implements Subject {

	// 观察者列表 以及 更新了的视频列表
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
