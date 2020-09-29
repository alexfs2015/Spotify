package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: uoq reason: default package */
public final class uoq implements wig<uop> {
    private final wzi<upa> a;
    private final wzi<upb> b;
    private final wzi<RxResolver> c;
    private final wzi<hxx> d;
    private final wzi<Scheduler> e;
    private final wzi<Scheduler> f;
    private final wzi<rwl> g;

    private uoq(wzi<upa> wzi, wzi<upb> wzi2, wzi<RxResolver> wzi3, wzi<hxx> wzi4, wzi<Scheduler> wzi5, wzi<Scheduler> wzi6, wzi<rwl> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static uoq a(wzi<upa> wzi, wzi<upb> wzi2, wzi<RxResolver> wzi3, wzi<hxx> wzi4, wzi<Scheduler> wzi5, wzi<Scheduler> wzi6, wzi<rwl> wzi7) {
        uoq uoq = new uoq(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return uoq;
    }

    public final /* synthetic */ Object get() {
        uop uop = new uop((upa) this.a.get(), (upb) this.b.get(), (RxResolver) this.c.get(), (hxx) this.d.get(), (Scheduler) this.e.get(), (Scheduler) this.f.get(), (rwl) this.g.get());
        return uop;
    }
}
