package com.alldi.dabanglist_homework;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alldi.dabanglist_homework.databinding.ActivityAppDetailBinding;
import com.alldi.dabanglist_homework.datas.Dabang;

import java.util.List;

public class AppDetail extends AppCompatActivity {

    ActivityAppDetailBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_app_detail);

        setupEvents();
        setValues();

    }

    void setupEvents(){

    }
    void setValues(){

        Dabang dabangData;
        dabangData = (Dabang) getIntent().getSerializableExtra("앱정보");

        act.paymentAndMTxt.setText(String.format("월세 %d/%d",dabangData.payment,dabangData.menthpayment));
        act.optionContextTxt.setText(dabangData.optionroom);

    }
}
