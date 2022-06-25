package com.aplication.simpleapp_for_mvvm.viewmodels;

public class CountClass {
    int count;
    private static CountClass countClassInstance;
    private CountClass () {}
    public static CountClass getInst ( ) {
        if (countClassInstance == null) countClassInstance = new CountClass();
        return countClassInstance;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
