package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.net.HttpCookie;

/* renamed from: obs reason: default package */
public final class obs {
    private final jgy a;
    private final jhc b;

    obs(jgy jgy, jhc jhc) {
        this.a = jgy;
        this.b = jhc;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        return this.a.a(authorizationRequest, httpCookie).f(new $$Lambda$obs$e57tip3GhMF0Tkph3S3xfwY2SDQ(httpCookie));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ oby a(PartnerType partnerType, AuthorizationRequest authorizationRequest, ho hoVar) {
        jgp jgp = (jgp) fbp.a(hoVar.a);
        HttpCookie httpCookie = (HttpCookie) fbp.a(hoVar.b);
        return (oby) jgp.a((gee<a, R_>) new $$Lambda$obs$YLQGZKuddtDf7Ji7nk4ExNihn5k<a,R_>(partnerType), (gee<b, R_>) new $$Lambda$obs$p26sNlv30yC4sJI1hGlIOu9ypxs<b,R_>(partnerType), (gee<d, R_>) new $$Lambda$obs$PKKBR4B6FIGE5ecnxGVP6tYpUgs<d,R_>(partnerType), (gee<e, R_>) new $$Lambda$obs$JYbI7BHSyCT5JXB95EfbloRmLpI<e,R_>(partnerType, authorizationRequest, httpCookie), (gee<c, R_>) new $$Lambda$obs$JIyLY3eYHNmqNVUEXbJQsaQHQ4<c,R_>(partnerType, authorizationRequest, httpCookie));
    }

    public final Observable<oby> a(PartnerType partnerType, AuthorizationRequest authorizationRequest) {
        return this.b.a().d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$obs$6L8bifLW43OOLAGEpT61AG9o9c<Object,Object>(this, authorizationRequest), false).c((Function<? super T, ? extends R>) new $$Lambda$obs$NSZqPJaoHALy8XvN9DMv35ag32g<Object,Object>(partnerType, authorizationRequest));
    }
}
