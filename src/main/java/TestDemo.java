
import com.udt.SpringBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UDIT
 */
public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext apps = new ClassPathXmlApplicationContext("./applicationContext.xml");
        SpringBean bean = (SpringBean)apps.getBean("springBean");
        bean.sayHello("SPRING");
    }
}
