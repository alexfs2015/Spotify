package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$obs$NSZqPJaoHALy8XvN9DMv35ag32g reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$obs$NSZqPJaoHALy8XvN9DMv35ag32g implements Function {
    private final /* synthetic */ PartnerType f$0;
    private final /* synthetic */ AuthorizationRequest f$1;

    public /* synthetic */ $$Lambda$obs$NSZqPJaoHALy8XvN9DMv35ag32g(PartnerType partnerType, AuthorizationRequest authorizationRequest) {
        this.f$0 = partnerType;
        this.f$1 = authorizationRequest;
    }

    public final Object apply(Object obj) {
        return obs.a(this.f$0, this.f$1, (ho) obj);
    }
}
