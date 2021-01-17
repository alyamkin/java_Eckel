/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorsex7coinflipping;

import java.util.Random;

/**
 *
 * @author Andrey
 */
public class OperatorsEx7CoinFlipping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1 - tails , 0 - heads
        Random  rand = new Random();
        int attempt = rand.nextInt(2);
        String flip = attempt == 1 ? "Tails" : "Heads";
        
        System.out.println(flip);
    }
    
}
