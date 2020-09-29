package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Single;

/* renamed from: spx reason: default package */
public final class spx implements spu {
    private final slm a;

    public spx(slm slm) {
        this.a = slm;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcs a(sqo sqo, hcs hcs) {
        Optional<Integer> optional;
        boolean z = sqo instanceof sqs;
        if (!z) {
            return hcs;
        }
        if (z) {
            optional = ((sqs) sqo).d;
        } else {
            StringBuilder sb = new StringBuilder("Request is not a drilldown request to parse the next offset: ");
            sb.append(sqo);
            Assertion.b(sb.toString());
            optional = Optional.e();
        }
        a builder = hcs.custom().toBuilder();
        if (optional.b()) {
            builder = builder.a("lastOffset", ((Integer) optional.c()).intValue());
        }
        if (!fbo.a(hcs.custom().string("loadMoreUrl"))) {
            builder = builder.a("isLastPage", false);
        }
        return hcs.toBuilder().a(builder.a()).a();
    }

    public final Single<sqn<hcs>> a(sqo sqo) {
        return sqo.c() ? Single.b(sqn.c()) : sqo.a(this.a).f(new $$Lambda$spx$1URWRCSKrRU6WnEkC34150GW8Zs(sqo)).f(new $$Lambda$spx$bSOyWWGM9m0_6aiIpYaH9Dj3jrg(sqo));
    }
}
