package polymorphism;

import org.springframework.stereotype.Component;

//@Component("sony")      // 이름을 붙이지 않으면 클래스 이름의 첫글자를 소문자로 가지는 클래스가 디폴트 값으로 가진다. 
public class SonySpeaker implements Speaker {
	
	//생성자
	public SonySpeaker() {
		System.out.println("SonySpeaker 생성자 --- 객체 생성");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker --- 소리 울린다.");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker --- 소리 내린다.");
	}
}
