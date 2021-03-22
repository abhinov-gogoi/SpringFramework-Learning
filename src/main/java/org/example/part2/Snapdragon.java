package org.example.part2;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor{
    @Override
    public void process() {
        System.out.println("This phone runs a snapdragon");
    }
}
