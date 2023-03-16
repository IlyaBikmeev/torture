/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_lab7;

/**
 *
 * @author Ekaterina
 */
public class Java_Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Game game = new ConsoleTheTortoiseAndTheHareImplementation(
            new Tortoise(),
            new Hare()
        );

        game.play();
    }
}
