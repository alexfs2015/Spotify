package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: pgc reason: default package */
public final class pgc {
    public static kjm<pfy> a(sia sia) {
        return kla.a(b(sia));
    }

    private static Observable<pfy> b(sia sia) {
        return sia.a().c((Function<? super T, ? extends R>) $$Lambda$pgc$BIhnuFEuqmh9t0a3YOWOehQiOVw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pfy a(Boolean bool) {
        if (bool.booleanValue()) {
            return pfy.a(SessionState.PRODUCT_TYPE_FREE);
        }
        return pfy.a("premium");
    }
}
