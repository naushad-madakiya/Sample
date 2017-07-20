package com.android.githubsampleandroid.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.githubsampleandroid.R;
import com.android.githubsampleandroid.ui.feature.FeatureActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.button_open_feature)
    public void openFeature() {
        Intent intent = new Intent(this, FeatureActivity.class);
        intent.putExtra(FeatureActivity.EXTRA_SOME_ID, "id_1");
        startActivity(intent);
    }
}
