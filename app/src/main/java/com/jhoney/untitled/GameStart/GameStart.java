package com.jhoney.untitled.GameStart;

//LOCAL IMPORTS
import android.content.Context;

import com.jhoney.untitled.Helper;
import com.jhoney.untitled.Player.Player;
import com.jhoney.untitled.Clickers.Clicker;
//LOCAL IMPORTS

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class GameStart
{
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

        allClickers.add(new Clicker(1,"Basic"));


        //Todo: Delete bug on completion
        bug = Helper.randomInt(0,30);
    }



    //DECLARATIONS
    GameStart loopGame;
    int playerGold = 0;
    public int loop(final Context loopContext) {
        //Todo: Delete this print statement on completion
        Helper.printAny("inLoop", "GameLoop Entered");
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                loopGame = Helper.getGame(loopContext);
                loopGame.livePlayer.gold += loopGame.allClickers.get(0).gold_click;
                loopGame.livePlayer.gold += Helper.useClicks(loopContext);
                playerGold = loopGame.livePlayer.gold;
                Helper.setGame(loopContext, loopGame);

                //Todo: Delete this print statement on completion
                Helper.printAny("inLoopTimer", "GameLoop Running");
            }
        }, 0, 5000);

        return playerGold;
    }
}
