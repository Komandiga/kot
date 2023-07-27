//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());


        HelloWorld hwb =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cb1 = (Cat) applicationContext.getBean("cat");
        Cat cb2 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean == hwb);
        System.out.println(cb1 == cb2);
    }

}
