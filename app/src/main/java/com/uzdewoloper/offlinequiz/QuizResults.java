package com.uzdewoloper.offlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

public class QuizResults extends AppCompatActivity {
 MaterialCardView home;
 TextView correctt,wrongt,resultinfo,resultscore,resultscoree;
 ImageView resultImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_quiz_results );

        home=findViewById ( R.id.returnHome );
        correctt=findViewById ( R.id.correctScore );
        wrongt=findViewById ( R.id.wrongScore );
        resultinfo=findViewById ( R.id.resultinfo );
        resultImage=findViewById ( R.id.resultlmage );
        resultscore=findViewById ( R.id.resultScore );

        int correct=getIntent ().getIntExtra ( "correct",0 );
        int wrong=getIntent ().getIntExtra ( "wrong",0 );
        int score=correct*1;
        int scoree=wrong*1;

        resultscoree.setText ( ""+scoree );
        correctt.setText ( "" +correct );
        wrongt.setText ( "" +wrong );
        resultscore.setText ( "" +score );

        if (correct>=0 && correct<=3){
            resultinfo.setText ( "You have to take the test again" );
            resultImage.setImageResource ( R.drawable.round_sentiment_dissatisfied_24 );
        }
        else if (correct>=4 && correct<=7){
            resultinfo.setText ( "You have to try a little more" );
            resultImage.setImageResource ( R.drawable.round_sentiment_neutral_24 );
        }
        else if (correct>=8 && correct<=10){
            resultinfo.setText ( "You are  pretty good" );
            resultImage.setImageResource ( R.drawable.round_sentiment_satisfied_24 );
        }
        home.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                startActivity ( new Intent (QuizResults.this,MainActivity.class) );
                finish ();
            }
        } );
    }
    @Override
    public void onBackPressed(){
        startActivity ( new Intent (QuizResults.this,QuizActivity.class) );
        finish ();
    }
}