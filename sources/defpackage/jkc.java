package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: jkc reason: default package */
public final class jkc {
    private final jll a;
    private final wum b;
    private final hvl c;
    private final RxResolver d;
    private final jrs e;

    public jkc(jll jll, wum wum, hvl hvl, RxResolver rxResolver, jrs jrs) {
        this.a = jll;
        this.b = wum;
        this.c = hvl;
        this.d = rxResolver;
        this.e = jrs;
    }

    public final wud<Boolean> a() {
        return vun.a((wrf<T>) this.c.a).a(1).f($$Lambda$GKYs9x2Hk8gnhpLpC6A_PGEwlRQ.INSTANCE).i(new $$Lambda$jkc$PmZkTA5C8UHMFu_UA8vHNOEhL1I(this)).f($$Lambda$jkc$xJu5RscYPQusdoUbArD4FMGmkA.INSTANCE).b((wun<? super T>) new $$Lambda$jkc$82iINcXDWhw1XlnEnQ1eDgGUWwM<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(String str) {
        return vun.a((ObservableSource<T>) this.d.resolve(new ufp(this.e.a(), str)), BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Response response) {
        return Boolean.valueOf(response.getStatus() >= 200 && response.getStatus() < 299);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.a.a.a();
            this.b.call();
        }
    }
}
