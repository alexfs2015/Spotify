package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$obt$znrbqszzbk-d3vrfi1O9wb59vx0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$obt$znrbqszzbkd3vrfi1O9wb59vx0 implements Function {
    private final /* synthetic */ obt f$0;
    private final /* synthetic */ PartnerType f$1;

    public /* synthetic */ $$Lambda$obt$znrbqszzbkd3vrfi1O9wb59vx0(obt obt, PartnerType partnerType) {
        this.f$0 = obt;
        this.f$1 = partnerType;
    }

    public final Object apply(Object obj) {
        return this.f$0.b(this.f$1, (ImmutableMap) obj);
    }
}
