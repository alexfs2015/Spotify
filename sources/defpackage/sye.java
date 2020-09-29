package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.mandatorytrials.model.OnDemandTrial;

/* renamed from: sye reason: default package */
public final class sye {
    static final b<Object, Boolean> a = b.b("mandatory_trials:has_seen_dialog");
    static final b<Object, Boolean> b = b.b("mandatory_trials:has_been_exposed");
    final SpSharedPreferences<Object> c;

    public sye(SpSharedPreferences<Object> spSharedPreferences) {
        this.c = spSharedPreferences;
    }

    public static boolean a(fqn fqn) {
        return fqn.a(sxz.a) == OnDemandTrial.ACTIVE;
    }

    public static boolean b(fqn fqn) {
        return fqn.b(sxz.b);
    }
}
