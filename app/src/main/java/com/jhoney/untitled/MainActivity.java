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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new GameStart();
        Helper.printGame(game);
        Helper.setGame(this, game);
        Helper.setPlayer(this, game.livePlayer);
        Player mainPlayer = Helper.getPlayer(this);
        gold_view = findViewById(R.id.gold_view);
        gold_view.setText(getString(R.string.gold_str, mainPlayer.gold));
        //Todo: Connect Buttons to Clickers
        //Todo: Connect everything to event handlers

        basic_btn = findViewById(R.id.basic_btn);
        basic_btn.setOnClickListener(this);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);

        first_class_btn = findViewById(R.id.first_class_btn);
        first_class_btn.setOnClickListener(this);

        senior_btn = findViewById(R.id.senior_btn);
        senior_btn.setOnClickListener(this);

        staff_btn = findViewById(R.id.staff_btn);
        staff_btn.setOnClickListener(this);

        technical_btn = findViewById(R.id.technical_btn);
        technical_btn.setOnClickListener(this);

        master_btn = findViewById(R.id.master_btn);
        master_btn.setOnClickListener(this);

        senior_master_btn = findViewById(R.id.senior_master_btn);
        senior_master_btn.setOnClickListener(this);

        chief_master_btn = findViewById(R.id.chief_master_btn);
        chief_master_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
//        Intent intent = new Intent(this, ScenarioActivity.class);
        switch (v.getId())
        {
            case R.id.basic_btn:
                Player pLoc = Helper.getPlayer(this);
                GameStart gLoc = Helper.getGame(this);
                Helper.printGame(gLoc);
                pLoc.gold += gLoc.allClickers.get(0).gold_click;
                Helper.printAny(pLoc.gold);
                Helper.setPlayer(this, pLoc);


                gold_view = findViewById(R.id.gold_view);
                gold_view.setText(getString(R.string.gold_str, pLoc.gold));

                break;
        }
    }
}
