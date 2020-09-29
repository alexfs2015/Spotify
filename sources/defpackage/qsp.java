package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.follow.FollowManager;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: qsp reason: default package */
public final class qsp implements qsr {
    final CompositeDisposable a = new CompositeDisposable();
    private final FollowManager b;
    private final rls c;
    private final qqc d;
    private final Scheduler e;

    public qsp(FollowManager followManager, rls rls, qqc qqc, Scheduler scheduler, a aVar) {
        this.b = followManager;
        this.c = rls;
        this.d = qqc;
        this.e = scheduler;
        aVar.a(new c() {
            public final void a() {
                super.a();
                qsp.this.a.c();
            }
        });
    }

    private void a(String str, boolean z) {
        this.a.a(this.c.a(str).c(1).a(this.e).a((Consumer<? super T>) new $$Lambda$qsp$ksFBZAqMiP2GPAav1u1rywuWy8<Object>(this, str, z), (Consumer<? super Throwable>) $$Lambda$qsp$L7Y8MxmqNU0bguoLDFoU5_aBy0.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, boolean z, FollowManager.a aVar) {
        this.b.a(aVar);
        if (aVar.d != z) {
            this.b.a(str, z);
        }
    }

    public final void a(String str) {
        this.d.b(str);
        a(str, true);
    }

    public final void b(String str) {
        this.d.c(str);
        a(str, false);
    }
}
