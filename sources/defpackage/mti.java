package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableTransformer;

/* renamed from: mti reason: default package */
public final class mti implements vua<heq<gzz>> {
    private final wlc<ljy> a;
    private final wlc<Boolean> b;
    private final wlc<Boolean> c;
    private final wlc<rfd> d;
    private final wlc<mvc> e;
    private final wlc<rey> f;
    private final wlc<muj> g;
    private final wlc<mup> h;
    private final wlc<muf> i;

    private mti(wlc<ljy> wlc, wlc<Boolean> wlc2, wlc<Boolean> wlc3, wlc<rfd> wlc4, wlc<mvc> wlc5, wlc<rey> wlc6, wlc<muj> wlc7, wlc<mup> wlc8, wlc<muf> wlc9) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
    }

    public static mti a(wlc<ljy> wlc, wlc<Boolean> wlc2, wlc<Boolean> wlc3, wlc<rfd> wlc4, wlc<mvc> wlc5, wlc<rey> wlc6, wlc<muj> wlc7, wlc<mup> wlc8, wlc<muf> wlc9) {
        mti mti = new mti(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return mti;
    }

    public final /* synthetic */ Object get() {
        ljy ljy = (ljy) this.a.get();
        boolean booleanValue = ((Boolean) this.b.get()).booleanValue();
        boolean booleanValue2 = ((Boolean) this.c.get()).booleanValue();
        vti b2 = vtz.b(this.d);
        vti b3 = vtz.b(this.e);
        vti b4 = vtz.b(this.f);
        vti b5 = vtz.b(this.g);
        vti b6 = vtz.b(this.h);
        vti b7 = vtz.b(this.i);
        a aVar = new a();
        if (booleanValue2) {
            aVar.a((c) b4.get());
            aVar.a(vun.a((ObservableTransformer) b7.get(), BackpressureStrategy.BUFFER));
        } else {
            aVar.a((c) b2.get());
        }
        if (booleanValue) {
            aVar.a((c) b3.get());
            aVar.a((c) b5.get());
        }
        if (jtc.c(ljy.a) && jtc.b(ljy.a)) {
            aVar.a((c) b6.get());
        }
        return (heq) vuf.a(heq.a(aVar.a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
