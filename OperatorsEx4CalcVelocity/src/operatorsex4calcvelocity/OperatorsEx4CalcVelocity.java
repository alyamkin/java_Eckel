/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorsex4calcvelocity;

import java.util.Random;

/**
 *
 * @author Andrey
 */
public class OperatorsEx4CalcVelocity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rand = new Random();
        int distance = rand.nextInt(1000) + 1;
        int time = rand.nextInt(100) + 1;
        double velocity = (double) distance / time;
        System.out.printf("distance = %d m, time = %d sec, velocity = %.2f m/sec \n", distance, time, velocity);

    }

}
