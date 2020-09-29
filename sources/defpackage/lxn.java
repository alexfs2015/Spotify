package defpackage;

import io.reactivex.Scheduler;

/* renamed from: lxn reason: default package */
public final class lxn implements vua<vit<gzz>> {
    private final wlc<Scheduler> a;
    private final wlc<gzz> b;

    private lxn(wlc<Scheduler> wlc, wlc<gzz> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lxn a(wlc<Scheduler> wlc, wlc<gzz> wlc2) {
        return new lxn(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (vit) vuf.a(new a((gzz) this.b.get(), (Scheduler) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
