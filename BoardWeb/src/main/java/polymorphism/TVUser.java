package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// SamsungTV
//		SamsungTV tv =  new SamsungTV();		
//	    tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		// LgTV
//		LgTV tv = new LgTV();
//		tv.turnOn();
//		tv.soundUp();
//		tv.soundDown();
//		tv.turnOff();
		
		// 결합도를 낮추는 방법!!
		
		// 1. 다형성 구현  
//		TV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		// 2. Factory 디자인 패턴을 적용하는 방법
//		BeanFactory factory = new BeanFactory();   // BeanFactory의 인스턴스를 만든다.
//		TV tv = (TV)factory.getBean(args[0]);     // args[0] : main(String[] args)을 받는다.
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		// 3. applicationContext.xml 파일에 빈을 생성
		// Spring 컨테이너 구동
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		// Spring 컨테이너가 필요한 객체를 요청: 룩업(Look up)함.
		TV tv = (TV)factory.getBean("tv");     // 이름이 tv인 객체를 getBean() 메소드를 이용하여 요청.
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
//		TV tv1 = (TV)factory.getBean("tv");
//		TV tv2 = (TV)factory.getBean("tv");
//		TV tv3 = (TV)factory.getBean("tv");
		
		// String 컨테이너를 종료
		factory.close();
	}
}
