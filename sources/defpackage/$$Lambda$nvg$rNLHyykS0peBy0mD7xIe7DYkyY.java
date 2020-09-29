package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$nvg$rNLHyykS0peBy0mD7xIe7-DYkyY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nvg$rNLHyykS0peBy0mD7xIe7DYkyY implements Function {
    private final /* synthetic */ nvg f$0;
    private final /* synthetic */ PartnerType f$1;

    public /* synthetic */ $$Lambda$nvg$rNLHyykS0peBy0mD7xIe7DYkyY(nvg nvg, PartnerType partnerType) {
        this.f$0 = nvg;
        this.f$1 = partnerType;
    }

    public final Object apply(Object obj) {
        return this.f$0.b(this.f$1, (ImmutableMap) obj);
    }
}
