package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.mandatorytrials.model.OnDemandTrial;

/* renamed from: snx reason: default package */
public final class snx {
    static final b<Object, Boolean> a = b.b("mandatory_trials:has_seen_dialog");
    static final b<Object, Boolean> b = b.b("mandatory_trials:has_been_exposed");
    final SpSharedPreferences<Object> c;

    public snx(SpSharedPreferences<Object> spSharedPreferences) {
        this.c = spSharedPreferences;
    }

    public static boolean a(fpt fpt) {
        return fpt.a(sns.a) == OnDemandTrial.ACTIVE;
    }

    public static boolean b(fpt fpt) {
        return fpt.b(sns.b);
    }
}
