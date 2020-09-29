package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableTransformer;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: mwt reason: default package */
public final class mwt {
    public final mwr a;
    private final wud<gzz> b;
    private final mwn c;
    private final String d;
    private final rey e;
    private final myj f;
    private final skh g;
    private final myl h;
    private final ljy i;

    public mwt(ljy ljy, mwr mwr, mwn mwn, mwp mwp, String str, rey rey, myj myj, skh skh, myl myl) {
        this.i = ljy;
        this.d = str;
        this.f = myj;
        this.g = skh;
        this.h = myl;
        this.b = mwp.a(str);
        this.a = mwr;
        this.c = mwn;
        this.e = rey;
    }

    /* access modifiers changed from: private */
    public wud<gzz> a(wud<gzz> wud) {
        return (!jtc.c(this.i.a) || !jtc.b(this.i.a)) ? wud : wud.a((c<? super T, ? extends R>) this.f);
    }

    public final wud<ho<gzz, rfo>> a(gzz gzz) {
        wud wud;
        if (gzz != null) {
            wud = ScalarSynchronousObservable.d(gzz);
        } else {
            wud = this.b;
        }
        wud a2 = wud.a((c<? super T, ? extends R>) this.e).a(vun.a((ObservableTransformer<T, R>) this.h, BackpressureStrategy.BUFFER)).a((c<? super T, ? extends R>) this.g).a((c<? super T, ? extends R>) new $$Lambda$mwt$n35dcl4L8IuPpPpFONmZvaJRwhg<Object,Object>(this));
        mwn mwn = this.c;
        return a2.a((c<? super T, ? extends R>) new mwm<Object,Object>((String) mwn.a(this.d, 1), (ims) mwn.a(mwn.a.get(), 2), (mwr) mwn.a(mwn.b.get(), 3)));
    }
}
