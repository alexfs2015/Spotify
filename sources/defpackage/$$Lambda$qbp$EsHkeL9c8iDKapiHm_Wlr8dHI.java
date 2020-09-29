package defpackage;

import com.google.common.base.Function;

/* renamed from: -$$Lambda$qbp$E-sHk-eL9c8iDKapiHm_Wlr8dHI reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qbp$EsHkeL9c8iDKapiHm_Wlr8dHI implements Function {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$qbp$EsHkeL9c8iDKapiHm_Wlr8dHI(String str) {
        this.f$0 = str;
    }

    public final Object apply(Object obj) {
        return String.format("spotify:search:%s:%s", new Object[]{(String) obj, this.f$0});
    }
}
