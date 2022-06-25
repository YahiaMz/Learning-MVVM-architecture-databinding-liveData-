package com.aplication.simpleapp_for_mvvm.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.icu.util.EthiopicCalendar;
import android.os.Bundle;
import android.view.View;

import com.aplication.simpleapp_for_mvvm.R;
import com.aplication.simpleapp_for_mvvm.databinding.ActivityMainBinding;
import com.aplication.simpleapp_for_mvvm.presenters.onMainActitityClicked;
import com.aplication.simpleapp_for_mvvm.viewmodels.CountClass;
import com.aplication.simpleapp_for_mvvm.viewmodels.CountViewmodel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    CountViewmodel countClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.activityMainBinding = DataBindingUtil.setContentView(this , R.layout.activity_main);
        countClass = new ViewModelProvider(this).get(CountViewmodel.class);



       /* this.activityMainBinding.addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   countClass.setCountValue(countClass.getCountValue() + 2);
            }
        });*/



        this.activityMainBinding.subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countClass.setCountValue(countClass.getCountValue() - 2);
            }
        });
        this.activityMainBinding.ZeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countClass.setCountValue(0);
            }
        });

        countClass.countMld.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                activityMainBinding.tSowNumber.setText(countClass.getCountValue() +"");
            }
        });

    }
}