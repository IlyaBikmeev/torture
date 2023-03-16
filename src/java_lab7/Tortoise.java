/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab7;

import java.util.Random;

/**
 *
 * @author Ekaterina
 */
public class Tortoise implements Contender{
    private int currentPosition;
    private final Random random;
    
    public Tortoise(int currentPosition) {
        this.currentPosition = currentPosition;
        this.random = new Random(); 
    }
    
    public Tortoise() {
        this.currentPosition = 1;
        this.random = new Random(); 
    }
    
    @Override
    public int getPosition() {
        return currentPosition;
    }

    @Override
    public void move() {
        int currentSpeed = speed();
        currentPosition = Math.max(currentPosition + currentSpeed, 1);   
    }

    @Override
    public String getName() {
        return "Tortoise";
    }

    private int speed(){
        int number = random.nextInt(10) + 1;
        if (number <= 5){
            return 3;
        }
        else if(number <= 7){
            return -6;
        }
        else {
            return 1;
        }
    }
    
}
