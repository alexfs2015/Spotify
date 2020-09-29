package defpackage;

import com.google.common.collect.ImmutableList;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: mcl reason: default package */
public final class mcl implements FlowableTransformer<mcc, hcs> {
    private final String a;
    private final boolean b;
    private final mad c;
    private final boolean d;

    public mcl(String str, boolean z, mad mad, boolean z2) {
        this.a = (String) fbp.a(str);
        this.b = z;
        this.c = mad;
        this.d = z2;
    }

    /* access modifiers changed from: private */
    public hcs a(mcc mcc) {
        hcs a2 = mcc.a();
        if (!this.b) {
            return a2;
        }
        a builder = a2.toBuilder();
        lbg b2 = mcc.b();
        mcn c2 = mcc.c();
        boolean z = b2 instanceof b;
        return builder.a(lzf.a(this.a).a((List<? extends hcm>) ImmutableList.a(mab.a(this.c.a(!z, c2.c(), c2.b()), this.c.b(!z, c2.c(), c2.b()), this.d).a())).a()).a();
    }

    public final /* synthetic */ xfk apply(Flowable flowable) {
        return flowable.c((Function<? super T, ? extends R>) new $$Lambda$mcl$3rEcvliPa8JqYw2e6TFZz1wK8q4<Object,Object>(this));
    }
}
