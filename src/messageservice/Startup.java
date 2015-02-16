/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

/**
 *
 * @author Kallie
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MessageService message = new MessageService(new nightStrategy());
        
        System.out.println(message.chooseMessage());
    }
    
}
