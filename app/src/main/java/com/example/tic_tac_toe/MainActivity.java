package com.example.tic_tac_toe;

import android.arch.lifecycle.ViewModelProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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
        Button button1 = (Button) findViewById(R.id.Button1);
        Button button2 = (Button) findViewById(R.id.Button2);
        Button button3 = (Button) findViewById(R.id.Button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        TextView image = (TextView) findViewById(R.id.textViewp1);
        TextView image2 = (TextView) findViewById(R.id.textViewp2);
        final int BOARD_SIZE = 3;
        TileState[][] board;
        super.onSaveInstanceState(outState);
        outState.putSerializable("game", game);
        /*board = new TileState[BOARD_SIZE][BOARD_SIZE];
        //ImageView image = (ImageView) R.id.Button1;
        for(int i=0; i<BOARD_SIZE; i++)
            for(int j=0; j<BOARD_SIZE; j++)*/
        if (button1.getText() == "X") {
            outState.putString("button1", "X");
        } else if (button1.getText() == "O") {
            outState.putString("button1", "O");
        }
        if (button2.getText() == "X") {
            outState.putString("button2", "X");
        } else if (button2.getText() == "O") {
            outState.putString("button2", "O");
        }
        if (button3.getText() == "X") {
            outState.putString("button3", "X");
        } else if (button3.getText() == "O") {
            outState.putString("button3", "O");
        }
        if (button4.getText() == "X") {
            outState.putString("button4", "X");
        } else if (button4.getText() == "O") {
            outState.putString("button4", "O");
        }
        if (button5.getText() == "X") {
            outState.putString("button5", "X");
        } else if (button5.getText() == "O") {
            outState.putString("button5", "O");
        }
        if (button6.getText() == "X") {
            outState.putString("button6", "X");
        } else if (button6.getText() == "O") {
            outState.putString("button6", "O");
        }
        if (button7.getText() == "X") {
            outState.putString("button7", "X");
        } else if (button7.getText() == "O") {
            outState.putString("button7", "O");
        }
        if (button8.getText() == "X") {
            outState.putString("button8", "X");
        } else if (button8.getText() == "O") {
            outState.putString("button8", "O");
        }
        if (button9.getText() == "X") {
            outState.putString("button9", "X");
        } else if (button9.getText() == "O") {
            outState.putString("button9", "O");
        }
        if(image.getVisibility() == View.VISIBLE){
            outState.putBoolean("image", true);
        } else {
            outState.putBoolean("image", false);
        }
        if(image2.getVisibility() == View.VISIBLE){
            outState.putBoolean("image2", true);
        } else {
            outState.putBoolean("image2", false);
        }
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Button button1 = (Button) findViewById(R.id.Button1);
        Button button2 = (Button) findViewById(R.id.Button2);
        Button button3 = (Button) findViewById(R.id.Button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        TextView image = (TextView) findViewById(R.id.textViewp1);
        TextView image2 = (TextView) findViewById(R.id.textViewp2);
        super.onRestoreInstanceState(savedInstanceState);
        game = (Game) savedInstanceState.getSerializable("game");
        savedInstanceState.getString("R.id.Button1");
        savedInstanceState.getString("R.id.Button2");
        savedInstanceState.getString("R.id.Button3");
        savedInstanceState.getString("R.id.button4");
        savedInstanceState.getString("R.id.button5");
        savedInstanceState.getString("R.id.button6");
        savedInstanceState.getString("R.id.button7");
        savedInstanceState.getString("R.id.button8");
        savedInstanceState.getString("R.id.button9");
        if (savedInstanceState.getString("button1") == "X") {
            button1.setText("X");
        } else if (savedInstanceState.getString("button1") == "O") {
            button1.setText("O");
        }
        if (savedInstanceState.getString("button2") == "X") {
            button2.setText("X");
        } else if (savedInstanceState.getString("button2") == "O") {
            button2.setText("O");
        }
        if (savedInstanceState.getString("button3") == "X") {
            button3.setText("X");
        } else if (savedInstanceState.getString("button3") == "O") {
            button3.setText("O");
        }
        if (savedInstanceState.getString("button4") == "X") {
            button4.setText("X");
        } else if (savedInstanceState.getString("button4") == "O") {
            button4.setText("O");
        }
        if (savedInstanceState.getString("button5") == "X") {
            button5.setText("X");
        } else if (savedInstanceState.getString("button5") == "O") {
            button5.setText("O");
        }
        if (savedInstanceState.getString("button6") == "X") {
            button6.setText("X");
        } else if (savedInstanceState.getString("button6") == "O") {
            button6.setText("O");
        }
        if (savedInstanceState.getString("button7") == "X") {
            button7.setText("X");
        } else if (savedInstanceState.getString("button7") == "O") {
            button7.setText("O");
        }
        if (savedInstanceState.getString("button8") == "X") {
            button8.setText("X");
        } else if (savedInstanceState.getString("button8") == "O") {
            button8.setText("O");
        }
        if (savedInstanceState.getString("button9") == "X") {
            button9.setText("X");
        } else if (savedInstanceState.getString("button9") == "O") {
            button9.setText("O");
        }
        if(savedInstanceState.getBoolean("image")){
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
        } else {
            image.setVisibility(View.INVISIBLE);
        }
        if(savedInstanceState.getBoolean("image2")){
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
        } else {
            image2.setVisibility(View.INVISIBLE);
        }
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
