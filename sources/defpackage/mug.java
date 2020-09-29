package defpackage;

import io.reactivex.Scheduler;

/* renamed from: mug reason: default package */
public final class mug implements vua<muf> {
    private final wlc<iqa> a;
    private final wlc<Scheduler> b;
    private final wlc<String> c;

    private mug(wlc<iqa> wlc, wlc<Scheduler> wlc2, wlc<String> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mug a(wlc<iqa> wlc, wlc<Scheduler> wlc2, wlc<String> wlc3) {
        return new mug(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new muf((iqa) this.a.get(), (Scheduler) this.b.get(), (String) this.c.get());
    }
}
