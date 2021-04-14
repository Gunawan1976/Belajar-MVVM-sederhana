package com.mobile.belajar_mvvm.viewmodel;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mobile.belajar_mvvm.model.Segitiga;
import com.mobile.belajar_mvvm.utils.view;

import java.util.function.DoubleBinaryOperator;

public class MainViewModel extends ViewModel {
    public MutableLiveData<String> etAlas = new MutableLiveData<>();
    public MutableLiveData<String> etTinggi = new MutableLiveData<>();
    public MutableLiveData<String> etSisi1 = new MutableLiveData<>();
    public MutableLiveData<String> etSisi2 = new MutableLiveData<>();
    public MutableLiveData<String> etSisi3 = new MutableLiveData<>();
    private MutableLiveData<Segitiga> segitigaMutableLiveData;

    public void btnLuas(Context context){
        if (etAlas.getValue()==null||etAlas.getValue().length()==0||etTinggi.getValue()==null||etTinggi.getValue().length()==0||etSisi1.getValue()==null||etSisi1.getValue().length()==0||etSisi2.getValue()==null||etSisi2.getValue().length()==0||etSisi3.getValue()==null||etSisi3.getValue().length()==0){
            view.toast(context,"harus diisi semua");
            return;
        }
        Double alas = Double.parseDouble(etAlas.getValue());
        Double tinggi = Double.parseDouble(etTinggi.getValue());
        Double hasilLuas = (alas*tinggi)/2;

        Segitiga segitiga = new Segitiga(alas,tinggi,hasilLuas);
        segitigaMutableLiveData.setValue(segitiga);

    }
    public void btnKel(Context context){
        if (etSisi1.getValue() == null||etSisi1.getValue().length()==0||etSisi2.getValue() == null||etSisi2.getValue().length()==0||etSisi3.getValue() == null||etSisi3.getValue().length()==0){
            view.toast(context, "harus terisi semua...");
            return;
        }
        Double sisi1 = Double.parseDouble(etSisi1.getValue());
        Double sisi2 = Double.parseDouble(etSisi2.getValue());
        Double sisi3 = Double.parseDouble(etSisi3.getValue());
        Double hasilkel = sisi1+sisi2+sisi3;

        Segitiga segitiga = new Segitiga(sisi1,sisi2,sisi3,hasilkel);
        segitigaMutableLiveData.setValue(segitiga);
    }
    public LiveData<Segitiga>getSegitiga(){
        if (segitigaMutableLiveData==null){
            segitigaMutableLiveData = new MutableLiveData<>();
        }
        return segitigaMutableLiveData;
    }
}
