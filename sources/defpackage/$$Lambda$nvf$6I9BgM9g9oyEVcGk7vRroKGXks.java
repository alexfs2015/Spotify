package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$nvf$6I9BgM9g9-oyEVcGk7vRroKGXks reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nvf$6I9BgM9g9oyEVcGk7vRroKGXks implements Function {
    private final /* synthetic */ PartnerType f$0;
    private final /* synthetic */ AuthorizationRequest f$1;

    public /* synthetic */ $$Lambda$nvf$6I9BgM9g9oyEVcGk7vRroKGXks(PartnerType partnerType, AuthorizationRequest authorizationRequest) {
        this.f$0 = partnerType;
        this.f$1 = authorizationRequest;
    }

    public final Object apply(Object obj) {
        return nvf.a(this.f$0, this.f$1, (ho) obj);
    }
}
