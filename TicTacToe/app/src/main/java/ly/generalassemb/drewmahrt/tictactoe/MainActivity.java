package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView player1name;
    TextView player2name;
    TextView winnerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button startPlaying = (Button) findViewById(R.id.start_game_button);
        player1name = (TextView) findViewById(R.id.player_one_name);
        player2name = (TextView) findViewById(R.id.player_two_name);
        winnerView = (TextView) findViewById(R.id.last_winner_text);

        Intent winnerIntent = getIntent();
        String lastWinner = winnerIntent.getStringExtra("winner");
        winnerView.setText("Previous winner : " + lastWinner);



        startPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String player1 = player1name.getText().toString();
                String player2 = player2name.getText().toString();

                Intent startGame = new Intent(MainActivity.this, GameActivity.class);
                startGame.putExtra("player1", player1);
                startGame.putExtra("player2", player2);
                startActivity(startGame);
            }
        });


    }

}
