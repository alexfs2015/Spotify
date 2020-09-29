package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: qhs reason: default package */
public final class qhs implements vua<qhr> {
    private final wlc<SpSharedPreferences<Object>> a;

    private qhs(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static qhs a(wlc<SpSharedPreferences<Object>> wlc) {
        return new qhs(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qhr((SpSharedPreferences) this.a.get());
    }
}
