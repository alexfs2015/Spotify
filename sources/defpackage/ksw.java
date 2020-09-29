package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.net.HttpCookie;

/* renamed from: ksw reason: default package */
public final class ksw {
    private final jej a;
    private final jen b;

    public ksw(jej jej, jen jen) {
        this.a = jej;
        this.b = jen;
    }

    public final Observable<ho<jea, HttpCookie>> a(AuthorizationRequest authorizationRequest) {
        return this.b.a().d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$ksw$qpDQ12puwEOpYb4b_rVvHUlS9ok<Object,Object>(this, authorizationRequest), false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        return this.a.a(authorizationRequest, httpCookie).f(new $$Lambda$ksw$tg3zdqGwSHW1iUi5jeA2echABQ(httpCookie));
    }
}
