package com.spotify.android.glue.patterns.toolbarmenu;

import android.content.Context;
import androidx.fragment.app.Fragment;

public final class ToolbarConfig {

    public enum Visibility {
        HIDE,
        SHOW,
        ONLY_MAKE_ROOM
    }

    public interface a {
        Visibility a();
    }

    public interface b {
        boolean aQ_();
    }

    public interface c {
    }

    public interface d {
    }

    public static boolean a(Context context, Fragment fragment) {
        if (!(context == null || fragment == null)) {
            if (fragment instanceof b) {
                return ((b) fragment).aQ_();
            }
            Class cls = fragment.getClass();
            if (jtc.a(context) && d.class.isAssignableFrom(cls)) {
                return true;
            }
            if (!jtc.b(context) || !c.class.isAssignableFrom(cls)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static Visibility a(Fragment fragment) {
        if (fragment == null) {
            return Visibility.SHOW;
        }
        if (fragment instanceof a) {
            return ((a) fragment).a();
        }
        return Visibility.SHOW;
    }
}
