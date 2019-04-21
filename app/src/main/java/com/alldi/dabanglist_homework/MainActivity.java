package com.alldi.dabanglist_homework;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.alldi.dabanglist_homework.adapters.DabangAdapter;
import com.alldi.dabanglist_homework.databinding.ActivityMainBinding;
import com.alldi.dabanglist_homework.datas.Dabang;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding act;
    List<Dabang> dabangList = new ArrayList<>();
    DabangAdapter dabangAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setValue();
        fillDabang();
        setupEvents();

    }

    void setValue(){

        dabangAdapter = new DabangAdapter(MainActivity.this , dabangList);
        act.dabangList.setAdapter(dabangAdapter);

    }

    void fillDabang(){
        dabangList.add(new Dabang(100, 13, 2,"경상북도 구미시 송정동", "분리형 원룸", "(풀옵션)번개시장 근처"));
        dabangList.add(new Dabang(100, 15, 3,"경상북도 구미시 신평동", "분리형 원룸", "신평1동사무소 부근"));
        dabangList.add(new Dabang(100, 13, 3,"경상북도 구미시 원평동", "분리형 원룸", "(풀옵션)구미역 뒤"));
        dabangList.add(new Dabang(100, 13, 2,"경상북도 구미시 형곡동", "분리형 원룸", "(풀옵션)먹자골목 근처"));
        dabangList.add(new Dabang(100, 15, 2,"경상북도 구미시 신평동", "분리형 원룸", "새출발을 응원합니다."));
    }
    
    void setupEvents(){
        
        act.dabangList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Dabang dabangData = dabangList.get(position);

                Intent intent = new Intent(MainActivity.this, AppDetail.class);

                intent.putExtra("앱정보", dabangData);

                startActivity(intent);

            }
        });
        
    }
    
}
