package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Information extends AppCompatActivity {
    TextView tv1;
    TextView tv3;
    TextView tv6;
    TextView tv12;
    TextView pt;
    TextView tvex;
    String sub_text2;
    DBHelper2 dbHelper2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        // 툴바 생성
        Toolbar toolbar6 = findViewById(R.id.informaion_toolbar);
        setSupportActionBar(toolbar6);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // 뒤로가기 버튼, 디폴트로 true만 해도 백버튼이 생김
        getSupportActionBar().setTitle("정보 확인"); // 툴바 제목 설정

        tv1 = findViewById(R.id.tv1);
        tv3 = findViewById(R.id.tv3);
        tv6 = findViewById(R.id.tv6);
        tv12 = findViewById(R.id.tv12);
        tvex = findViewById(R.id.tvex);
        pt = findViewById(R.id.pt);
        Intent intent2 = getIntent();
        sub_text2 = intent2.getStringExtra("이름2");
        dbHelper2 = new DBHelper2(Information.this, 1);
        tvex.setText(sub_text2);

        tv1.setText(dbHelper2.getPerPrice(sub_text2, "1"));
        tv3.setText(dbHelper2.getPerPrice(sub_text2, "3"));
        tv6.setText(dbHelper2.getPerPrice(sub_text2, "6"));
        tv12.setText(dbHelper2.getPerPrice(sub_text2, "12"));
        pt.setText(dbHelper2.getPerPrice(sub_text2, "pt"));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{ //toolbar의 back키 눌렀을 때 동작
                // 액티비티 이동
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}