package com.mobile.belajar_mvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.mobile.belajar_mvvm.R;
import com.mobile.belajar_mvvm.databinding.ActivityLuasBinding;
import com.mobile.belajar_mvvm.utils.view;
import com.mobile.belajar_mvvm.viewmodel.MainViewModel;

public class Luas_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLuasBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_luas);
        MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        binding.setViewmodel(mainViewModel);
        binding.setLifecycleOwner(this);

        mainViewModel.getSegitiga().observe(this,segitiga -> {
            if (segitiga.getHasil()!=null){
                view.toast(this,segitiga.getHasil().toString());
            }
        });
    }
}