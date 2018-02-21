package com.example.anil.dagger2sample.models;

/**
 * Created by anil on 2/21/18.
 */

public class SampleData {
    private String title;
    private int number;

    public SampleData(String title, int number) {
        this.title = title;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }
}
