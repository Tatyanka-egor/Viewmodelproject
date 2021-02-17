package com.example.viewmodelproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.viewmodelproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setLifecycleOwner(this);

        COUNTERViewModel viewModel=new COUNTERViewModel();
        binding.setCounter(viewModel);
        findViewById(R.id.countVIEW).setOnClickListener(v -> viewModel.addOneCount()

                  );
    }
}