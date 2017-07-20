package com.android.githubsampleandroid.di.module;

import android.content.Context;

import com.android.githubsampleandroid.SampleApplication;
import com.android.githubsampleandroid.ui.feature.FeatureSubComponent;

import dagger.Module;
import dagger.Provides;

/**
 * App Module that will provide context to other modules
 */
@Module(subcomponents = {FeatureSubComponent.class})
public class AppModule {

    @Provides
    Context context(SampleApplication application) {
        return application.getApplicationContext();
    }

    // Add application level bindings here, e.g.: RestClientApi, Repository, etc.
}
