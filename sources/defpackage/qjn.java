package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;

/* renamed from: qjn reason: default package */
public final class qjn implements qjs {
    final CompositeDisposable a = new CompositeDisposable();
    private final qkq b;
    private final qja c;
    private final Scheduler d;
    private final qir e;

    public qjn(qkq qkq, qja qja, Scheduler scheduler, qir qir, a aVar) {
        this.b = qkq;
        this.c = qja;
        this.d = scheduler;
        this.e = qir;
        aVar.a(new c() {
            public final void a() {
                super.a();
                qjn.this.a.c();
            }
        });
    }
}
