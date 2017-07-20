package com.android.githubsampleandroid.ui.feature;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {FeatureModule.class})
public interface FeatureSubComponent extends AndroidInjector<FeatureActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FeatureActivity> {
    }
}
