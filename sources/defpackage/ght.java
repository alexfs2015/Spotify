package defpackage;

import io.reactivex.Scheduler;

/* renamed from: ght reason: default package */
public final class ght implements vua<ghd> {
    private final wlc<ghc> a;
    private final wlc<Scheduler> b;

    private ght(wlc<ghc> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ght a(wlc<ghc> wlc, wlc<Scheduler> wlc2) {
        return new ght(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (ghd) vuf.a(new ghd((ghc) this.a.get(), (Scheduler) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
