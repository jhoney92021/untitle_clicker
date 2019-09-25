package com.jhoney.untitled.GameStart;

//LOCAL IMPORTS
import com.jhoney.untitled.Helper;
import com.jhoney.untitled.Player.Player;
import com.jhoney.untitled.Clickers.Clicker;
//LOCAL IMPORTS

import java.util.ArrayList;

public class GameStart {
    //PROPERTIES
    public Player livePlayer;
    public ArrayList<Clicker> allClickers;

    //FOR DEBUGGING
    //Todo: Delete bug on completion
    public int bug;

    //CONSTRUCTORS
    public GameStart()
    {
        livePlayer = new Player();
        allClickers = new ArrayList<Clicker>()
        {
            Clicker basic = new Clicker(1,"Basic");
            Clicker sub_standard = new Clicker(5,"SubStandard");
            Clicker standard = new Clicker(10,"Standard");
            Clicker upgrade_standard = new Clicker(20,"Upgrade");
            Clicker staff = new Clicker(50,"Staff");
            Clicker technical = new Clicker(75,"Technical");
            Clicker master = new Clicker(100,"Master");
            Clicker senior_master = new Clicker(200,"SeniorMaster");
            Clicker chief_master = new Clicker(300,"ChiefMaster");
        };


        //Todo: Delete bug on completion
        bug = Helper.randomInt(0,30);
    }
}
