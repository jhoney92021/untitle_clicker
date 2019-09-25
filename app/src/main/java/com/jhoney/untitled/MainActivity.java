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
//LOCAL IMPORTS


public class MainActivity extends AppCompatActivity
    implements View.OnClickListener
{

    //DECLARATIONS
    GameStart game;
    Helper help;

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
        help = new Helper();
        Helper.setPlayer(this, game.livePlayer);
        gold_view = findViewById(R.id.gold_view);
        gold_view.setText(getString(R.string.gold_str, game.livePlayer.gold));
        //Todo: Connect Buttons to Clickers
        //Todo: Connect everything to event handlers

        basic_btn = findViewById(R.id.basic_btn);
        basic_btn.setOnClickListener(this);

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
                ;
                break;
        }
    }
}
