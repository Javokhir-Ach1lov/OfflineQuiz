package com.uzdewoloper.offlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private String selectedTopicName="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


  final LinearLayout java=findViewById ( R.id.javaLayout );
  final LinearLayout android=findViewById ( R.id.androidLayout );
  final LinearLayout php=findViewById ( R.id.phpLayout );
  final LinearLayout C=findViewById ( R.id.CLayout );

  final Button startBtn=findViewById ( R.id.startQuizBtn );

  java.setOnClickListener ( new View.OnClickListener ( ) {
      @Override
      public void onClick(View v) {

 selectedTopicName="java";

 java.setBackgroundResource ( R.drawable.round_back_white_stroke10 );

 php.setBackgroundResource ( R.drawable.round_back_white10 );
 android.setBackgroundResource ( R.drawable.round_back_white10 );
 C.setBackgroundResource ( R.drawable.round_back_white10 );
      }
  } );

        android.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {

                selectedTopicName="android";

                android.setBackgroundResource ( R.drawable.round_back_white_stroke10 );

                php.setBackgroundResource ( R.drawable.round_back_white10 );
                java.setBackgroundResource ( R.drawable.round_back_white10 );
                C.setBackgroundResource ( R.drawable.round_back_white10 );
            }
        } );

        php.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {

                selectedTopicName="php";

                php.setBackgroundResource ( R.drawable.round_back_white_stroke10 );

                java.setBackgroundResource ( R.drawable.round_back_white10 );
                android.setBackgroundResource ( R.drawable.round_back_white10 );
                C.setBackgroundResource ( R.drawable.round_back_white10);
            }
        } );

  C.setOnClickListener ( new View.OnClickListener ( ) {
      @Override
      public void onClick(View v) {

          selectedTopicName="C";

          C.setBackgroundResource ( R.drawable.round_back_white_stroke10 );

          php.setBackgroundResource ( R.drawable.round_back_white10 );
          android.setBackgroundResource ( R.drawable.round_back_white10 );
          java.setBackgroundResource ( R.drawable.round_back_white10 );
      }
  } );
  startBtn.setOnClickListener ( new View.OnClickListener ( ) {
      @Override
      public void onClick(View v) {

          if (selectedTopicName.isEmpty ()){
              Toast.makeText ( MainActivity.this,"Please select the Topic",Toast.LENGTH_SHORT ).show ();

          }
          else {
              Intent intent=new Intent (MainActivity.this,QuizActivity.class);
              intent.putExtra ( "selectedTopic",selectedTopicName );
              startActivity ( intent );
          }
      }
  } );
    }
}