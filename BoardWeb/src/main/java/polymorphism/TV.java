package polymorphism;

/* TV 클래스들의 최상위 부모로 사용할 TV 인터페이스를 추가하고, 모든 TV가 공통으로 가져야 할 메소드들을 추상 메소드로 선언 */
public interface TV {
	void powerOn();		// 구현이 안 된 것이다. 그리고 public abstract는 생략 가능.
	void powerOff(); 
	void volumeUp();
	void volumeDown();
}
