package com.android.githubsampleandroid.di.component;

import com.android.githubsampleandroid.di.module.AppModule;
import com.android.githubsampleandroid.di.module.RestClientModule;
import com.android.githubsampleandroid.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, RestClientModule.class})
public interface RestComponent {
    void inject(MainActivity activity);
}
