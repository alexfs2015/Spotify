package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ihm$gXmJ8ml75dg5g7DchBH77V1V0sE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ihm$gXmJ8ml75dg5g7DchBH77V1V0sE implements Function {
    private final /* synthetic */ Flowable f$0;

    public /* synthetic */ $$Lambda$ihm$gXmJ8ml75dg5g7DchBH77V1V0sE(Flowable flowable) {
        this.f$0 = flowable;
    }

    public final Object apply(Object obj) {
        return this.f$0.c((Function<? super T, ? extends R>) new $$Lambda$ihm$4zX07w1ywuOdguhpE8qIHboEoA4<Object,Object>((Ad) obj));
    }
}
