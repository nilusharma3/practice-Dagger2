package com.example.anil.dagger2sample.dataGenerater;

import android.util.Log;

import com.example.anil.dagger2sample.models.SampleData;
import com.example.anil.dagger2sample.models.SampleNames;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by anil on 2/21/18.
 */
@Singleton
public class DataSource {

    public DataSource() {
        Log.e("DAta source", "initialised");
    }


    public ArrayList<SampleData> getSampleData() {
        ArrayList<SampleData> dataList = new ArrayList<>();

        SampleData sampleData1 = new SampleData("name one", 1);
        SampleData sampleData2 = new SampleData("name two", 2);
        SampleData sampleData3 = new SampleData("name three", 3);
        SampleData sampleData4 = new SampleData("name four", 4);
        SampleData sampleData5 = new SampleData("name five", 5);
        SampleData sampleData6 = new SampleData("name six", 6);

        dataList.add(sampleData1);
        dataList.add(sampleData2);
        dataList.add(sampleData3);
        dataList.add(sampleData4);
        dataList.add(sampleData5);
        dataList.add(sampleData6);

        return dataList;
    }


    public ArrayList<SampleNames> getSampleName() {
        ArrayList<SampleNames> dataList = new ArrayList<>();

        SampleNames names1 = new SampleNames("sample name 1");
        SampleNames names2 = new SampleNames("sample name 2");
        SampleNames names3 = new SampleNames("sample name 3");
        SampleNames names4 = new SampleNames("sample name 4");
        SampleNames names5 = new SampleNames("sample name 5");
        SampleNames names6 = new SampleNames("sample name 6");

        dataList.add(names1);
        dataList.add(names2);
        dataList.add(names3);
        dataList.add(names4);
        dataList.add(names5);
        dataList.add(names6);

        return dataList;
    }
}
