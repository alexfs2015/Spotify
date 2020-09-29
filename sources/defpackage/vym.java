package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.signup.validators.AgeValidator;
import com.spotify.signup.api.services.SignupErrorStatus;
import com.spotify.signup.api.services.model.EmailSignupRequestBody;
import com.spotify.signup.api.services.model.EmailSignupStatus;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Collections;

/* renamed from: vym reason: default package */
public final class vym {
    private final vyu a;
    private final waa b;
    private final vxt c;
    private final vzh d;
    private final vzq e;
    private final vxj f;
    private final Activity g;
    private final vxa h;
    private final AgeValidator i;
    private final wao j;
    private final got k;
    private final vxe l;
    private final gqm m;

    public vym(vyu vyu, waa waa, vxt vxt, vzh vzh, vzq vzq, vxj vxj, Activity activity, vxa vxa, AgeValidator ageValidator, wao wao, got got, vxe vxe, gqm gqm) {
        this.a = vyu;
        this.b = waa;
        this.c = vxt;
        this.d = vzh;
        this.e = vzq;
        this.f = vxj;
        this.g = activity;
        this.h = vxa;
        this.i = ageValidator;
        this.j = wao;
        this.k = got;
        this.l = vxe;
        this.m = gqm;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vym$LdNsCbk11lsa_YW_KcK_SDSLZ28<Object,Object>(this), false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(vxa vxa, q qVar) {
        EmailSignupRequestBody emailSignupRequestBody = qVar.a;
        if (!fbo.a(vxa.b)) {
            emailSignupRequestBody = emailSignupRequestBody.withCreationPoint(vxa.b);
        }
        return vxa.a.a(emailSignupRequestBody).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$vym$xpUBBUmndv61nNyYlCVcoSs0YBA.INSTANCE, false).d((ObservableSource<? extends T>) Observable.b(vyj.a(EmailSignupStatus.error(SignupErrorStatus.STATUS_UNKNOWN_ERROR, Collections.emptyMap()))));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(g gVar) {
        return this.k.b(gVar.a, gVar.b, true).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vym$X7rhXgnAVUVDyP1mfWKUmBjHGM<Object,Object>(gVar), false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(g gVar, gou gou) {
        return (Observable) gou.a((gee<b, R_>) new $$Lambda$vym$FeRjiWYYMIg3u64zGA1FUO_MFQg<b,R_>(gVar), (gee<a, R_>) new $$Lambda$vym$OXquYjUkxENMKliMUQVAtM6zl14<a,R_>(gVar));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(AgeValidator ageValidator, gqm gqm, SignupConfigurationResponse signupConfigurationResponse) {
        ageValidator.a(signupConfigurationResponse.minimumAge);
        boolean z = signupConfigurationResponse.requiresMarketingOptIn;
        gqm.c.a().a(gqm.a, z).a(gqm.b, signupConfigurationResponse.contactUrl).b();
        Logger.c("Signup config: %s", signupConfigurationResponse);
    }

    /* access modifiers changed from: private */
    public void a(d dVar) {
        this.g.setResult(dVar.a);
        this.g.finish();
    }

    /* access modifiers changed from: private */
    public void a(e eVar) {
        Activity activity = this.g;
        String str = eVar.a;
        Intent intent = new Intent();
        intent.putExtra("email", str);
        activity.setResult(48000, intent);
        this.g.finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(j jVar) {
        vxe vxe = this.l;
        vxe.a.a(jVar.a, jVar.b, "", (wau) vxe.c);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(n nVar) {
        this.j.a(new n(nVar.a, nVar.b), new a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(p pVar) {
        this.f.a(pVar.a);
    }

    public final ObservableTransformer<vyi, vyj> a() {
        wao wao = this.j;
        wao.getClass();
        wao wao2 = this.j;
        wao2.getClass();
        wao wao3 = this.j;
        wao3.getClass();
        wao wao4 = this.j;
        wao4.getClass();
        return kok.a().a(b.class, (ObservableTransformer<G, E>) new $$Lambda$vym$QW_npx85MthqNrpaKep6xIZGfJk<G,E>(this.a)).a(i.class, (ObservableTransformer<G, E>) new $$Lambda$vym$TZt8RwP2L6MSra_QB6Mv0KeqFe8<G,E>(this.b)).a(a.class, (ObservableTransformer<G, E>) new $$Lambda$vym$LlV64HliBirhRo4P8OahQTNHdzE<G,E>(this.c)).a(f.class, (ObservableTransformer<G, E>) new $$Lambda$vym$UyJKguPr4o8UUlta6KbFYGShHw<G,E>(this.d)).a(h.class, (ObservableTransformer<G, E>) new $$Lambda$vym$cwzPbQpdTIWpcp6RToOFm_sW2CE<G,E>(this.e)).a(d.class, (Consumer<G>) new $$Lambda$vym$WWIyWgvFIuVeNkL5AB6DmGQdNvw<G>(this), AndroidSchedulers.a()).a(e.class, (Consumer<G>) new $$Lambda$vym$oR86_GaSth3vhZxYs67Wiw2Uipw<G>(this), AndroidSchedulers.a()).a(l.class, (Action) new $$Lambda$RN92M4Ql1iS27HyYyajQOBMzY8(wao), AndroidSchedulers.a()).a(m.class, (Action) new $$Lambda$pm98_3zpjd9eDa8mDqu_NqLf_as(wao2), AndroidSchedulers.a()).a(k.class, (Action) new $$Lambda$Ft4i2FVg7NRFDqCF7XCwPhwAY3c(wao3), AndroidSchedulers.a()).a(o.class, (Action) new $$Lambda$YLclU3lIgfomXTsUlbV_FtpIc4(wao4), AndroidSchedulers.a()).a(c.class, (ObservableTransformer<G, E>) new $$Lambda$vym$9xEofzLnCRKMm2aeWIAIOwmVfJQ<G,E>(this.h, this.i, this.m)).a(p.class, (Consumer<G>) new $$Lambda$vym$R3zfNGtQzsqk4nzlOgTZfopyULA<G>(this), AndroidSchedulers.a()).a(n.class, (Consumer<G>) new $$Lambda$vym$GBcuv1j9YgcC1xpi4pZ0KelcMc<G>(this), AndroidSchedulers.a()).a(g.class, (ObservableTransformer<G, E>) new $$Lambda$vym$H2cej6X_4rIVVbGgq71o5TMxuw<G,E>(this)).a(q.class, (ObservableTransformer<G, E>) new $$Lambda$vym$qJMEReakUkeZlqpNIpRvzHZF21E<G,E>(this.h)).a(j.class, (Consumer<G>) new $$Lambda$vym$nO1jzWRjApkopsUGZRuGS9XUCDE<G>(this)).a();
    }
}
