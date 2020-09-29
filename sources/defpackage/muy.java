package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: muy reason: default package */
public final class muy implements msr {
    private final boolean a;
    private final kxz b;
    private final wlc<rfe> c;
    private final vti<muw> d;
    private final vti<msu> e;

    public muy(boolean z, kxz kxz, wlc<rfe> wlc, vti<muw> vti, vti<msu> vti2) {
        this.a = z;
        this.b = kxz;
        this.c = (wlc) fay.a(wlc);
        this.d = (vti) fay.a(vti);
        this.e = (vti) fay.a(vti2);
    }

    public final wud<gzz> a(String str) {
        if (this.a) {
            return vun.a((wrf<T>) ((rfe) this.c.get()).a());
        }
        return vun.a((ObservableSource<T>) this.b.a, BackpressureStrategy.BUFFER).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$muy$GtldLjYN8gq2DpG6OpJIXk1m2Tw<Object,Object>(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(String str, kxx kxx) {
        if (kxx instanceof b) {
            return ((muw) this.d.get()).a(str);
        }
        return ((msu) this.e.get()).a(str);
    }
}
