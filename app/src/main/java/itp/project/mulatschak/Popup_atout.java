package itp.project.mulatschak;

import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import itp.project.Enums.Colors;

public class Popup_atout extends AppCompatActivity {
    ImageView atout;
    Button mit, aus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_atout);

        //Popup größe
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int witdh = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(witdh*.8), (int)(height*.8));//80% der höhe und Breite des Bildschirms

        //Atout anzeigen
        atout = findViewById(R.id.at);
        selectAtout();//Auslesen
        showAtout();//Anzeigen


        //Button für mitgehen
        mit = findViewById(R.id.mit);
        mit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Playground.alreadyLeft = false;
                //Zu Kartentausch weiterleiten
                startActivity(new Intent(Popup_atout.this, Popup_kartentausch.class));
                //Popup schließen
                finish();
            }
        });

        //Button für aussteigen - eine Neue runde wird angesagt
        aus = findViewById(R.id.aus);
        aus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Neues Spiel (fängt mit stichansage an)
                Playground.alreadyLeft = true;
                startActivity(new Intent(Popup_atout.this, PopupStichansage.class));
                //Popup schließen
                finish();
            }
        });


        //Der Benutzer kann nicht aussteigen wenn er in der Runde davor ausgestiegen ist
        if(Playground.alreadyLeft){
            aus.setClickable(false);//Button kann nicht gedrückt werden
            aus.setBackgroundColor(R.color.grey);//Button ist heller um zu zeigen, dass er nichz gedrückt werden kann
        }
    }

    /**
     * Das Atout wird in dem dafür vorgesehenen Feld angezeigt.
     * Dafür wird das gespeicherte Atout der Klasse Playground verwendet.
     */
    private void showAtout(){
            switch(Playground.Atout){
                case HERZ: atout.setImageResource(R.drawable.herz);
                    break;
                case BLATT: atout.setImageResource(R.drawable.blatt);
                    break;
                case EICHEL: atout.setImageResource(R.drawable.eiche);
                    break;
                case SCHELLE: atout.setImageResource(R.drawable.schelle);
                    break;
                default: atout.setImageResource(R.drawable.empty);
            }
    }

    /**
     * Das Atout wird ausgelesen und im Attribut in der Klasse Playground gespeichert gespeichert
     */
    public static void selectAtout(){
        //Atout aus dem Algorithmus Übernehmen
        Playground.Atout = Algorithm.atout;
        Playground.Atout = Colors.HERZ;
    }
}