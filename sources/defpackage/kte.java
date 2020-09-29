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

/* renamed from: kte reason: default package */
public final class kte {
    final Application a;
    private final ksw b;

    kte(Application application, ksw ksw) {
        this.a = application;
        this.b = ksw;
    }

    public final Completable a(AuthorizationRequest authorizationRequest, boolean z) {
        return b(authorizationRequest, z);
    }

    /* access modifiers changed from: 0000 */
    public Completable b(AuthorizationRequest authorizationRequest, boolean z) {
        return this.b.a(authorizationRequest).b((Function<? super T, ? extends CompletableSource>) new $$Lambda$kte$WJBXtQfqaQdy18y29vqPlDjuiG4<Object,Object>(this, z, authorizationRequest), false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(boolean z, AuthorizationRequest authorizationRequest, ho hoVar) {
        jea jea = (jea) hoVar.a;
        if (jea == null || (jea instanceof d)) {
            return a(AuthError.ERROR_AUTHENTICATION_FAILED);
        }
        if (!(jea instanceof e) && !(jea instanceof c)) {
            return Completable.a();
        }
        if (!z) {
            return a(AuthError.ERROR_USER_NOT_AUTHORIZED);
        }
        ksy ksy = new ksy(authorizationRequest.c(), ResponseType.TOKEN, authorizationRequest.b(), authorizationRequest.f(), (HttpCookie) hoVar.b, authorizationRequest.a());
        return Completable.a((CompletableOnSubscribe) new $$Lambda$kte$rrkpyD91w1FV9JCscK8HPfPeEmE(this, ksy));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ksy ksy, final CompletableEmitter completableEmitter) {
        AccountsActivity.a((Context) this.a, (BroadcastReceiver) new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                AccountsActivity.b(kte.this.a, this);
                if (AccountsActivity.a(intent).a) {
                    completableEmitter.c();
                    return;
                }
                completableEmitter.a((Throwable) new BuiltInAuthException(AuthError.ERROR_USER_NOT_AUTHORIZED));
            }
        });
        this.a.startActivity(AccountsActivity.a((Context) this.a, ksy));
    }

    private static Completable a(AuthError authError) {
        return Completable.a((Throwable) new BuiltInAuthException(authError));
    }
}
