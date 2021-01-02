package itp.project.Popups;

import android.content.ClipData;
import android.util.DisplayMetrics;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import itp.project.Mulatschak.Card;
import itp.project.Mulatschak.Listeners;
import itp.project.Mulatschak.Playground;
import itp.project.Mulatschak.R;

import java.util.ArrayList;
import java.util.List;

public class Popup_kartentausch extends AppCompatActivity implements View.OnTouchListener, View.OnDragListener{

    ImageView card1, card2, card3, card4, card5, delete, move, eyeBtn;
    ImageButton change;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_kartentausch);

        count = 0;

        eyeBtn = findViewById(R.id.eyeBtn);
        eyeBtn.setOnTouchListener(Listeners.newListener(this));


        //Karten des SPielers anzeigen
        card1 = findViewById(R.id.card1);
        card1.setImageDrawable(Playground.getPlayer(1).getHoldingCards().get(0).getPicture());

        card2 = findViewById(R.id.card2);
        card2.setImageDrawable(Playground.getPlayer(1).getHoldingCards().get(1).getPicture());

        card3 = findViewById(R.id.card3);
        card3.setImageDrawable(Playground.getPlayer(1).getHoldingCards().get(2).getPicture());

        card4 = findViewById(R.id.card4);
        card4.setImageDrawable(Playground.getPlayer(1).getHoldingCards().get(3).getPicture());

        card5 = findViewById(R.id.card5);
        card5.setImageDrawable(Playground.getPlayer(1).getHoldingCards().get(4).getPicture());

        card1.setOnTouchListener(this);
        card2.setOnTouchListener(this);
        card3.setOnTouchListener(this);
        card4.setOnTouchListener(this);
        card5.setOnTouchListener(this);

        //Ok Button
        change = findViewById(R.id.change);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Es können nicht 4 Karten getauscht werden
                if(count != 4) {
//                    startActivity(new Intent(Popup_kartentausch.this, Playground.class));
                    finish();
                }
            }
        });

        //Löschen Button
        delete = findViewById(R.id.delete);
        delete.setOnDragListener(this);
    }
    @Override
    public boolean onTouch(View v, MotionEvent event) {

        View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(
                v);
        ClipData data = ClipData.newPlainText("", "");
        v.startDrag(data, shadowBuilder, v, 0);
        return false;
    }

    @Override
    public boolean onDrag(View v, DragEvent event) {
        switch (event.getAction()) {
            case DragEvent.ACTION_DRAG_STARTED:
                break;
            case DragEvent.ACTION_DRAG_ENTERED:
                break;
            case DragEvent.ACTION_DRAG_EXITED:
                break;
            case DragEvent.ACTION_DROP:
                break;
            case DragEvent.ACTION_DRAG_ENDED:
                //Karte in den Mistkübel gezogen
                if (event.getResult()) {
                    v.setVisibility(View.INVISIBLE);//unsichtbar setzten
                    changeCard((ImageView) v);//Karte tauschen
                    count++;
                }
            default:
                break;
        }
        return true;
    }

    /**
     * Die ImageView der Karte, die getauscht werden soll wird übergeben.
     * Dann im Algorithmus die Karte  tauschen
     * @param v - Karte
     */
    public void changeCard(ImageView v){
        Card change;//Die zu tauschende Karte
        System.out.println(v.getId());
        switch (v.getId()){
            case R.id.card1:
                change = Playground.getPlayer(1).getHoldingCards().get(0);
                break;
            case R.id.card2:
                change = Playground.getPlayer(1).getHoldingCards().get(1);
                break;
            case R.id.card3:
                change = Playground.getPlayer(1).getHoldingCards().get(2);
                break;
            case R.id.card4:
                change = Playground.getPlayer(1).getHoldingCards().get(3);
                break;
            case R.id.card5:
                change = Playground.getPlayer(1).getHoldingCards().get(4);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
        //Methode im Algorithmus aufrufen
        List<Card> cardsToChange = new ArrayList<>();
        cardsToChange.add(change);
        Playground.getPlayer(1).changeCards(cardsToChange,5);
    }

}