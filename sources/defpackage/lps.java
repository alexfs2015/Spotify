package defpackage;

import io.reactivex.Scheduler;

/* renamed from: lps reason: default package */
public final class lps implements wig<lpr> {
    private final wzi<Scheduler> a;

    private lps(wzi<Scheduler> wzi) {
        this.a = wzi;
    }

    public static lps a(wzi<Scheduler> wzi) {
        return new lps(wzi);
    }

    public final /* synthetic */ Object get() {
        return new lpr((Scheduler) this.a.get());
    }
}
