package defpackage;

import com.google.common.base.Optional;
import com.spotify.searchview.proto.DrillDownViewResponse;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$sfo$PBSo2gyXR-AK2eAZShWhYCSPmxc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$sfo$PBSo2gyXRAK2eAZShWhYCSPmxc implements Function {
    private final /* synthetic */ sgh f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ Optional f$2;

    public /* synthetic */ $$Lambda$sfo$PBSo2gyXRAK2eAZShWhYCSPmxc(sgh sgh, String str, Optional optional) {
        this.f$0 = sgh;
        this.f$1 = str;
        this.f$2 = optional;
    }

    public final Object apply(Object obj) {
        return sfo.a(this.f$0, this.f$1, this.f$2, (DrillDownViewResponse) obj);
    }
}
