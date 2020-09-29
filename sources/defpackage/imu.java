package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TokenRequest;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TokenResponse;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.mobile.android.sso.ErrorMessage;
import com.spotify.music.builtinauth.authenticator.AccountsActivity;
import com.spotify.music.builtinauth.model.FieldValidator;
import com.spotify.music.builtinauth.model.FieldValidator.ValidationException;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.net.HttpCookie;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: imu reason: default package */
public final class imu extends ims {
    /* access modifiers changed from: private */
    public final Context c;
    private final FieldValidator d = new FieldValidator();
    private final Scheduler e;
    private final kwf f;
    private Disposable g = Disposables.b();
    private BroadcastReceiver h;

    public imu(Context context, hpt hpt, a aVar, Scheduler scheduler, kwf kwf) {
        super(hpt, aVar);
        this.c = (Context) fbp.a(context);
        this.e = scheduler;
        this.f = kwf;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AuthorizationRequest authorizationRequest, final int i, ho hoVar) {
        jgp jgp = (jgp) hoVar.a;
        HttpCookie httpCookie = (HttpCookie) hoVar.b;
        if (jgp == null) {
            a(ErrorMessage.UNKNOWN_RESPONSE_TYPE_ERROR, i);
        } else if (jgp instanceof d) {
            a(((d) jgp).a, i);
        } else if ((jgp instanceof e) || (jgp instanceof c)) {
            kwh kwh = new kwh(authorizationRequest.c(), ResponseType.TOKEN, authorizationRequest.b(), authorizationRequest.f(), httpCookie, authorizationRequest.a());
            this.h = new BroadcastReceiver() {
                public final void onReceive(Context context, Intent intent) {
                    AccountsActivity.b(imu.this.c, this);
                    kwi a2 = AccountsActivity.a(intent);
                    if (a2.a) {
                        imu.this.a(i, (Object) new TokenResponse(0, null, a2.b));
                    } else {
                        imu.this.a(i, (Object) new TokenResponse(1, a2.b, null));
                    }
                    imu.this.a(i);
                }
            };
            AccountsActivity.a(this.c, this.h);
            this.c.startActivity(AccountsActivity.a(this.c, kwh));
        } else {
            Logger.a("TokenSubscriptionManager.onSuccess", new Object[0]);
            a(i, (Object) new TokenResponse(0, null, ((a) jgp).a));
            a(i);
        }
    }

    private void a(ErrorMessage errorMessage, int i) {
        Logger.a("TokenSubscriptionManager.onAuthFailedError %s", errorMessage);
        a(i, (Object) new TokenResponse(2, errorMessage.mMessage.toLowerCase(Locale.getDefault()), null));
        a(i);
    }

    /* access modifiers changed from: protected */
    public final void a() {
    }

    public final void a(iln iln, int i) {
        String str = "scopes";
        TokenRequest tokenRequest = (TokenRequest) iln.a(2, TokenRequest.class);
        try {
            FieldValidator.a((Object) tokenRequest, "params");
            FieldValidator.a((Object) tokenRequest.clientId, "client_id");
            FieldValidator.a((Object) tokenRequest.scopes, str);
            FieldValidator.a(tokenRequest.scopes, str);
            String str2 = "";
            AuthorizationRequest a = AuthorizationRequest.a(tokenRequest.clientId, ResponseType.TOKEN, tokenRequest.redirectUri, new ClientIdentity(str2, str2), null, (String[]) Arrays.asList(tokenRequest.scopes).toArray(new String[0]), false);
            this.g = this.f.a(a).a(this.e).a((Consumer<? super T>) new $$Lambda$imu$AVqMFK36KZodPqJxa0w0FnI9a5Q<Object>(this, a, i), (Consumer<? super Throwable>) $$Lambda$imu$Ggk_f0Py6Eg1_m_t7RM_CTJKos.INSTANCE);
        } catch (ValidationException e2) {
            Logger.a("TokenSubscriptionManager.onSubscribed ERROR: %s", e2.getMessage());
            a(i, (Object) new TokenResponse(2, e2.getMessage(), null));
            a(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        super.b();
        this.g.bd_();
        this.h = null;
    }
}
