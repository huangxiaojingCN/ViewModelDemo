package com.hxj.viewmodeldemo;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private int clickCountA, clickCountB = 0;

    public int getInitialCountA() {

        return clickCountA;
    }

    public int getInitialCountB() {

        return clickCountB;
    }

    public int getCurrentCountA() {

        clickCountA += 1;
        return clickCountA;
    }

    public int getCurrentCountB() {

        clickCountB += 1;
        return clickCountB;
    }
}
