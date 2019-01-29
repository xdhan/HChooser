package io.github.xdhan.hchooser.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import io.github.xdhan.hchooser.R;
import io.github.xdhan.hchooser.internal.entity.SelectionSpec;

/**
 * Created by dongdong.han on 2019/1/29
 */
public class HChooserActivity extends AppCompatActivity {

    private SelectionSpec mSpec;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mSpec = SelectionSpec.getInstance();
        setTheme(mSpec.themeId);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hchooser);

        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle("ddddddddddd");
    }
}
