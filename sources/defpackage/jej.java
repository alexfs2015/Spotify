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

/* renamed from: jej reason: default package */
public final class jej {
    private final wmb a;

    public jej(jeg jeg) {
        a b = jeg.a.b.b();
        this.a = b.a();
    }

    public final Single<jea> a(AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$jej$xNUpHhtO6ibklqfWwogoDCw5Z0<T>(this, authorizationRequest, httpCookie));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AuthorizationRequest authorizationRequest, HttpCookie httpCookie, final SingleEmitter singleEmitter) {
        String str = "Cookie";
        wmc.a(this.a, new a().a(jei.a(authorizationRequest).a().toString()).a("Accept", "text/html").a(str, httpCookie.toString()).a(), false).a(new wlk() {
            public final void onFailure(wlj wlj, IOException iOException) {
                singleEmitter.a((Throwable) iOException);
            }

            public final void onResponse(wlj wlj, wmf wmf) {
                jea jea;
                ErrorMessage errorMessage;
                try {
                    String str = "";
                    if (!wmf.a()) {
                        if (!wmf.c()) {
                            Logger.e("AccountsPrefligtRequest failed with status code: %s", Integer.valueOf(wmf.c));
                            if (wmf.g != null) {
                                str = wmf.g.f();
                                wmf.g.close();
                            }
                            String lowerCase = str.toLowerCase(Locale.getDefault());
                            if (lowerCase.contains("invalid app identifier")) {
                                errorMessage = ErrorMessage.ACCOUNTS_INVALID_APP_ID;
                            } else if (lowerCase.contains("invalid_request")) {
                                errorMessage = ErrorMessage.ACCOUNTS_INVALID_REQUEST;
                            } else if (lowerCase.contains("invalid_client")) {
                                errorMessage = ErrorMessage.ACCOUNTS_INVALID_CLIENT;
                            } else {
                                errorMessage = ErrorMessage.ACCOUNTS_UNKNOWN_ERROR;
                            }
                            jea = jea.a(errorMessage, str, null);
                            singleEmitter.a(jea);
                        }
                    }
                    if (wmf.c()) {
                        str = wmf.a("Location", str);
                    }
                    jea = jeb.a(Uri.parse(str));
                    singleEmitter.a(jea);
                } catch (Exception e) {
                    singleEmitter.a((Throwable) e);
                }
            }
        });
    }
}
