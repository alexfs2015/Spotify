package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: gpb reason: default package */
public final class gpb {
    private final geb a;
    private final got b;
    private final gbp c;

    public gpb(geb geb, got got, gbp gbp) {
        this.a = geb;
        this.b = got;
        this.c = gbp;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gpd a(a aVar) {
        if (aVar.a == 410) {
            this.a.c();
        }
        return new a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gpd a(b bVar) {
        this.c.a(gbr.b(new k()));
        return new b();
    }

    /* access modifiers changed from: private */
    public gpd a(gou gou) {
        return (gpd) gou.a((gee<b, R_>) new $$Lambda$gpb$5XJZwldWXp5QSigLGF1Cu2__vqY<b,R_>(this), (gee<a, R_>) new $$Lambda$gpb$sUdfXenYByrXSqaX7EiD3j9v3o<a,R_>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(gea gea) {
        Logger.b("Auto-login response %s", gea);
        if (!(gea instanceof c)) {
            return Single.b(new a());
        }
        c cVar = (c) gea;
        return this.b.b(cVar.a, cVar.b, false).a(AndroidSchedulers.a()).f(new $$Lambda$gpb$MTrdJnCN0lK7gkKDBPb5WkvoaD8(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Disposable disposable) {
        this.a.a();
    }

    public final Single<gpd> a() {
        return this.a.b().c((Consumer<? super Disposable>) new $$Lambda$gpb$VbxSKGJkyiHg7h9kSge3MO9kP1U<Object>(this)).a(0).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$gpb$q58TNXWHlmWmjgBtyzRPEyrtVds<Object,Object>(this));
    }
}
