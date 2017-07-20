package com.android.githubsampleandroid.ui.feature;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class FeatureModule {
    @Binds
    abstract FeatureView provideFeatureView(FeatureActivity activity);

    @Provides
    @Named("someId")
    static String provideSomeId(FeatureActivity featureActivity) {
        return featureActivity.someId;
    }
}
