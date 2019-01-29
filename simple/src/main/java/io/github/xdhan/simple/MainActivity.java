package io.github.xdhan.simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.xdhan.hchooser.HChooser;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 129;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HChooser.from(this).choose().forResult(REQUEST_CODE);
    }
}
