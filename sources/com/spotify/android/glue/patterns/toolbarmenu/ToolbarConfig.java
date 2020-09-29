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
        boolean b();
    }

    public interface c {
    }

    public interface d {
    }

    public static Visibility a(Fragment fragment) {
        return fragment == null ? Visibility.SHOW : fragment instanceof a ? ((a) fragment).a() : Visibility.SHOW;
    }

    public static boolean a(Context context, Fragment fragment) {
        if (!(context == null || fragment == null)) {
            if (fragment instanceof b) {
                return ((b) fragment).b();
            }
            Class cls = fragment.getClass();
            if (!jvi.a(context) || !d.class.isAssignableFrom(cls)) {
                return jvi.b(context) && c.class.isAssignableFrom(cls);
            }
            return true;
        }
    }
}
