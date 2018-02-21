package com.example.anil.dagger2sample.di;

import com.example.anil.dagger2sample.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by anil on 2/21/18.
 */
@Singleton
@Component(modules = ProviderModule.class)
public interface AppComponent {
    void inject(MainActivity activity);
}
