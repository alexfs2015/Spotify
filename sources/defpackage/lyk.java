package defpackage;

import com.google.common.collect.ImmutableList;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: lyk reason: default package */
public final class lyk implements FlowableTransformer<lyb, gzz> {
    private final String a;
    private final boolean b;
    private final lwc c;
    private final boolean d;

    public lyk(String str, boolean z, lwc lwc, boolean z2) {
        this.a = (String) fay.a(str);
        this.b = z;
        this.c = lwc;
        this.d = z2;
    }

    /* access modifiers changed from: private */
    public gzz a(lyb lyb) {
        gzz a2 = lyb.a();
        if (!this.b) {
            return a2;
        }
        a builder = a2.toBuilder();
        kxx b2 = lyb.b();
        lym c2 = lyb.c();
        boolean z = b2 instanceof b;
        return builder.a(lvg.a(this.a).a((List<? extends gzt>) ImmutableList.a(lwa.a(this.c.a(!z, c2.c(), c2.b()), this.c.b(!z, c2.c(), c2.b()), this.d).a())).a()).a();
    }

    public final /* synthetic */ wrf apply(Flowable flowable) {
        return flowable.c((Function<? super T, ? extends R>) new $$Lambda$lyk$2UO_vcktsBZTPvzIYsaT6XB3ws<Object,Object>(this));
    }
}
