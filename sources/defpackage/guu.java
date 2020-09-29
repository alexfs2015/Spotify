package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: guu reason: default package */
public final class guu implements wig<gut> {
    private final wzi<RxResolver> a;
    private final wzi<rwl> b;
    private final wzi<ktn> c;
    private final wzi<gux> d;
    private final wzi<vje> e;
    private final wzi<iqn> f;
    private final wzi<Scheduler> g;

    private guu(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<ktn> wzi3, wzi<gux> wzi4, wzi<vje> wzi5, wzi<iqn> wzi6, wzi<Scheduler> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static guu a(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<ktn> wzi3, wzi<gux> wzi4, wzi<vje> wzi5, wzi<iqn> wzi6, wzi<Scheduler> wzi7) {
        guu guu = new guu(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return guu;
    }

    public final /* synthetic */ Object get() {
        gut gut = new gut((RxResolver) this.a.get(), (rwl) this.b.get(), (ktn) this.c.get(), (gux) this.d.get(), (vje) this.e.get(), this.f, (Scheduler) this.g.get());
        return gut;
    }
}
