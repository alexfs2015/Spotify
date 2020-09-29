package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import io.reactivex.functions.Consumer;

/* renamed from: hxn reason: default package */
public final class hxn implements hxg {
    private final RxResolver a;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Response response) {
    }

    public hxn(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    public final void a(jst jst) {
        String f = jst.f();
        StringBuilder sb = new StringBuilder("sp://ads/v1/preview/");
        sb.append(f);
        this.a.resolve(RequestBuilder.post(sb.toString()).build()).a((Consumer<? super T>) $$Lambda$hxn$SIVCMQo8SB0nK9iKw6Z5mkZMPE.INSTANCE, (Consumer<? super Throwable>) $$Lambda$hxn$o9mMvpcljNlp48KLprcnN3DOmM0.INSTANCE);
    }
}
