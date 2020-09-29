package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.net.HttpCookie;

/* renamed from: nvf reason: default package */
public final class nvf {
    private final jej a;
    private final jen b;

    nvf(jej jej, jen jen) {
        this.a = jej;
        this.b = jen;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nvl a(PartnerType partnerType, AuthorizationRequest authorizationRequest, ho hoVar) {
        jea jea = (jea) fay.a(hoVar.a);
        HttpCookie httpCookie = (HttpCookie) fay.a(hoVar.b);
        return (nvl) jea.a((gct<a, R_>) new $$Lambda$nvf$zBxumy7QORXCJIgcmKNRUFoZlfg<a,R_>(partnerType), (gct<b, R_>) new $$Lambda$nvf$88lBwRf_feFtFRYTRd8rUYQeAE<b,R_>(partnerType), (gct<d, R_>) new $$Lambda$nvf$RFQQmNINYBd_iOX_rWaw01aZ5BA<d,R_>(partnerType), (gct<e, R_>) new $$Lambda$nvf$4YhmPdcaWHQSSXHcWZT02oOhLc0<e,R_>(partnerType, authorizationRequest, httpCookie), (gct<c, R_>) new $$Lambda$nvf$te2V5i4TMmDyFSFcFDE2aXqxQvo<c,R_>(partnerType, authorizationRequest, httpCookie));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        return this.a.a(authorizationRequest, httpCookie).f(new $$Lambda$nvf$hJZbnajP5evzi1En2xKM4ljv28g(httpCookie));
    }

    public final Observable<nvl> a(PartnerType partnerType, AuthorizationRequest authorizationRequest) {
        return this.b.a().d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$nvf$F5LLLzVNBzLBsZwrM8NH6dt6q_s<Object,Object>(this, authorizationRequest), false).c((Function<? super T, ? extends R>) new $$Lambda$nvf$6I9BgM9g9oyEVcGk7vRroKGXks<Object,Object>(partnerType, authorizationRequest));
    }
}
