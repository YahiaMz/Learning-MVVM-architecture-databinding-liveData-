package com.aplication.simpleapp_for_mvvm.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CountViewmodel extends ViewModel {

public   MutableLiveData<Integer> countMld;
public CountViewmodel(){
createInstance();
}

private   void createInstance  ( ){
    if (countMld == null) {
        countMld = new MutableLiveData<>(0);
    }
}
    public void setCountValue (int v) {
    countMld.setValue(v);
    }

    public int getCountValue () {return countMld.getValue();}



}
