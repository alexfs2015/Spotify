package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: muw reason: default package */
public final class muw {
    private final mun a;
    private final wlc<ioa> b;

    public muw(mun mun, wlc<ioa> wlc) {
        this.a = mun;
        this.b = wlc;
    }

    public final wud<gzz> a(String str) {
        wud a2 = vun.a((ObservableSource<T>) ((ioa) this.b.get()).a(str).a(), BackpressureStrategy.BUFFER);
        mun mun = this.a;
        mun.getClass();
        return a2.f(new $$Lambda$qLsMKZU5E7iIBFt5DVGdIVZmi_k(mun));
    }
}
