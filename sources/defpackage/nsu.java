package defpackage;

import com.google.common.collect.ImmutableMap;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: nsu reason: default package */
public final class nsu {
    private final nsq a;
    private final nsx b;
    private final hez<gzz> c;

    nsu(nsq nsq, nsx nsx, hez<gzz> hez) {
        this.a = (nsq) fay.a(nsq);
        this.b = (nsx) fay.a(nsx);
        this.c = (hez) fay.a(hez);
    }

    public final Observable<gzz> a() {
        nsq nsq = this.a;
        return nsq.d.a(ImmutableMap.a("client-platform", "android", "client-locale", nsq.c, "client-timezone", nsq.a.e().getID(), "client-version", nsq.b.a(), "tablet-layout", String.valueOf(nsq.e))).d().a(gzz.class).c((Function<? super T, ? extends R>) $$Lambda$LX3f08ltQlKFRc8Z9S1GyxsGA4.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$ze4dUtBxLW1iv6Hv_FBSyoOEm6w.INSTANCE).c((Function<? super T, ? extends R>) this.b).a(vun.a((c<T, R>) this.c, BackpressureStrategy.BUFFER));
    }
}
