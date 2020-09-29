package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pgb$5plvxoeiI-Qna506KOCuypoqGAQ reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$pgb$5plvxoeiIQna506KOCuypoqGAQ implements Function {
    private final /* synthetic */ Single f$0;
    private final /* synthetic */ ObjectMapper f$1;

    public /* synthetic */ $$Lambda$pgb$5plvxoeiIQna506KOCuypoqGAQ(Single single, ObjectMapper objectMapper) {
        this.f$0 = single;
        this.f$1 = objectMapper;
    }

    public final Object apply(Object obj) {
        return this.f$0.f(new $$Lambda$pgb$3BGQ3x0E1HCwHDQaIU15UF57o(this.f$1)).f($$Lambda$pgb$BSDLuNpXXsZCC12f9aREdgZffQ.INSTANCE).g($$Lambda$pgb$usL_Bmx55mwoWGE0hsEmC34izM.INSTANCE);
    }
}
