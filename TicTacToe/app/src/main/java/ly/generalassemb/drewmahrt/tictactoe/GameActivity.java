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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final TextView game_message_text = (TextView) findViewById(R.id.game_message_text);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);

        Intent intent = getIntent();
        final String player1 = intent.getStringExtra("player1");
        final String player2 = intent.getStringExtra("player2");
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
                if (counter%2 == 0){
                    textView2.setText("x");
                    game_message_text.setText(player2 + "'s turn");
                } else if (counter %2 != 0){
                    textView2.setText("o");
                    game_message_text.setText(player1+ "'s turn");
                }
                winCheck();
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter%2 == 0){
                    textView3.setText("x");
                    game_message_text.setText(player2 + "'s turn");
                } else if (counter %2 != 0){
                    textView3.setText("o");
                    game_message_text.setText(player1+ "'s turn");
                }
                winCheck();
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter%2 == 0){
                    textView4.setText("x");
                    game_message_text.setText(player2 + "'s turn");
                } else if (counter %2 != 0){
                    textView4.setText("o");
                    game_message_text.setText(player1+ "'s turn");
                }
                winCheck();
            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter%2 == 0){
                    textView5.setText("x");
                    game_message_text.setText(player2 + "'s turn");
                } else if (counter %2 != 0){
                    textView5.setText("o");
                    game_message_text.setText(player1+ "'s turn");
                }
                winCheck();
            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter%2 == 0){
                    textView6.setText("x");
                    game_message_text.setText(player2 + "'s turn");
                } else if (counter %2 != 0){
                    textView6.setText("o");
                    game_message_text.setText(player1+ "'s turn");
                }
                winCheck();
            }
        });

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter%2 == 0){
                    textView7.setText("x");
                    game_message_text.setText(player2 + "'s turn");
                } else if (counter %2 != 0){
                    textView7.setText("o");
                    game_message_text.setText(player1+ "'s turn");
                }
                winCheck();
            }
        });

        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter%2 == 0){
                    textView8.setText("x");
                    game_message_text.setText(player2 + "'s turn");
                } else if (counter %2 != 0){
                    textView8.setText("o");
                    game_message_text.setText(player1+ "'s turn");
                }
                winCheck();
            }
        });

        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter%2 == 0){
                    textView9.setText("x");
                    game_message_text.setText(player2 + "'s turn");
                } else if (counter %2 != 0){
                    textView9.setText("o");
                    game_message_text.setText(player1+ "'s turn");
                }
                winCheck();
            }
        });


    }// end of on create

    public boolean winCheck(){
        Log.d(TAG, "win check invoked" );
        counter ++;
        return true;
    }









}
