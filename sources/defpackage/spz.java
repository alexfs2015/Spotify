package defpackage;

import io.reactivex.Single;
import io.reactivex.functions.Function;

/* renamed from: spz reason: default package */
public final class spz implements spu {
    private final slm a;
    private final Function<sjh, hcs> b;

    public spz(slm slm, Function<sjh, hcs> function) {
        this.a = slm;
        this.b = function;
    }

    public final Single<sqn<hcs>> a(sqo sqo) {
        return sqo.c() ? Single.b(sqn.c()) : this.a.c(sqo.b(), sqo.a()).f(new $$Lambda$spz$rjLXOb3CeSlIT42aZ7Y1ILQfFM(sqo)).f(this.b).f(new $$Lambda$spz$PpEPtjjY4oZs9z4rpxMEzBZKvS0(sqo));
    }
}
