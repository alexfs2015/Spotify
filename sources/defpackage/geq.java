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

/* renamed from: geq reason: default package */
public final class geq {
    private final giz a;
    private final rwl b;

    public geq(giz giz, rwl rwl) {
        this.a = giz;
        this.b = rwl;
    }

    private Observable<String> a(String str, String str2) {
        Optional b2 = b(str, str2);
        return b2.b() ? Observable.a((ObservableOnSubscribe<T>) new $$Lambda$geq$BVGxwKBtbTq9u_m7nMiXhGXQFow<T>(this, b2)) : Observable.a((Throwable) new Exception("Failed to create request"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Optional optional, final ObservableEmitter observableEmitter) {
        ((wzp) optional.c()).a(new wzq() {
            public final void onFailure(wzp wzp, IOException iOException) {
                observableEmitter.a((Throwable) iOException);
            }

            public final void onResponse(wzp wzp, xal xal) {
                ObservableEmitter observableEmitter = observableEmitter;
                try {
                    if (xal.a()) {
                        observableEmitter.a(xal.g.f());
                        observableEmitter.c();
                        return;
                    }
                    observableEmitter.a((Throwable) new Exception(xal.g.f()));
                } catch (Exception e) {
                    observableEmitter.a((Throwable) e);
                }
            }
        });
    }

    private Optional<wzp> b(String str, String str2) {
        Optional c = c(str);
        if (!c.b()) {
            return Optional.e();
        }
        return Optional.b(xai.a(this.a.b, new a().a(str2).a("Content-Encoding", "identity").a(Request.POST, (xak) c.c()).a(), false));
    }

    private static Optional<xak> c(String str) {
        try {
            return Optional.b(xak.a(xaf.b("application/json"), new JSONObject().put("client_id", "dc9ecfcb91814373acd159bbdfeca5e9").put("jwt", str).toString()));
        } catch (Exception e) {
            Logger.e(e, "Failed to make request", new Object[0]);
            return Optional.e();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ EffortlessLoginNameResponse d(String str) {
        return (EffortlessLoginNameResponse) this.b.b().readValue(str, EffortlessLoginNameResponse.class);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ EffortlessLoginTokenResponse e(String str) {
        return (EffortlessLoginTokenResponse) this.b.b().readValue(str, EffortlessLoginTokenResponse.class);
    }

    public final Observable<EffortlessLoginTokenResponse> a(String str) {
        return a(str, "https://partner-accounts.spotify.com/v0/login/token").c((Function<? super T, ? extends R>) new $$Lambda$geq$FnNt089D5GK1QNrIgAphBmL6EwQ<Object,Object>(this));
    }

    public final Observable<EffortlessLoginNameResponse> b(String str) {
        return a(str, "https://partner-accounts.spotify.com/v0/login/user-profile").c((Function<? super T, ? extends R>) new $$Lambda$geq$2_AKtmUwd_ww83AldAf6ar9X6Xw<Object,Object>(this));
    }
}
