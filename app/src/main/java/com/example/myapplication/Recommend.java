package com.example.myapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Recommend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);

        // 툴바 생성
        Toolbar toolbar3 = findViewById(R.id.recommend_toolbar);
        setSupportActionBar(toolbar3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // 뒤로가기 버튼, 디폴트로 true만 해도 백버튼이 생김
        getSupportActionBar().setTitle("추천받기"); // 툴바 제목 설정
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner_1);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner_2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner_3);
        Spinner spinner4 = (Spinner) findViewById(R.id.spinner_4);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.my_array, android.R.layout.simple_spinner_item);//res->values->array.xml의 my_array와 연동
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);
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