package com.jhoney.untitled.Clickers;

import com.jhoney.untitled.Helper;

public class Clicker {

    //PROPERTIES
    public int gold_click;
    public String rank_click;

    //FOR DEBUGGING
    //Todo: Delete bug on completion
    public int bug;

    //CONSTRUCTORS
    public Clicker()
    {
        //Todo: Delete bug on completion
        bug = Helper.randomInt(0,30);

        gold_click = 0;
        rank_click = null;
    }

    public Clicker(int g, String r)
    {
        //Todo: Delete bug on completion
        bug = Helper.randomInt(0,30);

        gold_click = g;
        rank_click = r;
    }

}