package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: lyu reason: default package */
public final class lyu implements FlowableTransformer<gzz, String> {
    private final String a;

    public lyu(String str) {
        this.a = (String) fay.a(str);
    }

    /* access modifiers changed from: private */
    public Optional<String> a(gzz gzz) {
        if (!gzz.body().isEmpty()) {
            String[] stringArray = ((gzz) fay.a(gzz)).custom().stringArray("pageIdentifier");
            if (stringArray == null || stringArray.length <= 0) {
                return Optional.b(this.a);
            }
            return Optional.b(stringArray[0]);
        } else if (lzk.a(gzz, "browse-error-empty-view") || lzk.a(gzz)) {
            return Optional.b(this.a);
        } else {
            return Optional.e();
        }
    }

    public final /* synthetic */ wrf apply(Flowable flowable) {
        return flowable.c((Function<? super T, ? extends R>) new $$Lambda$lyu$tYbEeCF6f0Cg_QZ1V5oeZMryJw8<Object,Object>(this)).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$0BytUNHz5__EpEj3ciOqr9HNVAg.INSTANCE);
    }
}
