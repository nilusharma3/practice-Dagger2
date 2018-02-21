package com.example.anil.dagger2sample;

import android.util.Log;

import com.example.anil.dagger2sample.dataGenerater.DataSource;
import com.example.anil.dagger2sample.models.SampleData;
import com.example.anil.dagger2sample.models.SampleNames;

import java.util.ArrayList;
import java.util.Random;

import javax.inject.Inject;

/**
 * Created by anil on 2/21/18.
 */

public class MainPresenter {

    public MainInteractor interactor;

    public MainPresenter(MainInteractor interactor) {
        this.interactor = interactor;
        Log.e("main presenter", "initialised");
    }

    public String getName() {
        Log.e("Main presenter ", "getNAme()");
        return interactor.getSampleName().getName();
    }

    public SampleData getSAmpleData() {
        return interactor.getSampleData();
    }

}
