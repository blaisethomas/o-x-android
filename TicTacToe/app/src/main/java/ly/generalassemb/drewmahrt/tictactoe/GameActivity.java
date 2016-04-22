package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    private static final String TAG = "Debug wincheck";
    ArrayList<Integer> player1moves = new ArrayList();
    ArrayList<Integer> player2moves = new ArrayList();
    int counter;
    String player1;
    String player2;
    TextView game_message_text;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        game_message_text = (TextView) findViewById(R.id.game_message_text);
        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
        textView4 = (TextView)findViewById(R.id.textView4);
        textView5 = (TextView)findViewById(R.id.textView5);
        textView6 = (TextView)findViewById(R.id.textView6);
        textView7 = (TextView)findViewById(R.id.textView7);
        textView8 = (TextView)findViewById(R.id.textView8);
        textView9 = (TextView)findViewById(R.id.textView9);

        Intent intent = getIntent();
        player1 = intent.getStringExtra("player1");
        player2 = intent.getStringExtra("player2");
        game_message_text.setText(player1 + "'s turn");


        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView1.getText().toString() == "" ) {
                    if (counter % 2 == 0) {
                        textView1.setText("x");
                        game_message_text.setText(player2 + "'s turn");
                        player1moves.add(1);
                    } else if (counter % 2 != 0) {
                        textView1.setText("o");
                        game_message_text.setText(player1 + "'s turn");
                        player2moves.add(1);
                    }
                    winCheck();
                } else {
                    Toast.makeText(GameActivity.this, "Seat's Taken", Toast.LENGTH_LONG).show();
                }
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().toString() == "" ) {
                    if (counter % 2 == 0) {
                        textView2.setText("x");
                        game_message_text.setText(player2 + "'s turn");
                        player1moves.add(2);
                    } else if (counter % 2 != 0) {
                        textView2.setText("o");
                        game_message_text.setText(player1 + "'s turn");
                        player2moves.add(2);
                    }
                    winCheck();
                } else {
                    Toast.makeText(GameActivity.this, "Seat's Taken", Toast.LENGTH_LONG).show();
                }
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView3.getText().toString() == "" ) {
                    if (counter % 2 == 0) {
                        textView3.setText("x");
                        game_message_text.setText(player2 + "'s turn");
                        player1moves.add(3);
                    } else if (counter % 2 != 0) {
                        textView3.setText("o");
                        game_message_text.setText(player1 + "'s turn");
                        player2moves.add(3);
                    }
                    winCheck();
                } else {
                    Toast.makeText(GameActivity.this, "Seat's Taken", Toast.LENGTH_LONG).show();
                }
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView4.getText().toString() == "" ) {
                    if (counter % 2 == 0) {
                        textView4.setText("x");
                        game_message_text.setText(player2 + "'s turn");
                        player1moves.add(4);
                    } else if (counter % 2 != 0) {
                        textView4.setText("o");
                        game_message_text.setText(player1 + "'s turn");
                        player2moves.add(4);
                    }
                    winCheck();
                } else {
                    Toast.makeText(GameActivity.this, "Seat's Taken", Toast.LENGTH_LONG).show();
                }
            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView5.getText().toString() == "" ) {
                    if (counter % 2 == 0) {
                        textView5.setText("x");
                        game_message_text.setText(player2 + "'s turn");
                        player1moves.add(5);
                    } else if (counter % 2 != 0) {
                        textView5.setText("o");
                        game_message_text.setText(player1 + "'s turn");
                        player2moves.add(5);
                    }
                    winCheck();
                } else {
                    Toast.makeText(GameActivity.this, "Seat's Taken", Toast.LENGTH_LONG).show();
                }
            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView6.getText().toString() == "" ) {
                    if (counter % 2 == 0) {
                        textView6.setText("x");
                        game_message_text.setText(player2 + "'s turn");
                        player1moves.add(6);
                    } else if (counter % 2 != 0) {
                        textView6.setText("o");
                        game_message_text.setText(player1 + "'s turn");
                        player2moves.add(6);
                    }
                    winCheck();
                } else {
                    Toast.makeText(GameActivity.this, "Seat's Taken", Toast.LENGTH_LONG).show();
                }
            }
        });

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView7.getText().toString() == "" ) {
                    if (counter % 2 == 0) {
                        textView7.setText("x");
                        game_message_text.setText(player2 + "'s turn");
                        player1moves.add(7);
                    } else if (counter % 2 != 0) {
                        textView7.setText("o");
                        game_message_text.setText(player1 + "'s turn");
                        player2moves.add(7);
                    }
                    winCheck();
                } else {
                    Toast.makeText(GameActivity.this, "Seat's Taken", Toast.LENGTH_LONG).show();
                }
            }
        });

        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView8.getText().toString() == "" ) {
                    if (counter % 2 == 0) {
                        textView8.setText("x");
                        game_message_text.setText(player2 + "'s turn");
                        player1moves.add(8);
                    } else if (counter % 2 != 0) {
                        textView8.setText("o");
                        game_message_text.setText(player1 + "'s turn");
                        player2moves.add(8);
                    }
                    winCheck();
                } else {
                    Toast.makeText(GameActivity.this, "Seat's Taken", Toast.LENGTH_LONG).show();
                }
            }
        });

        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView9.getText().toString() == "" ) {
                    if (counter % 2 == 0) {
                        textView9.setText("x");
                        game_message_text.setText(player2 + "'s turn");
                        player1moves.add(9);
                    } else if (counter % 2 != 0) {
                        textView9.setText("o");
                        game_message_text.setText(player1 + "'s turn");
                        player2moves.add(9);
                    }
                    winCheck();
                } else {
                    Toast.makeText(GameActivity.this, "Seat's Taken", Toast.LENGTH_LONG).show();
                }
            }
        });

    }// end of on create

    public boolean winCheck(){
        Log.d(TAG, "win check invoked" );

        if (player1moves.contains(1) && player1moves.contains(2) && player1moves.contains(3)){
            Toast.makeText(GameActivity.this, "X wins", Toast.LENGTH_SHORT).show();
        }


        counter ++;
        return true;
    }









}
