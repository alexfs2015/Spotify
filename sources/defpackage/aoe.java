package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient.Result;
import com.facebook.login.LoginClient.c;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.Collection;
import java.util.Locale;

/* renamed from: aoe reason: default package */
abstract class aoe extends anz {
    private String c;

    aoe(Parcel parcel) {
        super(parcel);
    }

    aoe(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: protected */
    public final Bundle a(Bundle bundle, c cVar) {
        StringBuilder sb = new StringBuilder("fb");
        sb.append(akq.k());
        sb.append("://authorize");
        bundle.putString("redirect_uri", sb.toString());
        bundle.putString("client_id", cVar.d);
        bundle.putString("e2e", LoginClient.e());
        bundle.putString("response_type", "token,signed_request");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", cVar.h);
        if (c() != null) {
            bundle.putString("sso", c());
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final void a(c cVar, Bundle bundle, FacebookException facebookException) {
        Result result;
        String str;
        this.c = null;
        if (bundle != null) {
            String str2 = "e2e";
            if (bundle.containsKey(str2)) {
                this.c = bundle.getString(str2);
            }
            try {
                aki a = a(cVar.b, bundle, h_(), cVar.d);
                result = Result.a(this.b.e, a);
                CookieSyncManager.createInstance(this.b.b.p()).sync();
                this.b.b.p().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", a.e).apply();
            } catch (FacebookException e) {
                result = Result.a(this.b.e, null, e.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            result = Result.a(this.b.e, "User canceled log in.");
        } else {
            this.c = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError facebookRequestError = ((FacebookServiceException) facebookException).error;
                str = String.format(Locale.ROOT, "%d", new Object[]{Integer.valueOf(facebookRequestError.b)});
                message = facebookRequestError.toString();
            } else {
                str = null;
            }
            result = Result.a(this.b.e, null, message, str);
        }
        if (!ank.a(this.c)) {
            b(this.c);
        }
        this.b.a(result);
    }

    /* access modifiers changed from: protected */
    public final Bundle b(c cVar) {
        Bundle bundle = new Bundle();
        if (!ank.a((Collection<T>) cVar.b)) {
            String join = TextUtils.join(",", cVar.b);
            String str = "scope";
            bundle.putString(str, join);
            a(str, join);
        }
        bundle.putString("default_audience", cVar.c.nativeProtocolAudience);
        bundle.putString("state", a(cVar.e));
        aki a = aki.a();
        String str2 = a != null ? a.e : null;
        String str3 = "access_token";
        if (str2 == null || !str2.equals(this.b.b.p().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
            ank.b((Context) this.b.b.p());
            a(str3, Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        } else {
            bundle.putString(str3, str2);
            a(str3, "1");
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public String c() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public abstract AccessTokenSource h_();
}