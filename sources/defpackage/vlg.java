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

/* renamed from: vlg reason: default package */
public final class vlg {
    private final vlo a;
    private final vmu b;
    private final vkn c;
    private final vmb d;
    private final vmk e;
    private final vkd f;
    private final Activity g;
    private final vju h;
    private final AgeValidator i;
    private final vni j;
    private final gne k;
    private final vjy l;

    public vlg(vlo vlo, vmu vmu, vkn vkn, vmb vmb, vmk vmk, vkd vkd, Activity activity, vju vju, AgeValidator ageValidator, vni vni, gne gne, vjy vjy) {
        this.a = vlo;
        this.b = vmu;
        this.c = vkn;
        this.d = vmb;
        this.e = vmk;
        this.f = vkd;
        this.g = activity;
        this.h = vju;
        this.i = ageValidator;
        this.j = vni;
        this.k = gne;
        this.l = vjy;
    }

    public final ObservableTransformer<vlc, vld> a() {
        vni vni = this.j;
        vni.getClass();
        vni vni2 = this.j;
        vni2.getClass();
        vni vni3 = this.j;
        vni3.getClass();
        vni vni4 = this.j;
        vni4.getClass();
        return klb.a().a(b.class, (ObservableTransformer<G, E>) new $$Lambda$vlg$cajNXDWQk58jyd8RkdOXlbnKgyY<G,E>(this.a)).a(i.class, (ObservableTransformer<G, E>) new $$Lambda$vlg$ZSWmSJoiY1GwL2XEjwJCsJbk<G,E>(this.b)).a(a.class, (ObservableTransformer<G, E>) new $$Lambda$vlg$tB9HFsDmzCF1kRKbIyfLuEFGDqY<G,E>(this.c)).a(f.class, (ObservableTransformer<G, E>) new $$Lambda$vlg$Sq_P6tklpQ2VPGGkC2r_I4pUs<G,E>(this.d)).a(h.class, (ObservableTransformer<G, E>) new $$Lambda$vlg$PvvHp7wh1Rv6k9k8YhvnJMQ5GZM<G,E>(this.e)).a(d.class, (Consumer<G>) new $$Lambda$vlg$HQm1CPINXvH43P2QSHky7Y0HAyA<G>(this), AndroidSchedulers.a()).a(e.class, (Consumer<G>) new $$Lambda$vlg$mQb1_4qH0gWQRiQCminamRNtyFE<G>(this), AndroidSchedulers.a()).a(l.class, (Action) new $$Lambda$E3jx0YvacAF2sPI7uqtv065gDKM(vni), AndroidSchedulers.a()).a(m.class, (Action) new $$Lambda$lAw5qrPVrv3vLytHbgHdaUtLDgI(vni2), AndroidSchedulers.a()).a(k.class, (Action) new $$Lambda$L2IXG2RA5mlbykX0CyV1d3lVIGs(vni3), AndroidSchedulers.a()).a(o.class, (Action) new $$Lambda$nOHnvl1oHKMEaJOHwQfqlku35hs(vni4), AndroidSchedulers.a()).a(c.class, (ObservableTransformer<G, E>) new $$Lambda$vlg$ZWHDlN2m_Ya50KKrpjZeF0ikzU<G,E>(this.h, this.i)).a(p.class, (Consumer<G>) new $$Lambda$vlg$tof9LFbbZlnf09wNOMN4CEAN9MM<G>(this), AndroidSchedulers.a()).a(n.class, (Consumer<G>) new $$Lambda$vlg$_8euKUpIWrqdEBX9ANA4zpooKg4<G>(this), AndroidSchedulers.a()).a(g.class, (ObservableTransformer<G, E>) new $$Lambda$vlg$pnIpvqpEN9uDKoPaZdukJJpl8g<G,E>(this)).a(q.class, (ObservableTransformer<G, E>) new $$Lambda$vlg$D0dalkmqLXhk1bSu0oHhH0zYYc<G,E>(this.h)).a(j.class, (Consumer<G>) new $$Lambda$vlg$5S_KreMxMRevCRwn08t7mOQ36KM<G>(this)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(p pVar) {
        this.f.a(pVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(n nVar) {
        this.j.a(new n(nVar.a, nVar.b), new a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(j jVar) {
        vjy vjy = this.l;
        vjy.a.a(jVar.a, jVar.b, vnk.a, (vno) new vnn() {
            public final void a() {
                super.a();
                vjy.this.b.a(new f());
            }
        });
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
    public static /* synthetic */ void a(AgeValidator ageValidator, SignupConfigurationResponse signupConfigurationResponse) {
        ageValidator.a(signupConfigurationResponse.minimumAge);
        Logger.c("Signup config: %s", signupConfigurationResponse);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vlg$fRGu6OcoVG2CoQSsWyVfbnvHmMg<Object,Object>(this), false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(g gVar) {
        return this.k.b(gVar.a, gVar.b, true).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vlg$uuY3Fn2GQVtUw4qH9717sNf1wTs<Object,Object>(gVar), false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(g gVar, gnf gnf) {
        return (Observable) gnf.a((gct<b, R_>) new $$Lambda$vlg$FAzf5NOOm4BIJbe9OgpjUxNdULQ<b,R_>(gVar), (gct<a, R_>) new $$Lambda$vlg$Lg_3UdPbeDyE75VmavaTjJ38PHA<a,R_>(gVar));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(vju vju, q qVar) {
        EmailSignupRequestBody emailSignupRequestBody = qVar.a;
        if (!fax.a(vju.b)) {
            emailSignupRequestBody = emailSignupRequestBody.withCreationPoint(vju.b);
        }
        return vju.a.a(emailSignupRequestBody).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$vlg$dKToMyqdAEQYJJ7LRpPyGyqLj1A.INSTANCE, false).d((ObservableSource<? extends T>) Observable.b(vld.a(EmailSignupStatus.error(SignupErrorStatus.STATUS_UNKNOWN_ERROR, Collections.emptyMap()))));
    }
}
