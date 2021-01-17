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
public class ConnectionManager {
    
    private static Connection [] connections = new Connection[] {Connection.createConnection(), Connection.createConnection(), Connection.createConnection()};
    private static int counterConn = connections.length;
    
    private ConnectionManager() {}
    
    public static Connection getConnection() {
        
        counterConn--;
        return counterConn >=0 ? connections[counterConn] : null;
        
    }
}
