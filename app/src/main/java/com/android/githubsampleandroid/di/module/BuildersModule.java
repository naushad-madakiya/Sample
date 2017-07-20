package com.android.githubsampleandroid.di.module;

import android.app.Activity;

import com.android.githubsampleandroid.ui.feature.FeatureActivity;
import com.android.githubsampleandroid.ui.feature.FeatureSubComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module
public abstract class BuildersModule {
    @Binds
    @IntoMap
    @ActivityKey(FeatureActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindFeatureActivityInjectorFactory(FeatureSubComponent.Builder builder);
}
