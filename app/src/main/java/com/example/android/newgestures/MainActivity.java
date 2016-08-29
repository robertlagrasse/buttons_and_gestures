package com.example.android.newgestures;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {

    // object from the class that will detect gestures
    private GestureDetectorCompat gestureDetector;

    private TextView resultsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tapButton = (Button) findViewById(R.id.tapButton);
        resultsTextView = (TextView) findViewById(R.id.resultsTextView);

        // creates and sets the onClickListener for the button in Java
        tapButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        TextView LocalresultsTextView = (TextView) findViewById(R.id.resultsTextView);
                        LocalresultsTextView.setText("You Tapped That!");
                    }
                }
        );

        // Fire up a gestureDetector
        // There's another set for double tap gestures
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        resultsTextView.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        resultsTextView.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        resultsTextView.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        resultsTextView.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        resultsTextView.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        resultsTextView.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        resultsTextView.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        resultsTextView.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        resultsTextView.setText("onFling");
        return true;
    }

}
