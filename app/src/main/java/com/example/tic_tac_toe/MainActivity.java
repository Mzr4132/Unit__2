package com.example.tic_tac_toe;

import android.arch.lifecycle.ViewModelProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Game game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new Game();


    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("game", game);


    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        game = (Game)savedInstanceState.getSerializable("game");
    }
    public void tileClicked(View view) {
        int row;
        int column;
        int id = view.getId();
        if (id == R.id.Button1){
            row = 0;
            column = 0;
        }
        else if (id == R.id.Button2) {
            row = 0;
            column = 1;
        }
        else if (id == R.id.Button3) {
            row = 0;
            column = 2;
        }
        else if (id == R.id.button4) {
            row = 1;
            column = 0;
        }
        else if (id == R.id.button5) {
            row = 1;
            column = 1;
        }
        else if (id == R.id.button6) {
            row = 1;
            column = 2;
        }
        else if (id == R.id.button7) {
            row = 2;
            column = 0;
        }
        else if (id == R.id.button8) {
            row = 2;
            column = 1;
        }
        else if (id == R.id.button9) {
            row = 2;
            column = 2;
        }
        else{
            row = 4;
            column = 4;
        }
        TileState state = game.choose(row, column);
        switch(state) {
            case CROSS:
                ((Button)findViewById(id)).setText("X");
                break;
            case CIRCLE:
                ((Button)findViewById(id)).setText("O");
                break;
            case INVALID:
                // do something different
                break;
        }
        GameState winning = game.won();
        TextView image = (TextView) findViewById(R.id.textViewp1);
        TextView image2 = (TextView) findViewById(R.id.textViewp2);

        switch(winning) {
            case PLAYER_ONE:
                image.setVisibility(View.VISIBLE);
                ((Button)findViewById(R.id.Button1)).setEnabled(false);
                ((Button)findViewById(R.id.Button2)).setEnabled(false);
                ((Button)findViewById(R.id.Button3)).setEnabled(false);
                ((Button)findViewById(R.id.button4)).setEnabled(false);
                ((Button)findViewById(R.id.button5)).setEnabled(false);
                ((Button)findViewById(R.id.button6)).setEnabled(false);
                ((Button)findViewById(R.id.button7)).setEnabled(false);
                ((Button)findViewById(R.id.button8)).setEnabled(false);
                ((Button)findViewById(R.id.button9)).setEnabled(false);
                break;
            case PLAYER_TWO:
                image2.setVisibility(View.VISIBLE);
                ((Button)findViewById(R.id.Button1)).setEnabled(false);
                ((Button)findViewById(R.id.Button2)).setEnabled(false);
                ((Button)findViewById(R.id.Button3)).setEnabled(false);
                ((Button)findViewById(R.id.button4)).setEnabled(false);
                ((Button)findViewById(R.id.button5)).setEnabled(false);
                ((Button)findViewById(R.id.button6)).setEnabled(false);
                ((Button)findViewById(R.id.button7)).setEnabled(false);
                ((Button)findViewById(R.id.button8)).setEnabled(false);
                ((Button)findViewById(R.id.button9)).setEnabled(false);
                break;
            case IN_PROGRESS:
                break;
        }




    }
    public void resetClicked(View view){
        TextView image = (TextView) findViewById(R.id.textViewp1);
        TextView image2 = (TextView) findViewById(R.id.textViewp2);
        ((Button)findViewById(R.id.Button1)).setText("");
        ((Button)findViewById(R.id.Button2)).setText("");
        ((Button)findViewById(R.id.Button3)).setText("");
        ((Button)findViewById(R.id.button4)).setText("");
        ((Button)findViewById(R.id.button5)).setText("");
        ((Button)findViewById(R.id.button6)).setText("");
        ((Button)findViewById(R.id.button7)).setText("");
        ((Button)findViewById(R.id.button8)).setText("");
        ((Button)findViewById(R.id.button9)).setText("");
        ((Button)findViewById(R.id.Button1)).setEnabled(true);
        ((Button)findViewById(R.id.Button2)).setEnabled(true);
        ((Button)findViewById(R.id.Button3)).setEnabled(true);
        ((Button)findViewById(R.id.button4)).setEnabled(true);
        ((Button)findViewById(R.id.button5)).setEnabled(true);
        ((Button)findViewById(R.id.button6)).setEnabled(true);
        ((Button)findViewById(R.id.button7)).setEnabled(true);
        ((Button)findViewById(R.id.button8)).setEnabled(true);
        ((Button)findViewById(R.id.button9)).setEnabled(true);
        image.setVisibility(View.INVISIBLE);
        image2.setVisibility(View.INVISIBLE);
        game = new Game();
    }
    }
