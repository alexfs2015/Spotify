package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: rqa reason: default package */
public final class rqa implements vua<rpz> {
    private final wlc<SpSharedPreferences<Object>> a;

    private rqa(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static rqa a(wlc<SpSharedPreferences<Object>> wlc) {
        return new rqa(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rpz((SpSharedPreferences) this.a.get());
    }
}
