package defpackage;

import com.spotify.accountrecovery.api.models.SetPasswordErrorBody;
import com.spotify.libs.signup.validators.PasswordValidator;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

/* renamed from: gqj reason: default package */
public final class gqj {
    /* access modifiers changed from: private */
    public static /* synthetic */ gqf a(a aVar, gpl gpl) {
        if (gpl.a.a()) {
            return new f(aVar.a, gpl.b);
        }
        if (gpl.a.a.c != 400) {
            return gqf.a(aVar.a, gpl.b, gqg.a(String.valueOf(gpl.a.a.c)));
        }
        String str = null;
        xam xam = gpl.a.b;
        if (xam != null) {
            SetPasswordErrorBody fromJson = SetPasswordErrorBody.fromJson(xam.f());
            if (fromJson != null && fromJson.isRecoverable()) {
                str = fromJson.getMessage();
            }
        }
        return str != null ? gqf.a(aVar.a, gpl.b, new a(str)) : gqf.a(aVar.a, gpl.b, new b());
    }

    public static ObservableTransformer<gqe, gqf> a(gqk gqk, gix gix, Observable<String> observable, gpx gpx, PasswordValidator passwordValidator) {
        return kok.a().a(c.class, (Consumer<G>) new $$Lambda$gqj$H0MKWn_uU3v3mDOb4mzNuI41FHg<G>(gqk), AndroidSchedulers.a()).a(d.class, (ObservableTransformer<G, E>) new $$Lambda$gqj$WwJosfO_NNhsmo5DQwhVv9b5V3I<G,E>(passwordValidator)).a(a.class, (ObservableTransformer<G, E>) new $$Lambda$gqj$cmB5KdwkoavGpZlKAnviAatmkao<G,E>(gix, observable)).a(b.class, (Consumer<G>) new $$Lambda$gqj$iqJcXHOp6ZTD3fQnBtY0dxkO_0w<G>(gpx)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(gpx gpx, b bVar) {
        String str = bVar.a;
        String str2 = bVar.b;
        gpx.a.a(str, str2, "", (wau) new wat() {
            public final void ar_() {
                super.ar_();
                gpx.this.b.a(new a());
            }
        });
    }
}
