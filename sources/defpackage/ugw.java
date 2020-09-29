package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: ugw reason: default package */
public final class ugw implements vua<ugv> {
    private final wlc<ObjectMapper> a;
    private final wlc<ugu> b;
    private final wlc<SpSharedPreferences<Object>> c;
    private final wlc<RxPlayerState> d;
    private final wlc<heg> e;

    private ugw(wlc<ObjectMapper> wlc, wlc<ugu> wlc2, wlc<SpSharedPreferences<Object>> wlc3, wlc<RxPlayerState> wlc4, wlc<heg> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static ugw a(wlc<ObjectMapper> wlc, wlc<ugu> wlc2, wlc<SpSharedPreferences<Object>> wlc3, wlc<RxPlayerState> wlc4, wlc<heg> wlc5) {
        ugw ugw = new ugw(wlc, wlc2, wlc3, wlc4, wlc5);
        return ugw;
    }

    public final /* synthetic */ Object get() {
        ugv ugv = new ugv((ObjectMapper) this.a.get(), (ugu) this.b.get(), (SpSharedPreferences) this.c.get(), (RxPlayerState) this.d.get(), (heg) this.e.get());
        return ugv;
    }
}
