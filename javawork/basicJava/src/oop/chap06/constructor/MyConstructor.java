package oop.chap06.constructor;

public class MyConstructor {
	private String name;
	private String id;
	private String path;
	private String nickName;
	private String addr;
	private int point;
	
	public MyConstructor() {
		System.out.println("기본 생성자");
	}
	
	public MyConstructor(String name, String id, String path) {
		System.out.println("매개변수가 3개 있는 생성자");
		// 멤버변수(인스턴스 변수, 객체 변수)를 초기화
		this.name = name;
		this.id = id;
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
}
