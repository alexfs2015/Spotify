package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: sdk reason: default package */
public final class sdk {
    public static Flowable<String> a(Flowable<gzz> flowable) {
        return ((Flowable) fay.a(flowable)).c((Function<? super T, ? extends R>) $$Lambda$sdk$8HnbpXrQdVffkF7XTrOkGmhtJiQ.INSTANCE).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$0BytUNHz5__EpEj3ciOqr9HNVAg.INSTANCE).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public static Optional<String> a(gzz gzz) {
        if (gzz.body().isEmpty() && !rzj.a(gzz, "search-error-empty-view") && !rzj.a(gzz, "search-offline-view") && !rzj.a(gzz, "search-no-results-empty-view")) {
            return Optional.e();
        }
        return Optional.b(rzj.a(gzz, "pageIdentifier", PageIdentifiers.SEARCH.mPageIdentifier));
    }
}
