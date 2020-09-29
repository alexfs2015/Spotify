package defpackage;

import io.reactivex.Scheduler;

/* renamed from: lls reason: default package */
public final class lls implements vua<llr> {
    private final wlc<Scheduler> a;

    private lls(wlc<Scheduler> wlc) {
        this.a = wlc;
    }

    public static lls a(wlc<Scheduler> wlc) {
        return new lls(wlc);
    }

    public final /* synthetic */ Object get() {
        return new llr((Scheduler) this.a.get());
    }
}
