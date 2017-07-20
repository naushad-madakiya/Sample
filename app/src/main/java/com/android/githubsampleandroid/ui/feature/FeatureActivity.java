package com.android.githubsampleandroid.ui.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.githubsampleandroid.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class FeatureActivity extends AppCompatActivity implements FeatureView {

    public static final String EXTRA_SOME_ID = "some_id";

    @Inject
    FeaturePresenter presenter;

    String someId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        someId = getIntent().getStringExtra(EXTRA_SOME_ID);
        AndroidInjection.inject(this);
        setContentView(R.layout.activity_feature);
        presenter.doNothing();
    }

    @Override
    public void doNothing() {
        Log.e("Debug - ", "doNothing");
    }
}