package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: tcg reason: default package */
public final class tcg {
    Disposable a;
    private final a b;

    public tcg(a aVar) {
        this.b = aVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xfk a(tdq tdq, Boolean bool) {
        return bool.booleanValue() ? Flowable.b() : tdq.a();
    }

    public final void a(final tdq tdq) {
        this.b.a(new c() {
            public final void e() {
                tcg tcg = tcg.this;
                tcg.a = tdq.e().e(new $$Lambda$tcg$NTjBCnG5HZlHxXMrJXVcmeDow(tdq)).c((Consumer<? super T>) new $$Lambda$tcg$EfFTekSAMdMAV6gOsFtLN90QQv4<Object>(tdq));
            }

            public final void f() {
                tcg.this.a.bd_();
            }
        });
    }
}
