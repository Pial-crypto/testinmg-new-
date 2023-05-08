package com.example.tictac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView win;
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    Button start;

    LinearLayout lafalafi;
    boolean isItFirstTime = false;
    boolean flg = false;

    String b1, b2, b3, b4, b5, b6, b7, b8, b9;

    void newgame() {
      bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        flg=false;
        isItFirstTime=false;
       // lafalafi.setBackgroundColor(getResources().getColor(R.color.red));
    }


     //   View v;





        public void press (View v){
        //write in here
            if (isItFirstTime) {
                Button nowbtn = (Button) v;
                //write in here

                if (nowbtn.getText().toString() == "") {
                    ///if (nowbtn.getText().toString() != "Start Game") {
                        if (!flg) nowbtn.setText("X");
                        else nowbtn.setText("O");
                  //  }
///x or use kra lgbe na?msngr e dekho to discuss kri jinista

                    flg = !flg;


                    b1 = bt1.getText().toString();
                    b2 = bt2.getText().toString();
                    b3 = bt3.getText().toString();
                    b4 = bt4.getText().toString();
                    b5 = bt5.getText().toString();
                    b6 = bt6.getText().toString();
                    b7 = bt7.getText().toString();
                    b8 = bt8.getText().toString();
                    b9 = bt9.getText().toString();



                    if (b1 == b2 && b2 == b3 && b1 != "") {
                        win.setText(b1 + " is the winner");
                       lafalafi.setBackgroundColor(getResources().getColor(R.color.black));
                        Toast.makeText(this, "Congratulation Boss,Contact me for price", Toast.LENGTH_SHORT).show();
                        newgame();

                    } else if (b4 == b5 && b5 == b6 && b4 != "") {
                        win.setText(b4 + " is the winner");
                       lafalafi.setBackgroundColor(getResources().getColor(R.color.black));
                        Toast.makeText(this, "Congratulation Boss,Contact me for price", Toast.LENGTH_SHORT).show();
                        newgame();


                    } else if (b7 == b8 && b8 == b9 && b7 != "") {
                        win.setText(b7 + " is the winner");
                        lafalafi.setBackgroundColor(getResources().getColor(R.color.black));
                        Toast.makeText(this, "Congratulation Boss,Contact me for price", Toast.LENGTH_SHORT).show();
                        newgame();

                    } else if (b1 == b5 && b5 == b9 && b1 != "") {
                        win.setText(b1 + " is the winner");
                        lafalafi.setBackgroundColor(getResources().getColor(R.color.black));
                        Toast.makeText(this, "Congratulation Boss,Contact me for price", Toast.LENGTH_SHORT).show();
                        newgame();

                    } else if (b3 == b5 && b5 == b7 && b3 != "") {
                        win.setText(b3 + " is the winner");
                        Toast.makeText(this, "Congratulation Boss,Contact me for price", Toast.LENGTH_SHORT).show();
                        newgame();
                        lafalafi.setBackgroundColor(getResources().getColor(R.color.black));
                    } else if (b1 == b4 && b4 == b7 && b1 != "") {
                        win.setText(b1 + " is the winner");
                        lafalafi.setBackgroundColor(getResources().getColor(R.color.black));
                        Toast.makeText(this, "Congratulation Boss,Contact me for price", Toast.LENGTH_SHORT).show();
                        newgame();
                    } else if (b2 == b5 && b5 == b8 && b2 != "") {
                        win.setText(b2 + " is the winner");
                        lafalafi.setBackgroundColor(getResources().getColor(R.color.black));
                        Toast.makeText(this, "Congratulation Boss,Contact me for price", Toast.LENGTH_SHORT).show();
                        newgame();
                    } else if (b3 == b6 && b6 == b9 && b3 != "") {
                        win.setText(b3 + " is the winner");
                        lafalafi.setBackgroundColor(getResources().getColor(R.color.black));
                        Toast.makeText(this, "Congratulation Boss,Contact me for price", Toast.LENGTH_SHORT).show();
                        newgame();

                    } else if (b1 != "" && b2 != "" && b3 != "" && b4 != "" && b5 != "" && b6 != "" && b7 != "" && b8 != "" && b9 != "") {
                        win.setText("Match Drawn");
                        lafalafi.setBackgroundColor(getResources().getColor(R.color.black));

                        newgame();
                        Toast.makeText(this, "No result.Sad life", Toast.LENGTH_SHORT).show();

                    }

                    

                }
            }

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        win = findViewById(R.id.winner);

        start = findViewById(R.id.start);
        bt1 = findViewById(R.id.btn1);
        bt2 = findViewById(R.id.btn2);
        bt3 = findViewById(R.id.btn3);
        bt4 = findViewById(R.id.btn4);
        bt5 = findViewById(R.id.btn5);
        bt6 = findViewById(R.id.btn6);
        bt7 = findViewById(R.id.btn7);
        bt8 = findViewById(R.id.btn8);
        bt9 = findViewById(R.id.btn9);

lafalafi=findViewById(R.id.mithila);



        Intent splash=new Intent(MainActivity.this, splash.class);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(splash);
            }
        },5000);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*
                if (!isItFirstTime) {
                    //set isItFirst time to false
                    isItFirstTime = false;

                    //by setting isItFirstTime false, after that user others button should be enabled
                }
                else {
 */

                isItFirstTime=true;
                lafalafi.setBackgroundColor(getResources().getColor(R.color.white));
               // newgame();

               // if(isItFirstTime){
                  //  press(v);

                    //run press() method or function in here

                }

        });





    }





}

