package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;

/* renamed from: lxz reason: default package */
public final class lxz implements wig<lxy> {
    private final wzi<Context> a;
    private final wzi<lyh> b;
    private final wzi<jty> c;
    private final wzi<Scheduler> d;
    private final wzi<Scheduler> e;

    private lxz(wzi<Context> wzi, wzi<lyh> wzi2, wzi<jty> wzi3, wzi<Scheduler> wzi4, wzi<Scheduler> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static lxz a(wzi<Context> wzi, wzi<lyh> wzi2, wzi<jty> wzi3, wzi<Scheduler> wzi4, wzi<Scheduler> wzi5) {
        lxz lxz = new lxz(wzi, wzi2, wzi3, wzi4, wzi5);
        return lxz;
    }

    public final /* synthetic */ Object get() {
        lxy lxy = new lxy((Context) this.a.get(), (lyh) this.b.get(), (jty) this.c.get());
        lxy.a = (Scheduler) this.d.get();
        lxy.b = (Scheduler) this.e.get();
        return lxy;
    }
}
