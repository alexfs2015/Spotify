package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: oip reason: default package */
public final class oip implements wig<gnu<ohl>> {
    private final wzi<ojo> a;
    private final wzi<a> b;
    private final wzi<gls> c;
    private final wzi<Scheduler> d;
    private final wzi<Scheduler> e;
    private final wzi<b> f;
    private final wzi<a<ohl>> g;

    private oip(wzi<ojo> wzi, wzi<a> wzi2, wzi<gls> wzi3, wzi<Scheduler> wzi4, wzi<Scheduler> wzi5, wzi<b> wzi6, wzi<a<ohl>> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static oip a(wzi<ojo> wzi, wzi<a> wzi2, wzi<gls> wzi3, wzi<Scheduler> wzi4, wzi<Scheduler> wzi5, wzi<b> wzi6, wzi<a<ohl>> wzi7) {
        oip oip = new oip(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return oip;
    }

    public final /* synthetic */ Object get() {
        ojo ojo = (ojo) this.a.get();
        sem sem = new sem(ojo.o(), ojo, (a) this.b.get(), (gls) this.c.get(), (Scheduler) this.d.get(), (Scheduler) this.e.get(), (b) this.f.get(), (a) this.g.get());
        return (gnu) wil.a(sem, "Cannot return null from a non-@Nullable @Provides method");
    }
}
