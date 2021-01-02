package itp.project.Mulatschak;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Listeners {

    public static View.OnTouchListener newListener(final AppCompatActivity activity){
        //Popup größe
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        final int width = dm.widthPixels;
        final int height = dm.heightPixels;

        activity.getWindow().setLayout((int)(width*.8), (int)(height*.8));//80% der höhe und Breite des Bildschirms

        return new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.performClick();
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        activity.getWindow().setLayout(0, 0);
                        System.out.println("Down");
                        return true;
                    case MotionEvent.ACTION_UP:
                        activity.getWindow().setLayout((int) (width * .8), (int) (height * .8));
                        System.out.println("Up");
                        return true;
                }
                return false;
            }
        };
    }
}
