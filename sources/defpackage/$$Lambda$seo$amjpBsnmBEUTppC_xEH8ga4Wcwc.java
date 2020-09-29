package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$seo$amjpBsnmBEUTppC_xEH8ga4Wcwc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$seo$amjpBsnmBEUTppC_xEH8ga4Wcwc implements Function {
    private final /* synthetic */ sgh f$0;

    public /* synthetic */ $$Lambda$seo$amjpBsnmBEUTppC_xEH8ga4Wcwc(sgh sgh) {
        this.f$0 = sgh;
    }

    public final Object apply(Object obj) {
        return Logger.d((Throwable) obj, "Search online request failed for query = %s", this.f$0.b());
    }
}
