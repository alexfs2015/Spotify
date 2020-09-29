package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import com.spotify.effortlesslogin.backend.EffortlessLoginNameResponse;
import com.spotify.effortlesslogin.backend.EffortlessLoginTokenResponse;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Function;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: gdf reason: default package */
public final class gdf {
    private final gho a;
    private final rnf b;

    public gdf(gho gho, rnf rnf) {
        this.a = gho;
        this.b = rnf;
    }

    public final Observable<EffortlessLoginTokenResponse> a(String str) {
        return a(str, "https://partner-accounts.spotify.com/v0/login/token").c((Function<? super T, ? extends R>) new $$Lambda$gdf$p5vI5443TdGniMBFZ3wvmJSdcUw<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ EffortlessLoginTokenResponse e(String str) {
        return (EffortlessLoginTokenResponse) this.b.b().readValue(str, EffortlessLoginTokenResponse.class);
    }

    public final Observable<EffortlessLoginNameResponse> b(String str) {
        return a(str, "https://partner-accounts.spotify.com/v0/login/user-profile").c((Function<? super T, ? extends R>) new $$Lambda$gdf$ZeWpSCQZeUQv7QhklkWJHKEUfU<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ EffortlessLoginNameResponse d(String str) {
        return (EffortlessLoginNameResponse) this.b.b().readValue(str, EffortlessLoginNameResponse.class);
    }

    private Observable<String> a(String str, String str2) {
        Optional b2 = b(str, str2);
        return b2.b() ? Observable.a((ObservableOnSubscribe<T>) new $$Lambda$gdf$_j9yVb133VL3OcfQ48VFFpL_gd8<T>(this, b2)) : Observable.a((Throwable) new Exception("Failed to create request"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Optional optional, final ObservableEmitter observableEmitter) {
        ((wlj) optional.c()).a(new wlk() {
            public final void onResponse(wlj wlj, wmf wmf) {
                ObservableEmitter observableEmitter = observableEmitter;
                try {
                    if (wmf.a()) {
                        observableEmitter.a(wmf.g.f());
                        observableEmitter.c();
                        return;
                    }
                    observableEmitter.a((Throwable) new Exception(wmf.g.f()));
                } catch (Exception e) {
                    observableEmitter.a((Throwable) e);
                }
            }

            public final void onFailure(wlj wlj, IOException iOException) {
                observableEmitter.a((Throwable) iOException);
            }
        });
    }

    private Optional<wlj> b(String str, String str2) {
        Optional c = c(str);
        if (!c.b()) {
            return Optional.e();
        }
        return Optional.b(wmc.a(this.a.b, new a().a(str2).a("Content-Encoding", "identity").a(Request.POST, (wme) c.c()).a(), false));
    }

    private static Optional<wme> c(String str) {
        try {
            return Optional.b(wme.a(wlz.b("application/json"), new JSONObject().put("client_id", "dc9ecfcb91814373acd159bbdfeca5e9").put("jwt", str).toString()));
        } catch (Exception e) {
            Logger.e(e, "Failed to make request", new Object[0]);
            return Optional.e();
        }
    }
}
