package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;

/* renamed from: qrw reason: default package */
public final class qrw implements qsb {
    final CompositeDisposable a = new CompositeDisposable();
    private final qsz b;
    private final qrj c;
    private final Scheduler d;
    private final qrb e;

    public qrw(qsz qsz, qrj qrj, Scheduler scheduler, qrb qrb, a aVar) {
        this.b = qsz;
        this.c = qrj;
        this.d = scheduler;
        this.e = qrb;
        aVar.a(new c() {
            public final void a() {
                super.a();
                qrw.this.a.c();
            }
        });
    }
}
