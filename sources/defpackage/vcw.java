package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: vcw reason: default package */
public class vcw<T> extends vcz<T> {
    final SerialDisposable a = new SerialDisposable();
    private final Flowable<T> b;

    public vcw(Flowable<T> flowable, a aVar) {
        this.b = (Flowable) fbp.a(flowable);
        aVar.a(new c() {
            public final void a() {
                vcw.this.a.a(Disposables.a());
            }

            public final void c() {
                vcw.this.a.a(vcw.this.b.a((Consumer<? super T>) new $$Lambda$Us5PdaoR4QIZRwgvWnbIjAvLOo<Object>(vcw.this), (Consumer<? super Throwable>) new $$Lambda$vcw$mS_KqifuF_YSbnWN16XKUMlwDk<Object>(vcw.this)));
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e(th, "Error while observing", new Object[0]);
    }
}
