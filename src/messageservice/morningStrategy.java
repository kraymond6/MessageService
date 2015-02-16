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
public class morningStrategy implements MessageServiceStrategy{
    
    private int morningNum;
    Random random = new Random();
    public String[] morningList = {"Good morning!", "Time to wake up!", "It's a bright new day!"};
    @Override
    public String getMessage(){
        morningNum = random.nextInt((2) + 1);
        return morningList[morningNum];
    }
}
