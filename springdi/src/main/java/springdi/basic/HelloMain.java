	package springdi.basic;
	
	import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
	
	public class HelloMain {
	
		public static void main(String[] args) {
			
			ApplicationContext ac = 
//					new GenericXmlApplicationContext("basic-beanContainer.xml");
					new ClassPathXmlApplicationContext("basic-beanContainer.xml");
			Hello hello = (Hello)ac.getBean("h1"); // dependency lookup
			hello.printHello();
			Hello hello2 = ac.getBean("h1", Hello.class); // xml에 있는 Hello클래스를 불러오기. 형변환 필요 X. 단, xml에 Hello(Bean)가 하나만 있어야함
			Hello hello3 = ac.getBean("h2", Hello.class); 
			
			hello2.printHello();
		}
	
	}
