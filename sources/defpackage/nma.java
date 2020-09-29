package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import io.reactivex.Single;
import io.reactivex.functions.Predicate;
import org.json.JSONObject;

/* renamed from: nma reason: default package */
public final class nma implements nly {
    private final RxResolver a;

    public nma(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    /* access modifiers changed from: private */
    public static boolean a(Response response) {
        return new JSONObject(response.getBodyString()).getInt("free_space") / 1024 > 3;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(Response response) {
        return response.getStatus() == 200;
    }

    public final Single<Boolean> a() {
        return this.a.resolve(RequestBuilder.get("sp://storage/v1/statistics").build()).a((Predicate<? super T>) $$Lambda$nma$f1uDVC17fCUzUoxfyCCyLmS1s.INSTANCE).h().f($$Lambda$nma$pLE1GjNdt1u_lak7EdqNR98ySHI.INSTANCE).c(Boolean.FALSE);
    }
}
