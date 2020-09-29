package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import io.reactivex.functions.Consumer;

/* renamed from: hzz reason: default package */
public final class hzz implements hzs {
    private final RxResolver a;

    public hzz(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Response response) {
    }

    public final void a(jva jva) {
        String f = jva.f();
        StringBuilder sb = new StringBuilder("sp://ads/v1/preview/");
        sb.append(f);
        this.a.resolve(RequestBuilder.post(sb.toString()).build()).a((Consumer<? super T>) $$Lambda$hzz$RsRhlWSBvW8KGr795xqAOkPCSDg.INSTANCE, (Consumer<? super Throwable>) $$Lambda$hzz$nwwnRq6_xF7aqdGV_35rovJlzrQ.INSTANCE);
    }
}
