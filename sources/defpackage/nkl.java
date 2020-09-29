package defpackage;

import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;

/* renamed from: nkl reason: default package */
public final class nkl implements vua<HomeMixInteractionLogger> {
    private final wlc<nmv> a;
    private final wlc<gjf> b;

    private nkl(wlc<nmv> wlc, wlc<gjf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nkl a(wlc<nmv> wlc, wlc<gjf> wlc2) {
        return new nkl(wlc, wlc2);
    }

    public static HomeMixInteractionLogger a(nmv nmv, gjf gjf) {
        return (HomeMixInteractionLogger) vuf.a(nmv.a(gjf), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((nmv) this.a.get(), (gjf) this.b.get());
    }
}
