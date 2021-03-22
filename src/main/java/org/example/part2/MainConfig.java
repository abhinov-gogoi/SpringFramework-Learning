package org.example.part2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.part2")
public class MainConfig {

    // instead of manually configuring beans we can use @Component on top of those classes itself
    // and then use @ComponentScan in the configuration file here
//    @Bean
//    public Phone getPhone() {
//        return new Phone();
//    }
//
//    @Bean
//    public MobileProcessor getProcessor() {
//        return new Snapdragon();
//    }
}
