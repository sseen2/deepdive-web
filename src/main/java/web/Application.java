package web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.common.Animal;
import web.common.Cat;
import web.common.Dog;
import web.common.Pig;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        Animal cheese = context.getBean("cheese", Cat.class);
        System.out.println("cheese = " + cheese);

        Animal chihuahua = context.getBean("chihuahua", Dog.class);
        System.out.println("chihuahua = " + chihuahua);

        Animal pig = context.getBean("pig", Pig.class);
        System.out.println("pig = " + pig);
    }
}
