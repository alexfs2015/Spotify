package defpackage;

import io.reactivex.Scheduler;

/* renamed from: ryj reason: default package */
public final class ryj implements wig<ryi> {
    private final wzi<hgy> a;
    private final wzi<Scheduler> b;

    private ryj(wzi<hgy> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ryj a(wzi<hgy> wzi, wzi<Scheduler> wzi2) {
        return new ryj(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ryi((hgy) this.a.get(), (Scheduler) this.b.get());
    }
}
