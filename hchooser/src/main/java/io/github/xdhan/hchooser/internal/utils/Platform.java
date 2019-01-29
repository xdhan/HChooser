package io.github.xdhan.hchooser.internal.utils;

import android.os.Build;

/**
 * Created by dongdong.han on 2019/1/29
 */
public class Platform {
    public static boolean hasKitKat() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;
    }
}
