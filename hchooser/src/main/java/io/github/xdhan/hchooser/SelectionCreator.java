package io.github.xdhan.hchooser;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.StyleRes;
import android.support.v4.app.Fragment;

import io.github.xdhan.hchooser.internal.entity.SelectionSpec;
import io.github.xdhan.hchooser.ui.HChooserActivity;

/**
 * Created by dongdong.han on 2019/1/29
 */
public final class SelectionCreator {
    private final HChooser mHChooser;
    private final SelectionSpec mSelectionSpec;

    SelectionCreator(HChooser hChooser) {
        mHChooser = hChooser;
        mSelectionSpec = SelectionSpec.getCleanInstance();
    }

    public SelectionCreator theme(@StyleRes int themeId) {
        mSelectionSpec.themeId = themeId;
        return this;
    }

    public void forResult(int requestCode) {
        Activity activity = mHChooser.getActivity();
        if (activity == null) {
            return;
        }

        Intent intent = new Intent(activity, HChooserActivity.class);

        Fragment fragment = mHChooser.getFragment();
        if (fragment != null) {
            fragment.startActivityForResult(intent, requestCode);
        } else {
            activity.startActivityForResult(intent, requestCode);
        }
    }
}
