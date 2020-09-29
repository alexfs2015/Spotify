package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$nvg$LEMKjvMAHfgCaAxE1g26fq15uH4 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nvg$LEMKjvMAHfgCaAxE1g26fq15uH4 implements Function {
    private final /* synthetic */ nvg f$0;
    private final /* synthetic */ PartnerType f$1;

    public /* synthetic */ $$Lambda$nvg$LEMKjvMAHfgCaAxE1g26fq15uH4(nvg nvg, PartnerType partnerType) {
        this.f$0 = nvg;
        this.f$1 = partnerType;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (AuthorizationRequest) obj);
    }
}
