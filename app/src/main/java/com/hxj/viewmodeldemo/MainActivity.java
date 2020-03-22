package com.hxj.viewmodeldemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MainViewModel mainViewModel;
    TextView tvScoreA, tvScoreB;
    Button btnPlayerA, btnPlayerB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        /**
         * initialized ViewModel
         */

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // set initial counter from view model
        tvScoreA.setText(String.valueOf(mainViewModel.getCurrentCountA()));
        tvScoreB.setText(String.valueOf(mainViewModel.getCurrentCountB()));

    }

    private void initView() {
        // initialized all views here
        tvScoreA = findViewById(R.id.tv_score_a);
        tvScoreB = findViewById(R.id.tv_score_b);
        btnPlayerA = findViewById(R.id.btn_a);
        btnPlayerB = findViewById(R.id.btn_b);
        btnPlayerA.setOnClickListener(this);
        btnPlayerB.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_a:
                //set current counter from view model
                tvScoreA.setText(String.valueOf(mainViewModel.getCurrentCountA()));
                break;
            case R.id.btn_b:
                //set current counter from view model
                tvScoreB.setText(String.valueOf(mainViewModel.getCurrentCountB()));
                break;
            default:
        }
    }
}
