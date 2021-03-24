package org.example.part2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean
    public Phone getPhone() {
        return new Phone();
    }

}
