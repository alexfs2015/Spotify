package defpackage;

import android.app.Application;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException.AuthError;
import com.spotify.music.builtinauth.model.FieldValidator;
import com.spotify.music.builtinauth.model.FieldValidator.ValidationException;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: kwj reason: default package */
public final class kwj implements kwk {
    private final ClientIdentity a;
    private final FieldValidator b = new FieldValidator();
    private final kwn c;
    private final vro d;
    private final kwp e;
    private final kwm f;
    private final kxj g;

    public kwj(ClientIdentity clientIdentity, Application application, vro vro, kwp kwp, kwf kwf, kwy kwy, kww kww, jtz jtz, kxj kxj) {
        this.a = clientIdentity;
        this.d = vro;
        this.e = kwp;
        this.c = new kwn(application, kwf);
        this.f = new kwm(kwy, kww, jtz);
        this.g = kxj;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(kxn kxn, Boolean bool) {
        if (bool.booleanValue()) {
            AuthorizationRequest a2 = kwl.a(kxn, this.a);
            boolean parseBoolean = Boolean.parseBoolean((String) kxn.b().get("show_auth_view"));
            this.g.a(a2, false, true);
            return this.c.b(a2, parseBoolean).a(Boolean.TRUE).c(Boolean.FALSE).c((Consumer<? super Throwable>) new $$Lambda$kwj$rht7YNT0f4NzyMG_Wt12EfaTI<Object>(this)).e(new $$Lambda$kwj$AXJ4xrKJYY_NhSShBWR649QiCQk(this, kxn));
        }
        AuthorizationRequest a3 = kwl.a(kxn, this.a);
        this.g.a(a3, true, true);
        return this.f.a(a3).a((Consumer<? super Throwable>) new $$Lambda$kwj$ewRpJc6LNC_Kh14fFTKSPtmKB0<Object>(this)).b((Action) new $$Lambda$kwj$rk3leEq63BZbNQfG0o4oeFLXZhc(this, a3));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AuthorizationRequest authorizationRequest) {
        this.g.a(authorizationRequest.f().a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.g.a(this.a.a, th.getMessage());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource b(kxn kxn, Boolean bool) {
        if (bool.booleanValue()) {
            AuthorizationRequest a2 = kwl.a(kxn, this.a);
            this.g.a(a2.f().a);
            kwm kwm = this.f;
            return kwm.a.b(kwm.b.a(a2)).a(Functions.c());
        }
        this.g.a(kwl.a(kxn, this.a).f().a, AuthError.ERROR_USER_NOT_AUTHORIZED.name());
        AuthorizationRequest a3 = kwl.a(kxn, this.a);
        kwm kwm2 = this.f;
        return kwm2.a.c(kwm2.b.a(a3)).a(Functions.c()).a((CompletableSource) Completable.a((Throwable) new BuiltInAuthException(AuthError.ERROR_USER_NOT_AUTHORIZED)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(AuthorizationRequest authorizationRequest) {
        this.g.a(authorizationRequest.f().a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        this.g.a(this.a.a, th.getMessage());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        this.g.a(this.a.a, th.getMessage());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(Throwable th) {
        this.g.a(this.a.a, th.getMessage());
    }

    public final void a(kxn kxn) {
        FieldValidator.a((Object) this.a, "client identity");
        FieldValidator.a((Object) kxn.b(), "extras");
        FieldValidator.a(kxn.a(), "authid");
        String str = "redirect_uri";
        FieldValidator.a((String) kxn.b().get(str), str);
        String str2 = "app-remote-control";
        if (!kxm.a(kxn).contains(str2)) {
            StringBuilder sb = new StringBuilder("\"");
            sb.append("scopes");
            sb.append("\" doesn't contain \"");
            sb.append(str2);
            sb.append('\"');
            throw new ValidationException(sb.toString());
        }
    }

    public final Completable b(kxn kxn) {
        if (this.d.a()) {
            return this.e.a().b((Function<? super T, ? extends CompletableSource>) new $$Lambda$kwj$Mmqd5vM1x8UqgA5e13gpdEN90u0<Object,Object>(this, kxn), false);
        }
        Completable a2 = this.f.a().a(Functions.c());
        Completable a3 = this.e.b().a((Consumer<? super Throwable>) new $$Lambda$kwj$xsnriMnCex0ahmb34og2qNHUno<Object>(this));
        AuthorizationRequest a4 = kwl.a(kxn, this.a);
        boolean parseBoolean = Boolean.parseBoolean((String) kxn.b().get("show_auth_view"));
        this.g.a(a4, false, true);
        return a2.a((CompletableSource) a3.a((CompletableSource) this.c.a(a4, parseBoolean).a((Consumer<? super Throwable>) new $$Lambda$kwj$vc3jKZTmXMPTcF5HE9wcmc5swcI<Object>(this)).b((Action) new $$Lambda$kwj$B65KPQGsdnN096DcRKgN93cSnEo(this, a4))));
    }
}
