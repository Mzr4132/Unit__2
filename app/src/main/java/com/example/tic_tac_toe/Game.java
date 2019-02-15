package com.example.tic_tac_toe;
import android.arch.lifecycle.ViewModel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class Game implements Serializable {
    final private int BOARD_SIZE = 3;
    private TileState[][] board;
    private Boolean playerOneTurn;  // true if player 1's turn, false if player 2's turn
    private int movesPlayed;
    private Boolean gameOver;

    public Game() {
        board = new TileState[BOARD_SIZE][BOARD_SIZE];
        for(int i=0; i<BOARD_SIZE; i++)
            for(int j=0; j<BOARD_SIZE; j++)
                board[i][j] = TileState.BLANK;

        playerOneTurn = true;
        gameOver = false;
    }
    // returns a tilestate for the class game
    public TileState choose(int row, int column) {
        if (board[row][column] == TileState.BLANK && playerOneTurn == true) {
            board[row][column] = TileState.CROSS;
            playerOneTurn = false;
            return TileState.CROSS;
        }
        else if(board[row][column] == TileState.BLANK && playerOneTurn == false) {
            board[row][column] = TileState.CIRCLE;
            playerOneTurn = true;
            return TileState.CIRCLE;
        }
        else{
            return TileState.INVALID;
        }
        }
        // returns the gamestate if it is won it checks for every possibility of winning for cross and circle player
    public GameState won(){
        if (board[0][0] == TileState.CROSS && board[0][1] == TileState.CROSS && board[0][2] == TileState.CROSS) {
            return GameState.PLAYER_ONE;
        }
        else if (board[1][0] == TileState.CROSS && board[1][1] == TileState.CROSS && board[1][2] == TileState.CROSS) {
            return GameState.PLAYER_ONE;
        }
        else if (board[2][0] == TileState.CROSS && board[2][1] == TileState.CROSS && board[2][2] == TileState.CROSS) {
            return GameState.PLAYER_ONE;
        }
        else if (board[0][0] == TileState.CROSS && board[1][0] == TileState.CROSS && board[2][0] == TileState.CROSS) {
            return GameState.PLAYER_ONE;
        }
        else if (board[0][1] == TileState.CROSS && board[1][1] == TileState.CROSS && board[2][1] == TileState.CROSS) {
            return GameState.PLAYER_ONE;
        }
        else if (board[0][2] == TileState.CROSS && board[1][2] == TileState.CROSS && board[2][2] == TileState.CROSS) {
            return GameState.PLAYER_ONE;
        }
        else if (board[0][0] == TileState.CROSS && board[1][1] == TileState.CROSS && board[2][2] == TileState.CROSS) {
            return GameState.PLAYER_ONE;
        }
        else if (board[0][2] == TileState.CROSS && board[1][1] == TileState.CROSS && board[2][0] == TileState.CROSS) {
            return GameState.PLAYER_ONE;
        }
        else if (board[0][0] == TileState.CIRCLE && board[0][1] == TileState.CIRCLE && board[0][2] == TileState.CIRCLE){
            return GameState.PLAYER_TWO;
        }
        else if (board[1][0] == TileState.CIRCLE && board[1][1] == TileState.CIRCLE && board[1][2] == TileState.CIRCLE) {
            return GameState.PLAYER_TWO;
        }
        else if (board[2][0] == TileState.CIRCLE && board[2][1] == TileState.CIRCLE && board[2][2] == TileState.CIRCLE) {
            return GameState.PLAYER_TWO;
        }
        else if (board[0][0] == TileState.CIRCLE && board[1][0] == TileState.CIRCLE && board[2][0] == TileState.CIRCLE) {
            return GameState.PLAYER_TWO;
        }
        else if (board[0][1] == TileState.CIRCLE && board[1][1] == TileState.CIRCLE && board[2][1] == TileState.CIRCLE) {
            return GameState.PLAYER_TWO;
        }
        else if (board[0][2] == TileState.CIRCLE && board[1][2] == TileState.CIRCLE && board[2][2] == TileState.CIRCLE) {
            return GameState.PLAYER_TWO;
        }
        else if (board[0][0] == TileState.CIRCLE && board[1][1] == TileState.CIRCLE && board[2][2] == TileState.CIRCLE) {
            return GameState.PLAYER_TWO;
        }
        else if (board[0][2] == TileState.CIRCLE && board[1][1] == TileState.CIRCLE && board[2][0] == TileState.CIRCLE) {
            return GameState.PLAYER_TWO;
        }
        else{
            return GameState.IN_PROGRESS;
        }
    }
    }

