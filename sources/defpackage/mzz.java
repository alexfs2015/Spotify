package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: mzz reason: default package */
public final class mzz implements mxs {
    private final boolean a;
    private final lbi b;
    private final wzi<rog> c;
    private final who<mzx> d;
    private final who<mxv> e;

    public mzz(boolean z, lbi lbi, wzi<rog> wzi, who<mzx> who, who<mxv> who2) {
        this.a = z;
        this.b = lbi;
        this.c = (wzi) fbp.a(wzi);
        this.d = (who) fbp.a(who);
        this.e = (who) fbp.a(who2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(String str, lbg lbg) {
        return lbg instanceof b ? ((mzx) this.d.get()).a(str) : ((mxv) this.e.get()).a(str);
    }

    public final xii<hcs> a(String str) {
        return this.a ? wit.a((xfk<T>) ((rog) this.c.get()).a()) : wit.a((ObservableSource<T>) this.b.a, BackpressureStrategy.BUFFER).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$mzz$uxoZt1jXuHGPfr7fHrhDlku330k<Object,Object>(this, str));
    }
}
