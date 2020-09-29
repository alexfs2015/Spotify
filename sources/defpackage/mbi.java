package defpackage;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: mbi reason: default package */
public final class mbi {
    Disposable a;
    private final gup b;
    private final max c;
    private final String d;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    mbi(max max, sih sih, gup gup) {
        this.b = gup;
        this.c = max;
        this.d = sih.toString();
    }

    public final void a(mbk mbk) {
        this.a = vun.b(this.c.a()).a((Consumer<? super T>) new $$Lambda$mbi$gFlEO1EnqkNZAq6V1LTz9wiPYA<Object>(this, mbk), (Consumer<? super Throwable>) $$Lambda$mbi$jq628T8rvCYPHrPWGeAtKu204Ps.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(mbk mbk, gzz gzz) {
        mbk.a(gzz.toBuilder().b(this.d).a());
    }
}
