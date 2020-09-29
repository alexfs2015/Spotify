package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: npd reason: default package */
public final class npd {
    private final lbi a;
    private final npf b;
    private final now c;
    private final hhm<hcs> d;
    private final noz e;

    public npd(lbi lbi, npf npf, now now, hhm<hcs> hhm, noz noz) {
        this.a = lbi;
        this.b = npf;
        this.c = now;
        this.d = hhm;
        this.e = noz;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(a aVar) {
        return this.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(b bVar) {
        return wit.a((ObservableSource<T>) this.b.a(), BackpressureStrategy.LATEST);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(c cVar) {
        return this.c.a();
    }

    /* access modifiers changed from: private */
    public xii<hcs> a(lbg lbg) {
        return (xii) lbg.a((gee<c, R_>) new $$Lambda$npd$8pUy7YkIYdgVzoMvSimUntXchP4<c,R_>(this), (gee<b, R_>) new $$Lambda$npd$Uf4LBjaUL9YD9kJ6R7sn2zYS9JM<b,R_>(this), (gee<a, R_>) new $$Lambda$npd$jrZA64L0D1nUB19l09sNkxNJWuU<a,R_>(this));
    }

    public final xii<npk> a(hcs hcs) {
        return wit.a((ObservableSource<T>) this.a.a, BackpressureStrategy.BUFFER).h(new $$Lambda$npd$Y4sOmbPwwE73uDLwQrTW_lQHpaE(this)).a((c<? super T, ? extends R>) this.d).a((b<? extends R, ? super T>) new xkl<Object,Object>(new a().a((hcs) hdb.EMPTY).a(false).b(false).a(hcs).a(), (xiz<R, ? super T, R>) this.e));
    }
}
