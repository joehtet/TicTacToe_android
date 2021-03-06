package com.example.joe.tictactoe;
import android.view.View;

import com.example.joe.tictactoe.GameModel.Board;
import com.example.joe.tictactoe.GameModel.GameState;
import com.example.joe.tictactoe.GameModel.Player;
import com.example.joe.tictactoe.GameModel.Token;

/**
 * this is the thread for the game loop.
 */
public class GameLoop extends Thread{

    // variables
    public GameState gameState;

    // constructor
    public GameLoop(){
        super();
    }

    // methods
            // set game state
    public void setGameState(GameState gameState){
        this.gameState = GameState.ONGOING;
    }

            // get move from player input and return board position .... [row,column]
    public int[] getMove(Player currentPlayer){
        int[] boardPosition = {1,1};
        return boardPosition;
    }

    // start game loop
    @Override
    public void run() {
        while (gameState == GameState.ONGOING) {
            //move = getMove(currentPlayer);  // returns row and column index of the player's placement
            //update board
            //render(board);
        }
    }
}



/*


// Get view for each cell on the board
View cell_1 = (View) findViewById(R.id.cell_1);
View cell_2 = (View) findViewById(R.id.cell_2);
View cell_3 = (View) findViewById(R.id.cell_3);
View cell_4 = (View) findViewById(R.id.cell_4);
View cell_5 = (View) findViewById(R.id.cell_5);
View cell_6 = (View) findViewById(R.id.cell_6);
View cell_7 = (View) findViewById(R.id.cell_7);
View cell_8 = (View) findViewById(R.id.cell_8);
View cell_9 = (View) findViewById(R.id.cell_9);


// initialize




/*        if(currentPlayer==player1){currentPlayer = player2;}
        else{currentPlayer = player1;}

        // Set OnClickListener for each cell
        cell_1.setOnClickListener(this);
        cell_2.setOnClickListener(this);
        cell_3.setOnClickListener(this);
        cell_4.setOnClickListener(this);
        cell_5.setOnClickListener(this);
        cell_6.setOnClickListener(this);
        cell_7.setOnClickListener(this);
        cell_8.setOnClickListener(this);
        cell_9.setOnClickListener(this);


// display win message*/


