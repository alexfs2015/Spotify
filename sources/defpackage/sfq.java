package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Single;

/* renamed from: sfq reason: default package */
public final class sfq implements sfn {
    private final sbf a;

    public sfq(sbf sbf) {
        this.a = sbf;
    }

    public final Single<sgg<gzz>> a(sgh sgh) {
        if (sgh.c()) {
            return Single.b(sgg.c());
        }
        return sgh.a(this.a).f(new $$Lambda$sfq$Fo8sYI_aHhKs3mcFOpSaZRqFYlk(sgh)).f(new $$Lambda$sfq$hKYr6uNTVYSEF8oA2susE_MQ(sgh));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzz a(sgh sgh, gzz gzz) {
        Optional<Integer> optional;
        boolean z = sgh instanceof sgl;
        if (!z) {
            return gzz;
        }
        if (z) {
            optional = ((sgl) sgh).d;
        } else {
            StringBuilder sb = new StringBuilder("Request is not a drilldown request to parse the next offset: ");
            sb.append(sgh);
            Assertion.b(sb.toString());
            optional = Optional.e();
        }
        a builder = gzz.custom().toBuilder();
        if (optional.b()) {
            builder = builder.a("lastOffset", ((Integer) optional.c()).intValue());
        }
        if (!fax.a(gzz.custom().string("loadMoreUrl"))) {
            builder = builder.a("isLastPage", false);
        }
        return gzz.toBuilder().a(builder.a()).a();
    }
}
