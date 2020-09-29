package defpackage;

import io.reactivex.Maybe;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: lzf reason: default package */
public final class lzf {
    private final Scheduler a;
    private final rsv b;
    private final lzk c;

    /* access modifiers changed from: private */
    public static /* synthetic */ gzz a(gzz gzz, Throwable th) {
        return gzz;
    }

    public lzf(Scheduler scheduler, rsv rsv, lzk lzk) {
        this.a = scheduler;
        this.b = rsv;
        this.c = lzk;
    }

    public final Single<gzz> a() {
        gzz b2 = this.c.b();
        Maybe a2 = this.b.a();
        ObjectHelper.a(b2, "defaultItem is null");
        Maybe a3 = Maybe.a(b2);
        ObjectHelper.a(a3, "other is null");
        return RxJavaPlugins.a((Maybe<T>) new MaybeSwitchIfEmpty<T>(a2, a3)).c().g(new $$Lambda$lzf$zSZj64uubYZdOOPshrhDaeGyN6Y(b2)).b(this.a);
    }
}
