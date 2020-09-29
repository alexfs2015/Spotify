package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;

/* renamed from: mjj reason: default package */
public final class mjj implements wig<mji> {
    private final wzi<Context> a;
    private final wzi<ryd> b;
    private final wzi<Scheduler> c;

    private mjj(wzi<Context> wzi, wzi<ryd> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mjj a(wzi<Context> wzi, wzi<ryd> wzi2, wzi<Scheduler> wzi3) {
        return new mjj(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mji((Context) this.a.get(), (ryd) this.b.get(), (Scheduler) this.c.get());
    }
}
