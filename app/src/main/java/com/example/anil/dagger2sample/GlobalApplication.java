package com.example.anil.dagger2sample;

import android.app.Application;
import android.content.Context;

import com.example.anil.dagger2sample.di.AppComponent;
import com.example.anil.dagger2sample.di.DaggerAppComponent;
import com.example.anil.dagger2sample.di.ProviderModule;

/**
 * Created by anil on 2/21/18.
 */

public class GlobalApplication extends Application {
    private AppComponent appComponent;

    public static AppComponent component(Context context) {
        GlobalApplication globalApplication = (GlobalApplication) context.getApplicationContext();
        return globalApplication.appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .providerModule(new ProviderModule(this))
                .build();
    }
}
