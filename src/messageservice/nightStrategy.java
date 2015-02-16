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
public class nightStrategy implements MessageServiceStrategy{
    private int nightNum;
    Random random = new Random();
    public String[] nightList = {"Good night!", "Sleep tight!", "Don't let the bed bugs bite!"};
    @Override
    public String getMessage(){
        nightNum = random.nextInt((2) + 1);
        return nightList[nightNum];
    }
}
