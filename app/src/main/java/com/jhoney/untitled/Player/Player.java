package com.jhoney.untitled.Player;

import com.jhoney.untitled.Helper;

public class Player {
    //PROPERTIES
    public int gold;
    public int rank;

    //FOR DEBUGGING
    //Todo: Delete bug on completion
    public int bug;

    //CONSTRUCTORS
    public Player()
    {
        gold = 0;
        rank = 1;
        //Todo: Delete bug on completion
        bug = Helper.randomInt(0,30);
    }
}