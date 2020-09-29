package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;

/* renamed from: kar reason: default package */
public final class kar implements wig<kbv> {
    private final wzi<Context> a;
    private final wzi<gfk<fli>> b;
    private final wzi<kbs> c;
    private final wzi<gcb> d;
    private final wzi<Scheduler> e;
    private final wzi<kbx> f;
    private final wzi<kae> g;

    private kar(wzi<Context> wzi, wzi<gfk<fli>> wzi2, wzi<kbs> wzi3, wzi<gcb> wzi4, wzi<Scheduler> wzi5, wzi<kbx> wzi6, wzi<kae> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static kar a(wzi<Context> wzi, wzi<gfk<fli>> wzi2, wzi<kbs> wzi3, wzi<gcb> wzi4, wzi<Scheduler> wzi5, wzi<kbx> wzi6, wzi<kae> wzi7) {
        kar kar = new kar(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return kar;
    }

    public final /* synthetic */ Object get() {
        kbv kbv = new kbv((Context) this.a.get(), (gfk) this.b.get(), (kbs) this.c.get(), (gcb) this.d.get(), (Scheduler) this.e.get(), (kbx) this.f.get(), (kae) this.g.get());
        return (kbv) wil.a(kbv, "Cannot return null from a non-@Nullable @Provides method");
    }
}
