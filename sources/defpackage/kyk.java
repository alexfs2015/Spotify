package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.libs.debugtools.flags.DebugFlag;

/* renamed from: kyk reason: default package */
public final class kyk {
    public static final b<Object, Boolean> a = b.b("capped_ondemand:has_been_exposed");
    public final SpSharedPreferences<Object> b;

    public kyk(SpSharedPreferences<Object> spSharedPreferences) {
        this.b = (SpSharedPreferences) fbp.a(spSharedPreferences);
    }

    public static boolean a() {
        DebugFlag debugFlag = DebugFlag.MO_CAPPED_ONDEMAND;
        return false;
    }

    private static boolean a(fqm<String>[] fqmArr, String str, fqn fqn) {
        for (fqm<String> fqm : fqmArr) {
            if (fqm != null) {
                String str2 = (String) fqn.a(fqm);
                if (str2 != null && str2.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b() {
        DebugFlag debugFlag = DebugFlag.MO_CAPPED_ONDEMAND_SHUFFLE;
        return false;
    }

    public static boolean c(fqn fqn) {
        return a(kyj.a, "nonft", fqn);
    }

    public static boolean f(fqn fqn) {
        return a(kyj.a, "all-dialogs", fqn);
    }

    public final void a(boolean z) {
        this.b.a().a(a, z).b();
    }

    public final boolean a(fqn fqn) {
        return a(kyj.a, "cap", fqn);
    }

    public final boolean b(fqn fqn) {
        return a(fqn) && jus.c(fqn);
    }

    public final boolean d(fqn fqn) {
        return f(fqn) || a(kyj.a, "post-dialogs", fqn);
    }

    public final boolean e(fqn fqn) {
        return d(fqn) && !b(fqn);
    }
}
