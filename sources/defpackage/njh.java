package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: njh reason: default package */
public final class njh {
    private final kxz a;
    private final njj b;
    private final nja c;
    private final heq<gzz> d;
    private final njd e;

    public njh(kxz kxz, njj njj, nja nja, heq<gzz> heq, njd njd) {
        this.a = kxz;
        this.b = njj;
        this.c = nja;
        this.d = heq;
        this.e = njd;
    }

    /* access modifiers changed from: private */
    public wud<gzz> a(kxx kxx) {
        return (wud) kxx.a((gct<c, R_>) new $$Lambda$njh$lN50LICAA2rovC3ICy_yXal7Jfg<c,R_>(this), (gct<b, R_>) new $$Lambda$njh$2L6fEcpTDvE1iSC_cwnVz6_B5Y4<b,R_>(this), (gct<a, R_>) new $$Lambda$njh$Z8dze9X9jhiV5p4S8fjOH6qiJnU<a,R_>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(c cVar) {
        return this.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(b bVar) {
        return vun.a((ObservableSource<T>) this.b.a(), BackpressureStrategy.LATEST);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(a aVar) {
        return this.c.a();
    }

    public final wud<njo> a(gzz gzz) {
        return vun.a((ObservableSource<T>) this.a.a, BackpressureStrategy.BUFFER).i(new $$Lambda$njh$syUDZsQSmX58hjLDRYhWGtIp9A(this)).a((c<? super T, ? extends R>) this.d).a((b<? extends R, ? super T>) new wwg<Object,Object>(new a().a((gzz) hai.EMPTY).a(false).b(false).a(gzz).a(), (wuu<R, ? super T, R>) this.e));
    }
}
