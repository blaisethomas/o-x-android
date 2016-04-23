package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class GameActivity extends AppCompatActivity {

    //player game states:
    ArrayList<Integer> player1moves = new ArrayList();
    ArrayList<Integer> player2moves = new ArrayList();
    //winning combos:
    Integer[] combo1 = new Integer[]{1,2,3};
    Integer[] combo2 = new Integer[]{4,5,6};
    Integer[] combo3 = new Integer[]{7,8,9};
    Integer[] combo4 = new Integer[]{1,4,7};
    Integer[] combo5 = new Integer[]{2,5,8};
    Integer[] combo6 = new Integer[]{3,6,9};
    Integer[] combo7 = new Integer[]{1,5,9};
    Integer[] combo8 = new Integer[]{3,5,7};
    Integer[][] winningCombos = new Integer[][]{ combo1, combo2, combo3, combo4, combo5, combo6, combo7, combo8};
    //game counter:
    int counter;
    //players names
    String player1;
    String player2;
    //views
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
                move(v);
                if (counter % 2 == 0) {
                    player1moves.add(1);
                }else{
                    player2moves.add(1);
                }
                winCheck();
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move(v);
                if (counter % 2 == 0) {
                    player1moves.add(2);
                }else{
                    player2moves.add(2);
                }
                winCheck();
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move(v);
                if (counter % 2 == 0) {
                    player1moves.add(3);
                }else{
                    player2moves.add(3);
                }
                winCheck();
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move(v);
                if (counter % 2 == 0) {
                    player1moves.add(4);
                }else{
                    player2moves.add(4);
                }
                winCheck();
            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move(v);
                if (counter % 2 == 0) {
                    player1moves.add(5);
                }else{
                    player2moves.add(5);
                }
                winCheck();
            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move(v);
                if (counter % 2 == 0) {
                    player1moves.add(6);
                }else{
                    player2moves.add(6);
                }
                winCheck();
            }
        });

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move(v);
                if (counter % 2 == 0) {
                    player1moves.add(7);
                }else{
                    player2moves.add(7);
                }
                winCheck();
            }
        });

        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move(v);
                if (counter % 2 == 0) {
                    player1moves.add(8);
                }else{
                    player2moves.add(8);
                }
                winCheck();
            }
        });

        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move(v);
                if (counter % 2 == 0) {
                    player1moves.add(9);
                }else{
                    player2moves.add(9);
                }
                winCheck();
            }
        });

    }// end of onCreate

    public boolean winCheck(){

        for (int i = 0; i < winningCombos.length; i++ ){
            if (player1moves.containsAll(Arrays.asList(winningCombos[i]))){
                Toast.makeText(GameActivity.this, "winner !", Toast.LENGTH_SHORT).show();
                game_message_text.setText(player1 + " wins!");
                Intent intent = new Intent(GameActivity.this, MainActivity.class);
                intent.putExtra("winner", player1);
                startActivity(intent);
            }else if (player2moves.containsAll(Arrays.asList(winningCombos[i]))){
                Toast.makeText(GameActivity.this, "winner !", Toast.LENGTH_SHORT).show();
                game_message_text.setText(player2 + " wins!");
                Intent winner = new Intent(GameActivity.this, MainActivity.class);
                winner.putExtra("winner", player2);
                startActivity(winner);
            }
        }
        counter ++;
        return true;
    }

    public void move(View v){
        TextView tv = (TextView)v;

        if (tv.getText().toString() == "" ) {
            if (counter % 2 == 0) {
                tv.setText("x");
                game_message_text.setText(player2 + "'s turn");
            } else if (counter % 2 != 0) {
                tv.setText("o");
                game_message_text.setText(player1 + "'s turn");
            }
        } else {
            Toast.makeText(GameActivity.this, "Seat's Taken", Toast.LENGTH_LONG).show();
        }
    }
}
