package com.jhoney.untitled;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
//LOCAL IMPORTS
import com.jhoney.untitled.GameStart.GameStart;
import com.jhoney.untitled.Player.Player;
//LOCAL IMPORTS


public class MainActivity extends AppCompatActivity
    implements View.OnClickListener
{

    //DECLARATIONS
    GameStart game;

    TextView gold_view;
    ImageView anim_view;
    //Todo: Think about refactoring declarations
    Button basic_btn, btn, first_class_btn, senior_btn,
            staff_btn, technical_btn, master_btn,
            senior_master_btn, chief_master_btn;

    Button basic_purchase, sub_standard_purchase, standard_purchase,
            upgraded_purchase, staff_purchase, tech_purchase,
            master_purchase, senior_master_purchase, chief_master_purchase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(Helper.getGame(this) != null)
        {
            game = Helper.getGame(this);
            Helper.printAny("inCreateGameRetrieved", game);
        }else{
            game = new GameStart();
            Helper.printAny("inCreateGameMade", game);
        }
        Helper.setGame(this, game);
        Player mainPlayer = game.livePlayer;
        gold_view = findViewById(R.id.gold_view);
        gold_view.setText(getString(R.string.gold_str, game.livePlayer.gold));
        //Todo: Connect Buttons to Clickers
        //Todo: Connect everything to event handlers

        basic_btn = findViewById(R.id.basic_btn);
        basic_btn.setOnClickListener(this);

        basic_purchase = findViewById(R.id.basic_purchase);
        basic_purchase.setText(getString(R.string.basic_purchase, mainPlayer.owned_clicks.get("basic")));
        basic_purchase.setOnClickListener(this);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);

        sub_standard_purchase = findViewById(R.id.sub_standard_purchase);
        sub_standard_purchase.setOnClickListener(this);

        first_class_btn = findViewById(R.id.first_class_btn);
        first_class_btn.setOnClickListener(this);

        standard_purchase = findViewById(R.id.standard_purchase);
        standard_purchase.setOnClickListener(this);

        senior_btn = findViewById(R.id.senior_btn);
        senior_btn.setOnClickListener(this);

        upgraded_purchase = findViewById(R.id.upgraded_purchase);
        upgraded_purchase.setOnClickListener(this);

        staff_btn = findViewById(R.id.staff_btn);
        staff_btn.setOnClickListener(this);

        staff_purchase = findViewById(R.id.staff_purchase);
        staff_purchase.setOnClickListener(this);

        technical_btn = findViewById(R.id.technical_btn);
        technical_btn.setOnClickListener(this);

        tech_purchase = findViewById(R.id.tech_purchase);
        tech_purchase.setOnClickListener(this);

        master_btn = findViewById(R.id.master_btn);
        master_btn.setOnClickListener(this);

        master_purchase = findViewById(R.id.master_purchase);
        master_purchase.setOnClickListener(this);

        senior_master_btn = findViewById(R.id.senior_master_btn);
        senior_master_btn.setOnClickListener(this);

        senior_master_purchase = findViewById(R.id.senior_master_purchase);
        senior_master_purchase.setOnClickListener(this);

        chief_master_btn = findViewById(R.id.chief_master_btn);
        chief_master_btn.setOnClickListener(this);

        chief_master_purchase = findViewById(R.id.chief_master_purchase);
        chief_master_purchase.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
//        Intent intent = new Intent(this, ScenarioActivity.class);
//        Player pLoc = Helper.getPlayer(this);
        GameStart gLoc = Helper.getGame(this);
        gold_view = findViewById(R.id.gold_view);
        switch (v.getId())
        {
            case R.id.basic_btn:
                Helper.printGame(gLoc);
                Helper.printAny("inSwitchClickValue", gLoc.allClickers.get(0));
                gLoc.livePlayer.gold += gLoc.allClickers.get(0).gold_click;
                gLoc.livePlayer.gold += Helper.useClicks(this);
                Helper.printAny("inSwitchBtn",gLoc.livePlayer.gold);
                Helper.printAny("inSwitchBtn",Helper.useClicks(this));
                Helper.setGame(this, gLoc);


                gold_view.setText(getString(R.string.gold_str, gLoc.livePlayer.gold));

                break;

            case R.id.basic_purchase:
                Helper.printGame(gLoc);
                if(gLoc.livePlayer.gold >= 1)
                {
                    gLoc.livePlayer.gold -= gLoc.allClickers.get(0).gold_click;
                    int numClick = gLoc.livePlayer.owned_clicks.get("basic");
                    numClick++;
                    gLoc.livePlayer.owned_clicks.put("basic",numClick);
                    Helper.printAny("inSwitchPurchase",gLoc.livePlayer.gold);
                    Helper.setGame(this, gLoc);

                    basic_purchase.setText(getString(R.string.basic_purchase, gLoc.livePlayer.owned_clicks.get("basic")));
                    gold_view.setText(getString(R.string.gold_str, gLoc.livePlayer.gold));
                }
                break;
        }
    }
}
