package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.cosmos.router.Request;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.internal.functions.Functions;
import java.util.Map;

/* renamed from: hgi reason: default package */
final class hgi {
    private final Observable<Boolean> a;
    private final hgt b;

    public hgi(Observable<Boolean> observable, hgt hgt) {
        this.a = observable;
        this.b = hgt;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        if (!bool.booleanValue()) {
            return Observable.b(ImmutableMap.f());
        }
        hgt hgt = this.b;
        return hgt.a.resolve(new Request(Request.SUB, "sp://product-state/v1/values")).c(hgt.b).a(hgt.c);
    }

    public final Observable<Map<String, String>> a() {
        return this.a.a(Functions.a()).h(new $$Lambda$hgi$NTTD5EB8H9DWaA6_Smb8ztgZIQ(this));
    }
}
