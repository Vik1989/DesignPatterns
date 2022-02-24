package com.vikash.patterns.strategy;

public class MoveByFlying implements WalkingStrategy{
    @Override
    public void move() {
        System.out.println("I move by flying");
    }
}
