package defpackage;

import com.spotify.music.spotlets.offline.util.OffliningLogger;

/* renamed from: ufo reason: default package */
public final class ufo implements vua<OffliningLogger> {
    private final wlc<sih> a;

    private ufo(wlc<sih> wlc) {
        this.a = wlc;
    }

    public static ufo a(wlc<sih> wlc) {
        return new ufo(wlc);
    }

    public final /* synthetic */ Object get() {
        return new OffliningLogger((sih) this.a.get());
    }
}
