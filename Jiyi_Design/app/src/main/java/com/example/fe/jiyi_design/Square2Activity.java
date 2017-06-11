package com.example.fe.jiyi_design;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Square2Activity extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square2);
        ImageButton button1 = (ImageButton) findViewById(R.id.foot_imgbtn);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Square2Activity.this,FootActivity.class);
                startActivity(intent);
            }
        });
        ImageButton button2 = (ImageButton) findViewById(R.id.mine_imgbtn);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Square2Activity.this,MineActivity.class);
                startActivity(intent);
            }
        });
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Square2Activity.this,SquareActivity.class);
                startActivity(intent);
            }
        });
    }
}
