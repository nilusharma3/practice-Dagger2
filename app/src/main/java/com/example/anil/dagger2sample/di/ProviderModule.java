package com.example.anil.dagger2sample.di;

import android.content.Context;

import com.example.anil.dagger2sample.MainInteractor;
import com.example.anil.dagger2sample.MainPresenter;
import com.example.anil.dagger2sample.dataGenerater.DataSource;

import dagger.Module;
import dagger.Provides;

/**
 * Created by anil on 2/21/18.
 */

@Module
public class ProviderModule {
    private Context mContext;

    public ProviderModule(Context context) {
        mContext = context;
    }

    @Provides
    DataSource dataSourceProvider() {
        return new DataSource();
    }

    @Provides
    MainPresenter mainPresenterProvider() {
        return new MainPresenter(mainInteractorProvider());
    }

    @Provides
    MainInteractor mainInteractorProvider() {
        return new MainInteractor(new DataSource());
    }

}
