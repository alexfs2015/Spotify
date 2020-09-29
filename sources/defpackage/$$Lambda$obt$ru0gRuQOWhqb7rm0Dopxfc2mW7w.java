package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$obt$ru0gRuQOWhqb7rm0Dopxfc2mW7w reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$obt$ru0gRuQOWhqb7rm0Dopxfc2mW7w implements Function {
    private final /* synthetic */ obt f$0;
    private final /* synthetic */ PartnerType f$1;

    public /* synthetic */ $$Lambda$obt$ru0gRuQOWhqb7rm0Dopxfc2mW7w(obt obt, PartnerType partnerType) {
        this.f$0 = obt;
        this.f$1 = partnerType;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (AuthorizationRequest) obj);
    }
}
