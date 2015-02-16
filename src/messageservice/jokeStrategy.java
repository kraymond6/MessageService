/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;
import java.util.Random;
/**
 *
 * @author Kallie
 */
public class jokeStrategy implements MessageServiceStrategy{
    
    private int jokeNum;
    Random random = new Random();
    public String[] jokeList = {"A recent survey showed that six out of seven dwarves are not Happy", "I didn't know "
            + "my dad was a construction sign thief, but when I got home all the signs were there", "On the other hand, you have different fingers"};
    @Override
    public String getMessage(){
        jokeNum = random.nextInt(3)+1;
        return jokeList[jokeNum];
    }
}
