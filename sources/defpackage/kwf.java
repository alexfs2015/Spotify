package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.net.HttpCookie;

/* renamed from: kwf reason: default package */
public final class kwf {
    private final jgy a;
    private final jhc b;

    public kwf(jgy jgy, jhc jhc) {
        this.a = jgy;
        this.b = jhc;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        return this.a.a(authorizationRequest, httpCookie).f(new $$Lambda$kwf$kypNQSG5AsIcuO8jIT4ObjLUPxg(httpCookie));
    }

    public final Observable<ho<jgp, HttpCookie>> a(AuthorizationRequest authorizationRequest) {
        return this.b.a().d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$kwf$D9mNgjDd1q5bLFgX8vh2I9dqWGw<Object,Object>(this, authorizationRequest), false);
    }
}
