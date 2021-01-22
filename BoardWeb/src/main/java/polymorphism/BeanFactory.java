package polymorphism;

// Factory 디자인 패턴 ----> 장점: 소스코드 수정을 하지 않는다.
public class BeanFactory {
	
	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTV();     // SamsungTV의 인스턴스를 만들어서 return을 한다.
		} else if(beanName.equals("lg")) {
			return new LgTV();     
		}
		return null;
		
//		switch(beanName) {
//		case "samsung":
//			return new SamsungTV();
//		case "lg":
//			return new LgTV();
//		}
//		return null;
	}
}
