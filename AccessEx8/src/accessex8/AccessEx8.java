/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessex8;

/**
 *
 * @author lyamkin
 */
public class AccessEx8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn1 = ConnectionManager.getConnection();
        Connection conn2 = ConnectionManager.getConnection();
        Connection conn3 = ConnectionManager.getConnection();
        Connection conn4 = ConnectionManager.getConnection();
        Connection conn5 = ConnectionManager.getConnection();
        System.out.println(conn1);
        System.out.println(conn2);
        System.out.println(conn3);
        System.out.println(conn4);
        System.out.println(conn5);
        Connection conn = Connection.createConnection();
    }
    
}
