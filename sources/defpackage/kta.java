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

/* renamed from: kta reason: default package */
public final class kta implements ktb {
    private final ClientIdentity a;
    private final FieldValidator b = new FieldValidator();
    private final kte c;
    private final ver d;
    private final ktg e;
    private final ktd f;
    private final kua g;

    public kta(ClientIdentity clientIdentity, Application application, ver ver, ktg ktg, ksw ksw, ktp ktp, ktn ktn, jrp jrp, kua kua) {
        this.a = clientIdentity;
        this.d = ver;
        this.e = ktg;
        this.c = new kte(application, ksw);
        this.f = new ktd(ktp, ktn, jrp);
        this.g = kua;
    }

    public final void a(kue kue) {
        FieldValidator.a((Object) this.a, "client identity");
        FieldValidator.a((Object) kue.b(), "extras");
        FieldValidator.a(kue.a(), "authid");
        String str = "redirect_uri";
        FieldValidator.a((String) kue.b().get(str), str);
        String str2 = "app-remote-control";
        if (!kud.a(kue).contains(str2)) {
            StringBuilder sb = new StringBuilder("\"");
            sb.append("scopes");
            sb.append("\" doesn't contain \"");
            sb.append(str2);
            sb.append('\"');
            throw new ValidationException(sb.toString());
        }
    }

    public final Completable b(kue kue) {
        if (this.d.a()) {
            return this.e.a().b((Function<? super T, ? extends CompletableSource>) new $$Lambda$kta$Md1jOO2uOEKWs4SeHzZ4Y219g<Object,Object>(this, kue), false);
        }
        Completable a2 = this.f.a().a(Functions.c());
        Completable a3 = this.e.b().a((Consumer<? super Throwable>) new $$Lambda$kta$fEteoyytvIr8rPnNmViiAduSS4<Object>(this));
        AuthorizationRequest a4 = ktc.a(kue, this.a);
        boolean parseBoolean = Boolean.parseBoolean((String) kue.b().get("show_auth_view"));
        this.g.a(a4, false, true);
        return a2.a((CompletableSource) a3.a((CompletableSource) this.c.a(a4, parseBoolean).a((Consumer<? super Throwable>) new $$Lambda$kta$z4EKvORwQ_ZtUutgcuVNweIwAO4<Object>(this)).b((Action) new $$Lambda$kta$1wrDQV7NT2aonYn9i1wB_uyVO4w(this, a4))));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(kue kue, Boolean bool) {
        if (bool.booleanValue()) {
            AuthorizationRequest a2 = ktc.a(kue, this.a);
            boolean parseBoolean = Boolean.parseBoolean((String) kue.b().get("show_auth_view"));
            this.g.a(a2, false, true);
            return this.c.b(a2, parseBoolean).a(Boolean.TRUE).c(Boolean.FALSE).c((Consumer<? super Throwable>) new $$Lambda$kta$OVnuH5bGvleumD9DNUrY6oY6Uo<Object>(this)).e(new $$Lambda$kta$LomfSTjsjSAgRcfjfbZIahEmXs(this, kue));
        }
        AuthorizationRequest a3 = ktc.a(kue, this.a);
        this.g.a(a3, true, true);
        return this.f.a(a3).a((Consumer<? super Throwable>) new $$Lambda$kta$FXpiz2CX85lxHe4PLUOLZylxwZs<Object>(this)).b((Action) new $$Lambda$kta$jBI60MqG_lz0_5g3KGQN3GniTZU(this, a3));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource b(kue kue, Boolean bool) {
        if (bool.booleanValue()) {
            AuthorizationRequest a2 = ktc.a(kue, this.a);
            this.g.a(a2.f().a);
            ktd ktd = this.f;
            return ktd.a.b(ktd.b.a(a2)).a(Functions.c());
        }
        this.g.a(ktc.a(kue, this.a).f().a, AuthError.ERROR_USER_NOT_AUTHORIZED.name());
        AuthorizationRequest a3 = ktc.a(kue, this.a);
        ktd ktd2 = this.f;
        return ktd2.a.c(ktd2.b.a(a3)).a(Functions.c()).a((CompletableSource) Completable.a((Throwable) new BuiltInAuthException(AuthError.ERROR_USER_NOT_AUTHORIZED)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(Throwable th) {
        this.g.a(this.a.a, th.getMessage());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        this.g.a(this.a.a, th.getMessage());
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
    public /* synthetic */ void a(Throwable th) {
        this.g.a(this.a.a, th.getMessage());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AuthorizationRequest authorizationRequest) {
        this.g.a(authorizationRequest.f().a);
    }
}
