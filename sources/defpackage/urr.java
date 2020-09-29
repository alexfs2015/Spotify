package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: urr reason: default package */
public class urr<T> extends uru<T> {
    final SerialDisposable a = new SerialDisposable();
    private final Flowable<T> b;

    public urr(Flowable<T> flowable, a aVar) {
        this.b = (Flowable) fay.a(flowable);
        aVar.a(new c() {
            public final void c() {
                urr.this.a.a(urr.this.b.a((Consumer<? super T>) new $$Lambda$g4yYeb3nfGtidLilSifdtSLeYgs<Object>(urr.this), (Consumer<? super Throwable>) new $$Lambda$urr$HxXW092O0slGLGbF2epuZKGAr7w<Object>(urr.this)));
            }

            public final void a() {
                urr.this.a.a(Disposables.a());
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e(th, "Error while observing", new Object[0]);
    }
}
