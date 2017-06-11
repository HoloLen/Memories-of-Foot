package com.example.fe.jiyi_design;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SquareActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        ImageButton button1 = (ImageButton) findViewById(R.id.foot_imgbtn);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SquareActivity.this,FootActivity.class);
                startActivity(intent);
            }
        });
        ImageButton button2 = (ImageButton) findViewById(R.id.mine_imgbtn);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SquareActivity.this,MineActivity.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(R.id.button1);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(SquareActivity.this,Square2Activity.class);
                startActivity(intent);
            }
        });
        ImageButton button4 = (ImageButton) findViewById(R.id.xlcs_imgbtn);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(SquareActivity.this,XlcsActivity.class);
                startActivity(intent);
            }
        });
    }
}
