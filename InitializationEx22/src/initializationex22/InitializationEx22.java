/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationex22;

/**
 *
 * @author Andrey
 */
public class InitializationEx22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(Bills b : Bills.values()) {
            switch(b) {
                case ONE:
                    System.out.println("1$");
                    break;
                case TWO:
                    System.out.println("2$");
                    break;
                case FIVE:
                    System.out.println("5$");
                    break;
                case TEN:
                    System.out.println("10$");
                    break;
                case TWENTY:
                    System.out.println("20$");
                    break;
                case FIFTY:
                    System.out.println("50$");
                    break;
                case HUNDRED:
                    System.out.println("100$");
                    break;
                default:
                    break;
                         
            }
        }
    }
    
}
