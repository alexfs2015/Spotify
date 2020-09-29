package defpackage;

import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: gnm reason: default package */
public final class gnm {
    private final gcq a;
    private final gne b;
    private final gao c;

    public gnm(gcq gcq, gne gne, gao gao) {
        this.a = gcq;
        this.b = gne;
        this.c = gao;
    }

    public final Single<gno> a() {
        return this.a.b().c((Consumer<? super Disposable>) new $$Lambda$gnm$Xp2ABEgOEkS_SbinUD2QHzOTAP8<Object>(this)).a(0).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$gnm$UTJvRXvn1toEM033ME88IYHSYKs<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Disposable disposable) {
        this.a.a();
    }

    /* access modifiers changed from: private */
    public gno a(gnf gnf) {
        return (gno) gnf.a((gct<b, R_>) new $$Lambda$gnm$VrmAnciFjGzz2k9F39aNKHtgi0<b,R_>(this), (gct<a, R_>) new $$Lambda$gnm$dy56A6x5C7YzmM4KFpYbYKdKWxU<a,R_>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gno a(b bVar) {
        this.c.a(gaq.b(new g()));
        return new b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gno a(a aVar) {
        if (aVar.a == 410) {
            this.a.c();
        }
        return new a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(gcp gcp) {
        if (!(gcp instanceof c)) {
            return Single.b(new a());
        }
        c cVar = (c) gcp;
        return this.b.b(cVar.a, cVar.b, false).a(AndroidSchedulers.a()).f(new $$Lambda$gnm$EeDj4PGOVTMoUtBVoRTwg03qp4(this));
    }
}
