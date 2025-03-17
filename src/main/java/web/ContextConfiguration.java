package web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import web.common.Animal;
import web.common.Cat;
import web.common.Dog;
import web.common.Pig;

import java.util.Date;

@Configuration
@PropertySource("animal.properties")
public class ContextConfiguration {

    @Value("${cat.cheese.name}")
    private String cheeseName;

    @Value("${dog.chihuahua.name}")
    private String chihuahuaName;

    @Value("${dog.chihuahua.cryingSound}")
    private String chihuahuaCryingSound;

    @Value("${pig.pig.name}")
    private String pigName;

    @Value("${pig.pig.weight}")
    private int pigWeight;

    @Bean
    public Animal cheese() {
        return new Cat(cheeseName, new Date());
    }

    @Bean
    public Animal chihuahua() {
        return new Dog(chihuahuaName, chihuahuaCryingSound);
    }

    @Bean
    public Animal pig() {
        return new Pig(pigName, pigWeight);
    }
}
