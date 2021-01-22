package polymorphism;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	private int price;
	
	// 기본(default) 생성자 생성     --> SamsungTV 객체가 언제 생성되는지 확인하기 위해서.
	public SamsungTV() {
		System.out.println("SamsungTV 생성자1(기본) --- 객체 생성");
	}
	
	// 생성자 오버로딩을 통해서 생성자 인젝션을 하겠다.
	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV 생성자2(오버로딩) --- 객체 생성");
		this.speaker = speaker;
	}
	
	// 생성자 오버로딩을 통해서 생성자 인젝션을 하겠다 -> 생성자 인젝션에 활용
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV 생성자3(오버로딩) --- 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	//setter -> setter 인젝션의 활용
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
		System.out.println("setSpeaker() 호출");
	}
	
	//setter -> setter 인젝션의 활용
	public void setPrice(int price) {
		this.price = price;
		System.out.println("setPrice() 호출");
	}
		
	//init-method 속성: 객체를 생성한 후에 멤버변수 초기화 작업이 필요하다면, Servelt의 init() 같은 메소드가 필요.
	public void initMethod() {
		System.out.println("initMethod --- 객체 초기화 작업 처리");
	}
	
	//destroy-method 속성: 스프링 컨테이너가 객체를 삭제하기 직전에 호출될 임의의 메소드를 지정할 수 있다.
	public void destroyMethod() {
		System.out.println("destroyMethod --- 객체 삭제 전에 해야할 내용 처리");
	}
		
	@Override
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다. (가격: " + price + ")");
	}
	
	@Override
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}
	
	@Override
	public void volumeUp() {
//		System.out.println("SamsungTV---소리 울린다.");
//		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	
	@Override
	public void volumeDown() {
//		System.out.println("SamsungTV---소리 내린다.");
//		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}
