package defpackage;

import io.reactivex.Scheduler;

/* renamed from: obf reason: default package */
public final class obf implements vua<glw<oas>> {
    private final wlc<Scheduler> a;
    private final wlc<oaz> b;

    private obf(wlc<Scheduler> wlc, wlc<oaz> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static obf a(wlc<Scheduler> wlc, wlc<oaz> wlc2) {
        return new obf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (glw) vuf.a(new glw((Scheduler) this.a.get(), (oaz) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
