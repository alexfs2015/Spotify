package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;

/* renamed from: waa reason: default package */
public final class waa {
    private final PasswordValidator a;
    private final gom b;
    private final vxj c;
    private final wan d;
    private final boolean e;

    public waa(PasswordValidator passwordValidator, gom gom, vxj vxj, wan wan, boolean z) {
        this.a = passwordValidator;
        this.b = gom;
        this.c = vxj;
        this.d = wan;
        this.e = z;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(boolean z, gom gom, c cVar) {
        return z ? gom.a(cVar.a).f(new $$Lambda$waa$jol3pnRCHn0WHZYCAih8XjU_jjs(cVar)).d() : Observable.b(vzw.a(cVar.a, new a(true, false, null)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vzw a(PasswordValidator passwordValidator, a aVar) {
        return new a(aVar.a, passwordValidator.a(aVar.a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.c.a().b();
        this.d.b();
    }

    public final ObservableTransformer<vzv, vzw> a() {
        return kok.a().a(b.class, (Action) new $$Lambda$waa$mdoy4GP87YlJs0QPTDtc1W0oUls(this), AndroidSchedulers.a()).a(a.class, (ObservableTransformer<G, E>) new $$Lambda$waa$_VbrTHJz4I1i3Gcv1ZW5_4hFcSY<G,E>(this.a)).a(c.class, (ObservableTransformer<G, E>) new $$Lambda$waa$EeOCe47gz3bIU1EU6aedftpAJA<G,E>(!this.e, this.b)).a();
    }
}
