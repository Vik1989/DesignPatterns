package com.vikash.patterns.strategy;

public class Dog extends Animal{
    public Dog(WalkingStrategy walkingStrategy) {
        super(walkingStrategy);
    }
}
