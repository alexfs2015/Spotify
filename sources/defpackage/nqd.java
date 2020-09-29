package defpackage;

import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;

/* renamed from: nqd reason: default package */
public final class nqd implements wig<HomeMixInteractionLogger> {
    private final wzi<nsk> a;
    private final wzi<gkq> b;

    private nqd(wzi<nsk> wzi, wzi<gkq> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static HomeMixInteractionLogger a(nsk nsk, gkq gkq) {
        return (HomeMixInteractionLogger) wil.a(nsk.a(gkq), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static nqd a(wzi<nsk> wzi, wzi<gkq> wzi2) {
        return new nqd(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return a((nsk) this.a.get(), (gkq) this.b.get());
    }
}
