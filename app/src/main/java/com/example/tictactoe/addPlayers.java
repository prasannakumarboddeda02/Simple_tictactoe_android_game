package com.example.tictactoe;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class addPlayers extends AppCompatActivity {
    private EditText playerOneName;
    private EditText playerTwoName;
    private String playerOne,playerTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_TicTacToe);
        setContentView(R.layout.activity_add_players);

        playerOneName=findViewById(R.id.playerOneName);
        playerTwoName=findViewById(R.id.playerTwoName);

        Button startGame = findViewById(R.id.startGame);


        startGame.setOnClickListener(view -> {
            playerOne=playerOneName.getText().toString();
            playerTwo=playerTwoName.getText().toString();
            if(playerOne.isEmpty()||playerTwo.isEmpty())
            {
                Toast.makeText(addPlayers.this,"Enter player names",Toast.LENGTH_SHORT).show();
            }
            else {
                Intent intent = new Intent(addPlayers.this, MainActivity.class);
                intent.putExtra("playerOne",playerOne);
                intent.putExtra("playerTwo",playerTwo);
                startActivity(intent);
            }
        });
    }
}