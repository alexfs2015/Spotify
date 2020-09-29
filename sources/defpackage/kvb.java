package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.libs.debugtools.flags.DebugFlag;

/* renamed from: kvb reason: default package */
public final class kvb {
    public static final b<Object, Boolean> a = b.b("capped_ondemand:has_been_exposed");
    public final SpSharedPreferences<Object> b;

    public kvb(SpSharedPreferences<Object> spSharedPreferences) {
        this.b = (SpSharedPreferences) fay.a(spSharedPreferences);
    }

    public final boolean a(fpt fpt) {
        return a(kva.a, "cap", fpt);
    }

    public final boolean b(fpt fpt) {
        return a(fpt) && jsl.c(fpt);
    }

    public static boolean c(fpt fpt) {
        return a(kva.a, "nonft", fpt);
    }

    public final boolean d(fpt fpt) {
        return f(fpt) || a(kva.a, "post-dialogs", fpt);
    }

    public final boolean e(fpt fpt) {
        return d(fpt) && !b(fpt);
    }

    public static boolean f(fpt fpt) {
        return a(kva.a, "all-dialogs", fpt);
    }

    public final void a(boolean z) {
        this.b.a().a(a, z).b();
    }

    public static boolean a() {
        DebugFlag debugFlag = DebugFlag.MO_CAPPED_ONDEMAND;
        return false;
    }

    public static boolean b() {
        DebugFlag debugFlag = DebugFlag.MO_CAPPED_ONDEMAND_SHUFFLE;
        return false;
    }

    private static boolean a(fps<String>[] fpsArr, String str, fpt fpt) {
        for (fps<String> fps : fpsArr) {
            if (fps != null) {
                String str2 = (String) fpt.a(fps);
                if (str2 != null && str2.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
