package io.github.xdhan.hchooser.internal.entity;

import android.support.annotation.StyleRes;

import io.github.xdhan.hchooser.R;

/**
 * Created by dongdong.han on 2019/1/29
 */
public class SelectionSpec {
    @StyleRes
    public int themeId;
    public int maxSelectable;
    public int maxImageSelectable;
    public int maxVideoSelectable;
    public int spanCount;

    public SelectionSpec() {
    }

    public static SelectionSpec getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public static SelectionSpec getCleanInstance() {
        SelectionSpec selectionSpec = getInstance();
        selectionSpec.reset();
        return selectionSpec;
    }

    private void reset() {
        themeId = R.style.HChooser_Theme;
        maxSelectable = 1;
        maxImageSelectable = 0;
        maxVideoSelectable = 0;
        spanCount = 3;
    }

    private static final class InstanceHolder {
        private static final SelectionSpec INSTANCE = new SelectionSpec();
    }
}
