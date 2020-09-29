package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;

/* renamed from: god reason: default package */
public final class god implements wig<goc> {
    private final wzi<Context> a;
    private final wzi<String> b;
    private final wzi<jty> c;
    private final wzi<Scheduler> d;
    private final wzi<gix> e;
    private final wzi<Boolean> f;

    private god(wzi<Context> wzi, wzi<String> wzi2, wzi<jty> wzi3, wzi<Scheduler> wzi4, wzi<gix> wzi5, wzi<Boolean> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static god a(wzi<Context> wzi, wzi<String> wzi2, wzi<jty> wzi3, wzi<Scheduler> wzi4, wzi<gix> wzi5, wzi<Boolean> wzi6) {
        god god = new god(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return god;
    }

    public final /* synthetic */ Object get() {
        goc goc = new goc((Context) this.a.get(), (String) this.b.get(), (jty) this.c.get(), (Scheduler) this.d.get(), (gix) this.e.get(), ((Boolean) this.f.get()).booleanValue());
        return goc;
    }
}
