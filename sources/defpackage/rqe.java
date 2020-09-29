package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: rqe reason: default package */
public final class rqe implements vua<rqd> {
    private final wlc<SpSharedPreferences<Object>> a;

    private rqe(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static rqe a(wlc<SpSharedPreferences<Object>> wlc) {
        return new rqe(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rqd((SpSharedPreferences) this.a.get());
    }
}
