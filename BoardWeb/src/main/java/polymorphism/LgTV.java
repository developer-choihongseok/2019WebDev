package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/* TV 인터페이스에 선언된 추상 메소드들을 모두 재정의 한 것.
 turnOn() --> powerOn()
 turnOff() --> powerOff()
 soundUp() ---> volumeUp()
 soundDown() ---> volumeDown()
*/
@Component("tv")
public class LgTV implements TV {
	
	@Autowired
	Speaker speaker;     // Speaker가 의존성 주입이 된다. 
	
	// 디폴트 생성자
	public LgTV() {
		System.out.println("LgTV 생성자 --- 객체 생성");
	}
	
	@Override
	public void powerOn() {  
		System.out.println("LgTV---전원 켠다.");
	}
	
	@Override
	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}
	
	@Override
	public void volumeUp() {
//		System.out.println("LgTV---소리 울린다.");
		speaker.volumeUp();
	}
	
	@Override
	public void volumeDown() {
//		System.out.println("LgTV---소리 내린다.");
		speaker.volumeDown();
	}
}
