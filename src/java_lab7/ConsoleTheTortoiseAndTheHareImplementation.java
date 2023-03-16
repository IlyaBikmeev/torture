/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab7;

/**
 *
 * @author Ekaterina
 */
public class ConsoleTheTortoiseAndTheHareImplementation implements Game {

    private final Contender tortoise;
    private final Contender hare;

    public ConsoleTheTortoiseAndTheHareImplementation(Contender tortoise, Contender hare) {
        this.tortoise = tortoise;
        this.hare = hare;
    }
    
    private boolean isTortoiseWon(){
        return tortoise.getPosition() >= 70;
    }
    
    private boolean isHareWon(){
        return hare.getPosition() >= 70;
    }
    
    @Override
    public void play() throws Exception {
        boolean gameOver = false;
        
        while(!gameOver){
            printState();
            tortoise.move();
            hare.move();
            
            if (isTortoiseWon() || isHareWon()){
                gameOver = true;
            }  
            Thread.sleep(100);
        }
        printWinner();
        
    }
    private void printWinner(){
        if (isTortoiseWon() && isHareWon()){
            System.out.println("Draw!");
        }
        else if (isTortoiseWon()){
            System.out.println(tortoise.getName() + " won!");
        }
        else{
            System.out.println(hare.getName() + " won!");
        }
    }

    private void printState() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ".repeat(70));

        sb.replace(hare.getPosition() - 1, hare.getPosition(),
            String.valueOf(hare.getName().charAt(0)));

        sb.replace(tortoise.getPosition() - 1, tortoise.getPosition(),
            String.valueOf(tortoise.getName().charAt(0)));

        String result = sb.toString();
        System.out.println(result);
    }
            
}
