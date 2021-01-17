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
public class Connection {

    private Connection() {};
    
    protected static Connection createConnection() {
        return new Connection();
    }
}
