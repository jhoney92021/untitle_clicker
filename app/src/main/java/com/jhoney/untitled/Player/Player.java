package com.jhoney.untitled.Player;

import com.jhoney.untitled.Helper;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Player {
    //PROPERTIES
    public int gold;
    public int rank;
    public Map<String, Integer> owned_clicks;

    //FOR DEBUGGING
    //Todo: Delete bug on completion
    public int bug;

    //CONSTRUCTORS
    public Player()
    {
        gold = 0;
        rank = 1;

        owned_clicks = new HashMap<>();
        owned_clicks.put("basic",0);
        owned_clicks.put("sub_standard",0);
        owned_clicks.put("standard",0);
        owned_clicks.put("upgrade",0);
        owned_clicks.put("staff",0);
        owned_clicks.put("tech",0);
        owned_clicks.put("master",0);
        owned_clicks.put("sMaster",0);
        owned_clicks.put("cMaster",0);
        //Todo: Delete bug on completion
        bug = Helper.randomInt(0,30);
    }
}