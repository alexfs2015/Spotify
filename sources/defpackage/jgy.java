package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ErrorMessage;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import java.io.IOException;
import java.net.HttpCookie;
import java.util.Locale;

/* renamed from: jgy reason: default package */
public final class jgy {
    private final xah a;

    public jgy(jgv jgv) {
        a b = jgv.a.b.b();
        this.a = b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AuthorizationRequest authorizationRequest, HttpCookie httpCookie, final SingleEmitter singleEmitter) {
        String str = "Cookie";
        xai.a(this.a, new a().a(jgx.a(authorizationRequest).a().toString()).a("Accept", "text/html").a(str, httpCookie.toString()).a(), false).a(new wzq() {
            public final void onFailure(wzp wzp, IOException iOException) {
                singleEmitter.a((Throwable) iOException);
            }

            public final void onResponse(wzp wzp, xal xal) {
                jgp jgp;
                try {
                    String str = "";
                    if (!xal.a()) {
                        if (!xal.c()) {
                            Logger.e("AccountsPrefligtRequest failed with status code: %s", Integer.valueOf(xal.c));
                            if (xal.g != null) {
                                str = xal.g.f();
                                xal.g.close();
                            }
                            String lowerCase = str.toLowerCase(Locale.getDefault());
                            ErrorMessage errorMessage = lowerCase.contains("invalid app identifier") ? ErrorMessage.ACCOUNTS_INVALID_APP_ID : lowerCase.contains("invalid_request") ? ErrorMessage.ACCOUNTS_INVALID_REQUEST : lowerCase.contains("invalid_client") ? ErrorMessage.ACCOUNTS_INVALID_CLIENT : ErrorMessage.ACCOUNTS_UNKNOWN_ERROR;
                            jgp = jgp.a(errorMessage, str, null);
                            singleEmitter.a(jgp);
                        }
                    }
                    if (xal.c()) {
                        str = xal.a("Location", str);
                    }
                    jgp = jgq.a(Uri.parse(str));
                    singleEmitter.a(jgp);
                } catch (Exception e) {
                    singleEmitter.a((Throwable) e);
                }
            }
        });
    }

    public final Single<jgp> a(AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$jgy$qpaoa4fyItHHx_e8G77eIXVylRU<T>(this, authorizationRequest, httpCookie));
    }
}
