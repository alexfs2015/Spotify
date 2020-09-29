package defpackage;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: mfl reason: default package */
public final class mfl {
    Disposable a;
    private final gwp b;
    private final mfa c;
    private final String d;

    mfl(mfa mfa, sso sso, gwp gwp) {
        this.b = gwp;
        this.c = mfa;
        this.d = sso.toString();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(mfn mfn, hcs hcs) {
        mfn.a(hcs.toBuilder().b(this.d).a());
    }

    public final void a(mfn mfn) {
        this.a = wit.b(this.c.a()).a((Consumer<? super T>) new $$Lambda$mfl$HIQSVkupVGSgvgOlG7Rs357e8s<Object>(this, mfn), (Consumer<? super Throwable>) $$Lambda$mfl$ugnRbbgP7DrObmkpJ69oLrrbmE.INSTANCE);
    }
}
