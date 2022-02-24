package com.vikash.patterns.strategy;

public class Animal {

    private WalkingStrategy walkingStrategy;

    public Animal(WalkingStrategy walkingStrategy) {
        this.walkingStrategy = walkingStrategy;
    }

    public WalkingStrategy getWalkingStrategy() {
        return walkingStrategy;
    }

    public void setWalkingStrategy(WalkingStrategy walkingStrategy) {
        this.walkingStrategy = walkingStrategy;
    }

    public void move(){
           this.walkingStrategy.move();
    }

    public static void main(String[] args) {

        Animal animal = new Animal(new MoveByWalking());

        animal.move();
        animal.setWalkingStrategy(new MoveByFlying());

        animal.move();

        Dog dog = new Dog(new MoveByWalking());
        dog.move();
    }
}
