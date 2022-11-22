package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private List<int[]> combinations;
    private ImageView image0,image1,image2,image3,image4,image5,image6,image7,image8;
    private int[] positions;
    private boolean playerTurn;
    private TextView playerOne,playerTwo;
    private boolean gameOver;
    private LinearLayout playerOneLayout,playerTwoLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playerOne = findViewById(R.id.playerOneName);
        playerTwo = findViewById(R.id.playerTwoName);
        String p1=getIntent().getStringExtra("playerOne");
        String p2=getIntent().getStringExtra("playerTwo");
        playerOne.setText(p1);
        playerTwo.setText(p2);

        combinations=new ArrayList<>();
        combinations.add(new int[]{0,1,2});
        combinations.add(new int[]{3,4,5});
        combinations.add(new int[]{6,7,8});
        combinations.add(new int[]{0,3,6});
        combinations.add(new int[]{1,4,7});
        combinations.add(new int[]{2,5,8});
        combinations.add(new int[]{0,4,8});
        combinations.add(new int[]{2,4,6});

        positions=new int[]{0,0,0,0,0,0,0,0,0};
        gameOver=false;

        image0=findViewById(R.id.image0);
        image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);
        image3=findViewById(R.id.image3);
        image4=findViewById(R.id.image4);
        image5=findViewById(R.id.image5);
        image6=findViewById(R.id.image6);
        image7=findViewById(R.id.image7);
        image8=findViewById(R.id.image8);

        playerTurn=true;

        playerOneLayout = findViewById(R.id.linearPlayerOne);
        playerTwoLayout = findViewById(R.id.linearPlayerTwo);

        playerOneLayout.setBackgroundResource(R.drawable.stroke_highlight);
        image0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSelectable(0)&&!gameOver)
                {
                    positions[0]= playerTurn?1:2;
                    if(playerTurn) {
                        image0.setImageResource(R.drawable.cross);
                    }
                    else
                    {
                        image0.setImageResource(R.drawable.circle1);
                    }
                    if(isWin(playerTurn))
                    {
                        showToast(playerTurn);

                    }
                    else if(isDraw())
                    {
                        showDraw();

                    }
                    else
                    {
                        playerTurn=!playerTurn;
                        if(playerTurn)
                        {
                            playerOneLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerTwoLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                        else
                        {
                            playerTwoLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerOneLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Reset the game!",Toast.LENGTH_SHORT).show();
                }

            }
        });

        image1.setOnClickListener(view -> {
            if(isSelectable(1)&&!gameOver)
            {
                positions[1]= playerTurn?1:2;
                if(playerTurn) {
                    image1.setImageResource(R.drawable.cross);
                }
                else
                {
                    image1.setImageResource(R.drawable.circle1);
                }
                if(isWin(playerTurn))
                {
                    showToast(playerTurn);

                }
                else if(isDraw())
                {
                    showDraw();

                }
                else
                {
                    playerTurn=!playerTurn;
                    if(playerTurn)
                    {
                        playerOneLayout.setBackgroundResource(R.drawable.stroke_highlight);
                        playerTwoLayout.setBackgroundResource(R.drawable.round_purple);
                    }
                    else
                    {
                        playerTwoLayout.setBackgroundResource(R.drawable.stroke_highlight);
                        playerOneLayout.setBackgroundResource(R.drawable.round_purple);
                    }
                }
            }
            else
            {
                Toast.makeText(MainActivity.this,"Reset the game!",Toast.LENGTH_SHORT).show();
            }

        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSelectable(2)&&!gameOver)
                {
                    positions[2]= playerTurn?1:2;
                    if(playerTurn) {
                        image2.setImageResource(R.drawable.cross);
                    }
                    else
                    {
                        image2.setImageResource(R.drawable.circle1);
                    }
                    if(isWin(playerTurn))
                    {
                        showToast(playerTurn);

                    }
                    else if(isDraw())
                    {
                        showDraw();

                    }
                    else
                    {
                        playerTurn=!playerTurn;
                        if(playerTurn)
                        {
                            playerOneLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerTwoLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                        else
                        {
                            playerTwoLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerOneLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Reset the game!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSelectable(3)&&!gameOver)
                {
                    positions[3]= playerTurn?1:2;
                    if(playerTurn) {
                        image3.setImageResource(R.drawable.cross);
                    }
                    else
                    {
                        image3.setImageResource(R.drawable.circle1);
                    }
                    if(isWin(playerTurn))
                    {
                        showToast(playerTurn);

                    }
                    else if(isDraw())
                    {
                        showDraw();

                    }
                    else
                    {
                        playerTurn=!playerTurn;
                        if(playerTurn)
                        {
                            playerOneLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerTwoLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                        else
                        {
                            playerTwoLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerOneLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Reset the game!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSelectable(4)&&!gameOver)
                {
                    positions[4]= playerTurn?1:2;
                    if(playerTurn) {
                        image4.setImageResource(R.drawable.cross);
                    }
                    else
                    {
                        image4.setImageResource(R.drawable.circle1);
                    }
                    if(isWin(playerTurn))
                    {
                        showToast(playerTurn);

                    }
                    else if(isDraw())
                    {
                        showDraw();

                    }
                    else
                    {
                        playerTurn=!playerTurn;
                        if(playerTurn)
                        {
                            playerOneLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerTwoLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                        else
                        {
                            playerTwoLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerOneLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Reset the game!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSelectable(5)&&!gameOver)
                {
                    positions[5]= playerTurn?1:2;
                    if(playerTurn) {
                        image5.setImageResource(R.drawable.cross);
                    }
                    else
                    {
                        image5.setImageResource(R.drawable.circle1);
                    }
                    if(isWin(playerTurn))
                    {
                        showToast(playerTurn);

                    }
                    else if(isDraw())
                    {
                        showDraw();

                    }
                    else
                    {
                        playerTurn=!playerTurn;
                        if(playerTurn)
                        {
                            playerOneLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerTwoLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                        else
                        {
                            playerTwoLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerOneLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Reset the game!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSelectable(6)&&!gameOver)
                {
                    positions[6]= playerTurn?1:2;
                    if(playerTurn) {
                        image6.setImageResource(R.drawable.cross);
                    }
                    else
                    {
                        image6.setImageResource(R.drawable.circle1);
                    }
                    if(isWin(playerTurn))
                    {
                        showToast(playerTurn);

                    }
                    else if(isDraw())
                    {
                        showDraw();

                    }
                    else
                    {
                        playerTurn=!playerTurn;
                        if(playerTurn)
                        {
                            playerOneLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerTwoLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                        else
                        {
                            playerTwoLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerOneLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Reset the game!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSelectable(7)&&!gameOver)
                {
                    positions[7]= playerTurn?1:2;
                    if(playerTurn) {
                        image7.setImageResource(R.drawable.cross);
                    }
                    else
                    {
                        image7.setImageResource(R.drawable.circle1);
                    }
                    if(isWin(playerTurn))
                    {
                        showToast(playerTurn);

                    }
                    else if(isDraw())
                    {
                        showDraw();

                    }
                    else
                    {
                        playerTurn=!playerTurn;
                        if(playerTurn)
                        {
                            playerOneLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerTwoLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                        else
                        {
                            playerTwoLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerOneLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Reset the game!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSelectable(8)&&!gameOver) {
                    positions[8] = playerTurn ? 1 : 2;
                    if (playerTurn) {
                        image8.setImageResource(R.drawable.cross);
                    } else {
                        image8.setImageResource(R.drawable.circle1);
                    }
                    if (isWin(playerTurn)) {
                        showToast(playerTurn);
                    } else if (isDraw()) {
                        Toast.makeText(MainActivity.this, "It's a draw!", Toast.LENGTH_SHORT).show();
                    } else {
                        playerTurn = !playerTurn;
                        if(playerTurn)
                        {
                            playerOneLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerTwoLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                        else
                        {
                            playerTwoLayout.setBackgroundResource(R.drawable.stroke_highlight);
                            playerOneLayout.setBackgroundResource(R.drawable.round_purple);
                        }
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Reset the game!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public boolean isSelectable(int position)
    {
        return positions[position] == 0;
    }

    public boolean isWin(boolean playerTurn) {
        for(int[] a:combinations)
        {
            if((playerTurn?1:2)==positions[a[0]]&&(playerTurn?1:2)==positions[a[1]]&&(playerTurn?1:2)==positions[a[2]])
            {
                gameOver=true;
                return true;
            }
        }
        return false;
    }

    public boolean isDraw()  {

            for(int j=0;j<9;j++)
            {
                if(positions[j]==0)
                {
                    return false;
                }
            }
            gameOver=true;
        return true;
    }

    public void reset(View view)  {
        positions=new int[]{0,0,0,0,0,0,0,0,0};
        playerTurn=true;
        gameOver=false;
        playerOneLayout.setBackgroundResource(R.drawable.stroke_highlight);
        playerTwoLayout.setBackgroundResource(R.drawable.round_purple);
        image0.setImageResource(R.drawable.transparent_back);
        image1.setImageResource(R.drawable.transparent_back);
        image2.setImageResource(R.drawable.transparent_back);
        image3.setImageResource(R.drawable.transparent_back);
        image4.setImageResource(R.drawable.transparent_back);
        image5.setImageResource(R.drawable.transparent_back);
        image6.setImageResource(R.drawable.transparent_back);
        image7.setImageResource(R.drawable.transparent_back);
        image8.setImageResource(R.drawable.transparent_back);
    }

    public void showToast(boolean playerTurn)
    {
        dialog dialog;
        if(playerTurn)
        {
            dialog = new dialog(MainActivity.this, playerOne.getText().toString()+" has won!!", MainActivity.this);
        }
        else
        {
            dialog = new dialog(MainActivity.this, playerTwo.getText().toString()+" has won!!", MainActivity.this);
        }
        dialog.setCancelable(true);
        dialog.show();
    }

    public void showDraw()
    {
        dialog dialog=new dialog(MainActivity.this,"It's a Draw!!",MainActivity.this);
        dialog.setCancelable(true);
        dialog.show();
    }
}