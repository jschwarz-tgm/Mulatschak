package itp.project.Popups;

import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import itp.project.Mulatschak.Listeners;
import itp.project.Mulatschak.Playground;
import itp.project.Mulatschak.R;

public class PopupStichansage extends AppCompatActivity {

    Button skip, muli;
    TextView one,two, three,four, highest;//Stichanzahl
    int countStitches, said;
    ImageView eyeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_stichansage);

        Playground.austeilen();

        eyeBtn = findViewById(R.id.eyeBtn);
        eyeBtn.setOnTouchListener(Listeners.newListener(this));


        //Button Muli
        muli = findViewById(R.id.muli);
        muli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countStitches = 5;
                //Atout wählen
                startActivity(new Intent(PopupStichansage.this, Popup_selectAtout.class));
                finish();
            }
        });

        //Bereits angesagte Stiche
        highest = findViewById(R.id.highest);
        try{
            said = Integer.parseInt(highest.getText().toString());
        }catch (NumberFormatException e){
            said = 0;
        }



        //Skip Button
        skip = findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PopupStichansage.this, Popup_atout.class));
                finish();
            }
        });

        //Ein Stich
        one = findViewById(R.id.stich1);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countStitches = 1;
                nextPopup();
            }
        });

        //Zwei Stiche
        two = findViewById(R.id.stich2);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countStitches = 2;
                nextPopup();
            }
        });

        //Drei Stiche
        three = findViewById(R.id.stich3);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countStitches = 3;
                nextPopup();
            }
        });

        //Vier Stiche
        four = findViewById(R.id.stich4);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countStitches = 4;
                nextPopup();
            }
        });
    }

    /**
     * Es wird geprüft ob die angegeben Stiche höher sind als die bereits angesagten.
     * Je nachdem kann man dem Popup Atout oder Atout wählen kommen.
     */
    private void nextPopup(){
        if(countStitches > said){
            //man hat die höchsten Stiche angesagt und kann jetzt das Atout wählen
            startActivity(new Intent(PopupStichansage.this, Popup_selectAtout.class));
        } else{
            startActivity(new Intent(PopupStichansage.this, Popup_atout.class));
        }
        finish();
    }
}