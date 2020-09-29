package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: ihf reason: default package */
public final class ihf implements vua<ihe> {
    private final wlc<SpSharedPreferences<Object>> a;
    private final wlc<jvr> b;
    private final wlc<hxl> c;

    private ihf(wlc<SpSharedPreferences<Object>> wlc, wlc<jvr> wlc2, wlc<hxl> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ihf a(wlc<SpSharedPreferences<Object>> wlc, wlc<jvr> wlc2, wlc<hxl> wlc3) {
        return new ihf(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ihe((SpSharedPreferences) this.a.get(), (jvr) this.b.get(), (hxl) this.c.get());
    }
}
