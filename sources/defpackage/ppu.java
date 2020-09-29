package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: ppu reason: default package */
public final class ppu implements vua<ppt> {
    private final wlc<SpSharedPreferences<Object>> a;
    private final wlc<ppv> b;

    private ppu(wlc<SpSharedPreferences<Object>> wlc, wlc<ppv> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ppu a(wlc<SpSharedPreferences<Object>> wlc, wlc<ppv> wlc2) {
        return new ppu(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ppt((SpSharedPreferences) this.a.get(), (ppv) this.b.get());
    }
}
