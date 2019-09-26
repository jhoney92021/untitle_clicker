package com.jhoney.untitled;
//External Imports
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;

//LOCAL IMPORTS
import com.jhoney.untitled.GameStart.GameStart;
import com.jhoney.untitled.Player.Player;


public class Helper extends AppCompatActivity
{

    //Todo: Remember to create helpers were possible

    //Idle Helpers
    public static int useClicks(Context context)
    {
        GameStart gameHelper = Helper.getGame(context);
        int toReturn = 0;
        if(gameHelper.livePlayer.owned_clicks.get("basic") > 0)
        {
            Helper.printGame(gameHelper);
            Helper.printAny("inHelperClickValue", gameHelper.allClickers.get(0));
            toReturn +=
                    (gameHelper.allClickers.get(0).gold_click)*gameHelper.livePlayer.owned_clicks.get("basic");
            Helper.printAny("inHelper",(gameHelper.allClickers.get(0).gold_click)*gameHelper.livePlayer.owned_clicks.get("basic"));


            return toReturn;
        }
        else{ return toReturn;}
    }
    //Idle Helpers
    
    //Game Helpers
    public static void setGame(Context context, GameStart gameStarted)
    {
        SharedPreferences mPrefs = context.getSharedPreferences("aString",Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(gameStarted);
        prefsEditor.putString("gameStarted", json);
        prefsEditor.commit();
    }

    public static GameStart getGame(Context context)
    {
        SharedPreferences mPrefs = context.getSharedPreferences("aString", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = mPrefs.getString("gameStarted", "");
        GameStart gameStarted = gson.fromJson(json, GameStart.class);
        return gameStarted;
    }
    //Game Helpers


    //PLAYER RELATED METHODS
    public static void setPlayer(Context context, Player livePlayer)
    {
        SharedPreferences mPrefs = context.getSharedPreferences("aString",Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(livePlayer);
        prefsEditor.putString("livePlayer", json);
        prefsEditor.commit();
    }

    public static Player getPlayer(Context context)
    {
        SharedPreferences mPrefs = context.getSharedPreferences("aString", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = mPrefs.getString("livePlayer", "");
        Player livePlayer = gson.fromJson(json, Player.class);
        return livePlayer;
    }
    //PLAYER RELATED METHODS
    //RANDOM INTEGER METHOD
    public  static int randomInt(int low, int high)
    {
        int result = (int)(Math.random()
                * (high-low-1)) + low;
        return result;
    }
    //RANDOM INTEGER METHOD


    //PRINT STUFF
    public static void printGame(GameStart toPrint)
    {
        Gson gson = new Gson();
        String return_json = gson.toJson(toPrint);
        Log.d("printGame", return_json);
    }

    public static void printAny(String tag, Object toPrint)
    {
        Gson gson = new Gson();
        String return_json = gson.toJson(toPrint);
        Log.d(tag, return_json);
    }

}
