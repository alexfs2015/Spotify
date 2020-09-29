package defpackage;

import com.spotify.music.activesessionbanner.ActiveSessionBannerLogger;

/* renamed from: kmg reason: default package */
public final class kmg implements vua<ActiveSessionBannerLogger> {
    private final wlc<jjf> a;
    private final wlc<jrp> b;

    public static ActiveSessionBannerLogger a(jjf jjf, jrp jrp) {
        return new ActiveSessionBannerLogger(jjf, jrp);
    }

    public final /* synthetic */ Object get() {
        return new ActiveSessionBannerLogger((jjf) this.a.get(), (jrp) this.b.get());
    }
}
