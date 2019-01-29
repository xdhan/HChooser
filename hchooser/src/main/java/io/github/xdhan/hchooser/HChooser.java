package io.github.xdhan.hchooser;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import java.lang.ref.WeakReference;

/**
 * Created by dongdong.han on 2019/1/29
 */
public final class HChooser {
    private final WeakReference<Activity> mContext;
    private final WeakReference<Fragment> mFragment;

    private HChooser(Activity activity, Fragment fragment) {
        mContext = new WeakReference<>(activity);
        mFragment = new WeakReference<>(fragment);
    }

    private HChooser(Activity activity) {
        this(activity, null);
    }

    private HChooser(Fragment fragment) {
        this(fragment.getActivity(), fragment);
    }

    public static HChooser from(Activity activity) {
        return new HChooser(activity);
    }

    public static HChooser from(Fragment fragment) {
        return new HChooser(fragment);
    }

    public SelectionCreator choose(String a) {
        return this.choose();
    }

    public SelectionCreator choose() {
        return new SelectionCreator(this);
    }

    @Nullable
    Activity getActivity() {
        return mContext.get();
    }

    @Nullable
    Fragment getFragment() {
        return mFragment != null ? mFragment.get() : null;
    }

}
