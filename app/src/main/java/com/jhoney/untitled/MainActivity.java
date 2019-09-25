package com.jhoney.untitled;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
//LOCAL IMPORTS
import com.jhoney.untitled.GameStart.GameStart;
//LOCAL IMPORTS


public class MainActivity extends AppCompatActivity {

    GameStart game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new GameStart();
        //Todo: Connect Buttons to Clickers
        //Todo: Connect everything to event handlers

    }
}
