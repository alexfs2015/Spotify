package defpackage;

import com.spotify.music.podcastentityrow.PlaySourceProvider;

/* renamed from: tmf reason: default package */
public final class tmf implements vua<tme> {
    private final wlc<twd> a;
    private final wlc<PlaySourceProvider> b;
    private final wlc<Boolean> c;

    private tmf(wlc<twd> wlc, wlc<PlaySourceProvider> wlc2, wlc<Boolean> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tmf a(wlc<twd> wlc, wlc<PlaySourceProvider> wlc2, wlc<Boolean> wlc3) {
        return new tmf(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new tme((twd) this.a.get(), (PlaySourceProvider) this.b.get(), ((Boolean) this.c.get()).booleanValue());
    }
}
