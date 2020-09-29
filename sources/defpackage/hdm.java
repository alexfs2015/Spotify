package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.cosmos.router.Request;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.internal.functions.Functions;
import java.util.Map;

/* renamed from: hdm reason: default package */
final class hdm {
    private final Observable<Boolean> a;
    private final hdx b;

    public hdm(Observable<Boolean> observable, hdx hdx) {
        this.a = observable;
        this.b = hdx;
    }

    public final Observable<Map<String, String>> a() {
        return this.a.a(Functions.a()).h(new $$Lambda$hdm$ivFVs5IMJW27Fw0bxEQQviECC0(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        if (!bool.booleanValue()) {
            return Observable.b(ImmutableMap.f());
        }
        hdx hdx = this.b;
        return hdx.a.resolve(new Request(Request.SUB, "sp://product-state/v1/values")).c(hdx.b).a(hdx.c);
    }
}
