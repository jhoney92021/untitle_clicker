package com.jhoney.untitled.Clickers;

public class Clicker {

    //PROPERTIES
    public int gold_click;
    public String rank_click;

    //FOR DEBUGGING
    public int bug;

    //CONSTRUCTORS
    public Clicker()
    {
        gold_click = 0;
        rank_click = null;
    }

    public Clicker(int g, String r)
    {
        gold_click = g;
        rank_click = r;
    }

}