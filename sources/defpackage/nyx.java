package defpackage;

import com.google.common.collect.ImmutableMap;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: nyx reason: default package */
public final class nyx {
    private final nyt a;
    private final nza b;
    private final hhv<hcs> c;

    nyx(nyt nyt, nza nza, hhv<hcs> hhv) {
        this.a = (nyt) fbp.a(nyt);
        this.b = (nza) fbp.a(nza);
        this.c = (hhv) fbp.a(hhv);
    }

    public final Observable<hcs> a() {
        nyt nyt = this.a;
        return nyt.d.a(ImmutableMap.a("client-platform", "android", "client-locale", nyt.c, "client-timezone", nyt.a.e().getID(), "client-version", nyt.b.a(), "tablet-layout", String.valueOf(nyt.e))).d().a(hcs.class).c((Function<? super T, ? extends R>) $$Lambda$zANEfITdGB6C9_dHSKcBNTkHeyk.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$xRYKoO2MsSEZ3o45egN7ljgxuPI.INSTANCE).c((Function<? super T, ? extends R>) this.b).a(wit.a((c<T, R>) this.c, BackpressureStrategy.BUFFER));
    }
}
