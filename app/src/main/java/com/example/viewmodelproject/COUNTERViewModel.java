package com.example.viewmodelproject;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class COUNTERViewModel extends ViewModel {
    public MutableLiveData<Integer>count=new MutableLiveData<>();
    public COUNTERViewModel(){
        count.setValue(0);
    }
    public  void addOneCount(){
        count.setValue(count.getValue()+1);
    }
}
