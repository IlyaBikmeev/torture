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
public class Hare implements Contender {
    private int currentPosition;
    private final Random random;

    public Hare(int currentPosition) {
        this.currentPosition = currentPosition;
        this.random = new Random();
    }
    
    public Hare() {
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
        return "Hare";
    }

    private int speed(){
        int number = random.nextInt(10) + 1;
        if (number <= 2){
            return 0;
        }
        else if(number <= 4){
            return 9;
        }
        else if(number == 5){
            return -12;
        }
        else if(number <= 8){
            return 1;
        }
        else{
            return -2;
        }
    }
}
