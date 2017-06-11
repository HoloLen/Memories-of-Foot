package com.example.fe.jiyi_design;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MineActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        ImageButton button1 = (ImageButton) findViewById(R.id.foot_imgbtn);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MineActivity.this,FootActivity.class );
                startActivity(intent);
            }
        });
        ImageButton button2 = (ImageButton) findViewById(R.id.square_imgbtn);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MineActivity.this,SquareActivity.class);
                startActivity(intent);
            }
        });
    }
}
