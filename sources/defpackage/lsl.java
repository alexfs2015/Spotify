package defpackage;

import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;

/* renamed from: lsl reason: default package */
public final class lsl implements vua<lsk> {
    private final wlc<lse> a;
    private final wlc<AssistedCurationSearchLogger> b;
    private final wlc<sfx> c;
    private final wlc<sgn> d;

    private lsl(wlc<lse> wlc, wlc<AssistedCurationSearchLogger> wlc2, wlc<sfx> wlc3, wlc<sgn> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static lsl a(wlc<lse> wlc, wlc<AssistedCurationSearchLogger> wlc2, wlc<sfx> wlc3, wlc<sgn> wlc4) {
        return new lsl(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new lsk((lse) this.a.get(), (AssistedCurationSearchLogger) this.b.get(), (sfx) this.c.get(), (sgn) this.d.get());
    }
}
