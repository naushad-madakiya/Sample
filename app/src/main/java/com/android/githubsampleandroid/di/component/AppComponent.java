package com.android.githubsampleandroid.di.component;

import com.android.githubsampleandroid.SampleApplication;
import com.android.githubsampleandroid.di.module.AppModule;
import com.android.githubsampleandroid.di.module.BuildersModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        BuildersModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(SampleApplication application);

        AppComponent build();
    }

    void inject(SampleApplication app);
}
