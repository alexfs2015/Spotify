package defpackage;

import io.reactivex.Scheduler;

/* renamed from: opj reason: default package */
public final class opj implements vua<opi> {
    private final wlc<ois> a;
    private final wlc<opk> b;
    private final wlc<String> c;
    private final wlc<Scheduler> d;

    private opj(wlc<ois> wlc, wlc<opk> wlc2, wlc<String> wlc3, wlc<Scheduler> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static opj a(wlc<ois> wlc, wlc<opk> wlc2, wlc<String> wlc3, wlc<Scheduler> wlc4) {
        return new opj(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new opi((ois) this.a.get(), (opk) this.b.get(), (String) this.c.get(), (Scheduler) this.d.get());
    }
}
