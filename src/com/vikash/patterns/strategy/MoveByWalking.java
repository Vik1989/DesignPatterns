package com.vikash.patterns.strategy;

public class MoveByWalking implements WalkingStrategy{
    @Override
    public void move() {
        System.out.println("I move by walking");
    }
}
