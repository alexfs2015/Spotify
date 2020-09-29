package defpackage;

import com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: snn reason: default package */
public final class snn {
    private final spu a;
    private final soe b;
    private final Scheduler c;
    private final snp d;
    private final boolean e;
    private final int f;

    public snn(spu spu, soe soe, Scheduler scheduler, boolean z, snp snp, int i) {
        this.a = spu;
        this.b = soe;
        this.c = scheduler;
        this.e = z;
        this.d = snp;
        this.f = i;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(sqo sqo, Throwable th) {
        return Single.b(new QueryAutocompleteResult("", Collections.singletonList(sqo.a.a.b()))).f(new $$Lambda$snn$61idvT6pQJd8Xy1I9Ij4HaF7eA(sqo)).f(this.d).f(new $$Lambda$snn$q68ax7KdqAgrgAYzAckjrZQYM0(sqo));
    }

    public final Single<sqn<hcs>> a(sqo sqo) {
        if (sqo.c()) {
            return Single.b(sqn.c());
        }
        return (!((sqo.a.e.b() instanceof g) || (sqo.a.e.b() instanceof a)) || !this.e) ? this.a.a(sqo) : this.b.a(sqo).a((long) this.f, TimeUnit.MILLISECONDS, this.c).h(new $$Lambda$snn$_ZmvrLUljbmx0gbkWhippEBE(this, sqo));
    }
}
