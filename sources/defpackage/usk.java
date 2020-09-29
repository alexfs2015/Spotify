package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: usk reason: default package */
public final class usk implements wig<usj> {
    private final wzi<ObjectMapper> a;
    private final wzi<usi> b;
    private final wzi<SpSharedPreferences<Object>> c;
    private final wzi<RxPlayerState> d;
    private final wzi<hhc> e;

    private usk(wzi<ObjectMapper> wzi, wzi<usi> wzi2, wzi<SpSharedPreferences<Object>> wzi3, wzi<RxPlayerState> wzi4, wzi<hhc> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static usk a(wzi<ObjectMapper> wzi, wzi<usi> wzi2, wzi<SpSharedPreferences<Object>> wzi3, wzi<RxPlayerState> wzi4, wzi<hhc> wzi5) {
        usk usk = new usk(wzi, wzi2, wzi3, wzi4, wzi5);
        return usk;
    }

    public final /* synthetic */ Object get() {
        usj usj = new usj((ObjectMapper) this.a.get(), (usi) this.b.get(), (SpSharedPreferences) this.c.get(), (RxPlayerState) this.d.get(), (hhc) this.e.get());
        return usj;
    }
}
