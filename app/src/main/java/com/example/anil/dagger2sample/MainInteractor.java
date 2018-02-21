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

public class MainInteractor {

    public DataSource dataSource;

    public MainInteractor(DataSource dataSource) {
        this.dataSource = dataSource;
        Log.e("MainInteractor", "initialised");
    }

    public SampleNames getSampleName() {
        ArrayList<SampleNames> list = new ArrayList<>();
        list = dataSource.getSampleName();
        Random random = new Random();
        int randomNumber = random.nextInt(list.size());
        return list.get(randomNumber);
    }

    public SampleData getSampleData() {
        ArrayList<SampleData> list = new ArrayList<>();
        list = dataSource.getSampleData();
        Random random = new Random();
        int randomNumber = random.nextInt(list.size());
        return list.get(randomNumber);
    }


}
