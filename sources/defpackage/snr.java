package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: snr reason: default package */
public final class snr {
    /* access modifiers changed from: private */
    public static Optional<String> a(hcs hcs) {
        if (hcs.body().isEmpty() && !six.a(hcs, "search-error-empty-view") && !six.a(hcs, "search-offline-view") && !six.a(hcs, "search-no-results-empty-view")) {
            return Optional.e();
        }
        return Optional.b(six.a(hcs, "pageIdentifier", PageIdentifiers.SEARCH.mPageIdentifier));
    }

    public static Flowable<String> a(Flowable<hcs> flowable) {
        return ((Flowable) fbp.a(flowable)).c((Function<? super T, ? extends R>) $$Lambda$snr$QhVooNyLcwCdliYCxfFook07A.INSTANCE).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$0BytUNHz5__EpEj3ciOqr9HNVAg.INSTANCE).a(Functions.a());
    }
}
