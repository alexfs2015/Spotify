package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.follow.FollowManager;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: qkg reason: default package */
public final class qkg implements qki {
    final CompositeDisposable a = new CompositeDisposable();
    private final FollowManager b;
    private final rcu c;
    private final qho d;
    private final Scheduler e;

    public qkg(FollowManager followManager, rcu rcu, qho qho, Scheduler scheduler, a aVar) {
        this.b = followManager;
        this.c = rcu;
        this.d = qho;
        this.e = scheduler;
        aVar.a(new c() {
            public final void a() {
                super.a();
                qkg.this.a.c();
            }
        });
    }

    public final void a(String str) {
        this.d.b(str);
        a(str, true);
    }

    public final void b(String str) {
        this.d.c(str);
        a(str, false);
    }

    private void a(String str, boolean z) {
        this.a.a(this.c.a(str).c(1).a(this.e).a((Consumer<? super T>) new $$Lambda$qkg$TVkrkxUMZRiqawpoV1ygvrs4SV4<Object>(this, str, z), (Consumer<? super Throwable>) $$Lambda$qkg$K_850ALxHiOQ5uaIdjN4DZbGeA.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, boolean z, FollowManager.a aVar) {
        this.b.a(aVar);
        if (aVar.d != z) {
            this.b.a(str, z);
        }
    }
}
