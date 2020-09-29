package defpackage;

import com.spotify.music.spotlets.offline.util.OffliningLogger;

/* renamed from: pbj reason: default package */
public final class pbj implements vua<pbi> {
    private final wlc<String> a;
    private final wlc<OffliningLogger> b;
    private final wlc<jjf> c;
    private final wlc<jrf> d;

    private pbj(wlc<String> wlc, wlc<OffliningLogger> wlc2, wlc<jjf> wlc3, wlc<jrf> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static pbj a(wlc<String> wlc, wlc<OffliningLogger> wlc2, wlc<jjf> wlc3, wlc<jrf> wlc4) {
        return new pbj(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new pbi((String) this.a.get(), (OffliningLogger) this.b.get(), (jjf) this.c.get(), (jrf) this.d.get());
    }
}
