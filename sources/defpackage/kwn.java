package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.music.builtinauth.authenticator.AccountsActivity;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException.AuthError;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import java.net.HttpCookie;

/* renamed from: kwn reason: default package */
public final class kwn {
    final Application a;
    private final kwf b;

    kwn(Application application, kwf kwf) {
        this.a = application;
        this.b = kwf;
    }

    private static Completable a(AuthError authError) {
        return Completable.a((Throwable) new BuiltInAuthException(authError));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(boolean z, AuthorizationRequest authorizationRequest, ho hoVar) {
        jgp jgp = (jgp) hoVar.a;
        if (jgp == null || (jgp instanceof d)) {
            return a(AuthError.ERROR_AUTHENTICATION_FAILED);
        }
        if (!(jgp instanceof e) && !(jgp instanceof c)) {
            return Completable.a();
        }
        if (!z) {
            return a(AuthError.ERROR_USER_NOT_AUTHORIZED);
        }
        kwh kwh = new kwh(authorizationRequest.c(), ResponseType.TOKEN, authorizationRequest.b(), authorizationRequest.f(), (HttpCookie) hoVar.b, authorizationRequest.a());
        return Completable.a((CompletableOnSubscribe) new $$Lambda$kwn$Y25qm261fZAnw4iHeFHhrTfqOK0(this, kwh));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kwh kwh, final CompletableEmitter completableEmitter) {
        AccountsActivity.a((Context) this.a, (BroadcastReceiver) new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                AccountsActivity.b(kwn.this.a, this);
                if (AccountsActivity.a(intent).a) {
                    completableEmitter.c();
                    return;
                }
                completableEmitter.a((Throwable) new BuiltInAuthException(AuthError.ERROR_USER_NOT_AUTHORIZED));
            }
        });
        this.a.startActivity(AccountsActivity.a((Context) this.a, kwh));
    }

    public final Completable a(AuthorizationRequest authorizationRequest, boolean z) {
        return b(authorizationRequest, z);
    }

    /* access modifiers changed from: 0000 */
    public Completable b(AuthorizationRequest authorizationRequest, boolean z) {
        return this.b.a(authorizationRequest).b((Function<? super T, ? extends CompletableSource>) new $$Lambda$kwn$YEH36S4iqZSjvgSdZdvd7fR4Xg<Object,Object>(this, z, authorizationRequest), false);
    }
}
