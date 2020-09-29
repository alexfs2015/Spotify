package defpackage;

import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;

/* renamed from: lsj reason: default package */
public final class lsj implements vua<lsi> {
    private final wlc<lse> a;
    private final wlc<AssistedCurationSearchLogger> b;
    private final wlc<sgn> c;

    private lsj(wlc<lse> wlc, wlc<AssistedCurationSearchLogger> wlc2, wlc<sgn> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static lsj a(wlc<lse> wlc, wlc<AssistedCurationSearchLogger> wlc2, wlc<sgn> wlc3) {
        return new lsj(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new lsi((lse) this.a.get(), (AssistedCurationSearchLogger) this.b.get(), (sgn) this.c.get());
    }
}
