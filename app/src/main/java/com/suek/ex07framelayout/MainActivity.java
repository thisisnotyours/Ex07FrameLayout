package com.suek.ex07framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layoutKorea;
    LinearLayout layoutJapan;
    LinearLayout layoutChina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutKorea= findViewById(R.id.layout_korea);
        layoutJapan= findViewById(R.id.layout_Japan);
        layoutChina= findViewById(R.id.layout_China);
    }

    //  1)
    public void clickBtn(View v){    //v- 누른놈을 참조

        // 우선 전부 안보이도록..
        layoutKorea.setVisibility(View.INVISIBLE);
        layoutJapan.setVisibility(View.INVISIBLE);
        layoutChina.setVisibility(View.INVISIBLE);

        //누른 버튼을 구별하기 위해 id 얻어오기 (어떤 버튼인지 모르니까)
        int id= v.getId();

        switch (id){
            case R.id.btn01:
                layoutKorea.setVisibility(View.VISIBLE);
            break;

            case R.id.btn02:
                layoutJapan.setVisibility(View.VISIBLE);
            break;

            case R.id.btn03:
                layoutChina.setVisibility(View.VISIBLE);
            break;
        }

    }


}
