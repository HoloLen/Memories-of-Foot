package com.example.fe.jiyi_design;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

/**
 * Created by 张志敏 on 2017/6/2.
 */

public class FootActivity extends Activity {
//    private ViewPager mTabpager;
//    private ImageButton mTabFoot, mTabSquare, mTabMine;
//    private int currIndex = 0;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_foot);
       ImageButton button1 = (ImageButton) findViewById(R.id.square_imgbtn);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FootActivity.this,SquareActivity.class );
                startActivity(intent);
            }
        });
        ImageButton button2 = (ImageButton) findViewById(R.id.mine_imgbtn);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FootActivity.this,MineActivity.class);
                startActivity(intent);
            }
        });
        ImageButton button3 = (ImageButton) findViewById(R.id.weather_imgbtn);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(FootActivity.this,Weather.class);
                startActivity(intent);
            }
        });
        ImageButton button4 = (ImageButton) findViewById(R.id.data_imgbtn);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FootActivity.this,Data.class);
                startActivity(intent);
            }
        });
        ImageButton button5 = (ImageButton) findViewById(R.id.health_imgbtn);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                Intent intent = new Intent(FootActivity.this,Health.class);
                startActivity(intent);
            }
        });
        ImageButton button6 =(ImageButton) findViewById(R.id.jiyi_imgbtn);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FootActivity.this,Jiyi.class);
                startActivity(intent);

            }
        });
//
//



    }}

//        mTabpager = (ViewPager) findViewById(R.id.tab);
//        mTabpager.addOnPageChangeListener(new MyOnPageChangeListener());
//
//        mTabFoot = (ImageButton) findViewById(R.id.foot);
//        mTabSquare = (ImageButton) findViewById(R.id.square);
//        mTabMine = (ImageButton) findViewById(R.id.mine);
//        mTabFoot.setOnClickListener(new MyOnClickListener(0));
//        mTabSquare.setOnClickListener(new MyOnClickListener(1));
//        mTabMine.setOnClickListener(new MyOnClickListener(2));
//
//        LayoutInflater mLi = LayoutInflater.from(this);
//        View viewFoot = mLi.inflate(R.layout.activity_foot, null);
//        View viewSquare = mLi.inflate(R.layout.square_fragment, null);
//        View viewMine = mLi.inflate(R.layout.mine_fragment, null);
//
//        final ArrayList<View> views = new ArrayList<View>();
//        views.add(viewFoot);
//        views.add(viewSquare);
//        views.add(viewMine);
//
//        PagerAdapter mPagerAdapter = new PagerAdapter() {
//            @Override
//            public boolean isViewFromObject(View arg0, Object arg1) {
//                return arg0 == arg1;
//            }
//
//            @Override
//            public int getCount() {
//                return views.size();
//            }
//
//            @Override
//            public void destroyItem(ViewGroup container, int position, Object object) {
//                ((ViewPager) container).removeView(views.get(position));
//            }
//
//            @Override
//            public Object instantiateItem(ViewGroup container, int position) {
//                ((ViewPager) container).addView(views.get(position));
//                return views.get(position);
//            }
//        };
//        mTabpager.setAdapter(mPagerAdapter);
//    }
//
//    public class MyOnClickListener implements View.OnClickListener {
//        private int index = 0;
//
//        public MyOnClickListener(int i) {
//            index = i;
//        }
//
//      @Override
//              public void onClick(View v)
//
//        {
//            mTabpager.setCurrentItem(index);
//        }
//    };
//
//  public class MyOnPageChangeListener implements OnPageChangeListener {
//
//      @Override
//
//      public void onPageSelected(int arg0) {
//          switch (arg0) {
//              case 0: {
//                  mTabFoot.setImageDrawable((ResourcesCompat.getDrawable(getResources(), R.mipmap.foot_after, null)));
//                  if (currIndex == 1) {
//                      mTabSquare.setImageDrawable((ResourcesCompat.getDrawable(getResources(), R.mipmap.square_before, null)));
//                  } else if (currIndex == 2) {
//                      mTabMine.setImageDrawable((ResourcesCompat.getDrawable(getResources(), R.mipmap.mine_before, null)));
//                  }
//                  break;
//              }
//              case 1: {
//                  mTabSquare.setImageDrawable((ResourcesCompat.getDrawable(getResources(), R.mipmap.square_after, null)));
//                  if (currIndex == 0) {
//                      mTabFoot.setImageDrawable((ResourcesCompat.getDrawable(getResources(), R.mipmap.foot_before, null)));
//                  } else if (currIndex == 2) {
//                      mTabMine.setImageDrawable((ResourcesCompat.getDrawable(getResources(), R.mipmap.mine_before, null)));
//                  }
//                  break;
//              }
//              case 2: {
//                  mTabMine.setImageDrawable((ResourcesCompat.getDrawable(getResources(), R.mipmap.mine_after, null)));
//              }
//              if (currIndex == 0) {
//                  mTabFoot.setImageDrawable((ResourcesCompat.getDrawable(getResources(), R.mipmap.foot_before, null)));
//              } else if (currIndex == 1) {
//                  mTabSquare.setImageDrawable((ResourcesCompat.getDrawable(getResources(), R.mipmap.square_before, null)));
//              }
//              break;
//          }currIndex = arg0;
//      }
//
//      @Override
//      public void onPageScrollStateChanged(int arg0) {
//
//      }
//
//      @Override
//      public void onPageScrolled(int arg0, float arg1, int arg2) {
//
//      }
//  }}
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater(),inflate(R.menu.)
//
//
//
//}}