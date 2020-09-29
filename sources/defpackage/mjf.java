package defpackage;

import android.os.Bundle;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: mjf reason: default package */
public final class mjf implements ofc {
    private final mji a;
    private final String b;
    private Disposable c = Disposables.b();

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    public final void a(Bundle bundle) {
    }

    public final void az_() {
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
    }

    public mjf(mji mji, String str) {
        this.a = mji;
        this.b = str;
    }

    public final Completable a() {
        return Completable.a();
    }

    public final void a(a aVar) {
        this.c = this.a.a(jst.a(this.b).f()).b().a((Action) $$Lambda$mjf$kOtgDpWrLlOxaWllmxsvl9G7Ct0.INSTANCE, (Consumer<? super Throwable>) $$Lambda$mjf$WJguRB7clYus_tNsmkV3AIy_3HM.INSTANCE);
    }

    public final void d() {
        this.c.bf_();
    }
}
