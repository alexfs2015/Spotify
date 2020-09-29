package defpackage;

import io.reactivex.Maybe;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: mdg reason: default package */
public final class mdg {
    private final Scheduler a;
    private final scc b;
    private final mdl c;

    public mdg(Scheduler scheduler, scc scc, mdl mdl) {
        this.a = scheduler;
        this.b = scc;
        this.c = mdl;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcs a(hcs hcs, Throwable th) {
        return hcs;
    }

    public final Single<hcs> a() {
        hcs b2 = this.c.b();
        Maybe a2 = this.b.a();
        ObjectHelper.a(b2, "defaultItem is null");
        Maybe a3 = Maybe.a(b2);
        ObjectHelper.a(a3, "other is null");
        return RxJavaPlugins.a((Maybe<T>) new MaybeSwitchIfEmpty<T>(a2, a3)).c().g(new $$Lambda$mdg$JqLQyp2Ll6x07U_lEXeXH3UPlKY(b2)).b(this.a);
    }
}
