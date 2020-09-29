package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: mcv reason: default package */
public final class mcv implements FlowableTransformer<hcs, String> {
    private final String a;

    public mcv(String str) {
        this.a = (String) fbp.a(str);
    }

    /* access modifiers changed from: private */
    public Optional<String> a(hcs hcs) {
        if (hcs.body().isEmpty()) {
            return (mdl.a(hcs, "browse-error-empty-view") || mdl.a(hcs)) ? Optional.b(this.a) : Optional.e();
        }
        String[] stringArray = ((hcs) fbp.a(hcs)).custom().stringArray("pageIdentifier");
        return (stringArray == null || stringArray.length <= 0) ? Optional.b(this.a) : Optional.b(stringArray[0]);
    }

    public final /* synthetic */ xfk apply(Flowable flowable) {
        return flowable.c((Function<? super T, ? extends R>) new $$Lambda$mcv$zLy1ZYEYLRCZAqIUrDbqIJeA2hs<Object,Object>(this)).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$0BytUNHz5__EpEj3ciOqr9HNVAg.INSTANCE);
    }
}
