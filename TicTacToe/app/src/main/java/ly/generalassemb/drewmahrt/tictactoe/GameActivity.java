package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    int counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final TextView game_message_text = (TextView) findViewById(R.id.game_message_text);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        TextView textView4 = (TextView)findViewById(R.id.textView4);
        TextView textView5 = (TextView)findViewById(R.id.textView5);
        TextView textView6 = (TextView)findViewById(R.id.textView6);
        TextView textView7 = (TextView)findViewById(R.id.textView7);
        TextView textView8 = (TextView)findViewById(R.id.textView8);
        TextView textView9 = (TextView)findViewById(R.id.textView9);

        Intent intent = getIntent();
        final String player1 = intent.getStringExtra("player1");
        final String player2 = intent.getStringExtra("player2");
        game_message_text.setText(player1 + "'s turn");


        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter % 2 == 0) {
                    textView1.setText("x");
                    game_message_text.setText(player2 + "'s turn");
                    counter++;
                } else if (counter % 2 != 0) {
                    textView1.setText("o");
                    game_message_text.setText(player1 + "'s turn");
                    counter++;
                }
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter%2 == 0){
                    textView2.setText("x");
                    game_message_text.setText(player2 + "'s turn");
                    counter++;
                } else if (counter %2 != 0){
                    textView2.setText("o");
                    game_message_text.setText(player1+ "'s turn");
                    counter ++;
                }
            }
        });

    }







}
