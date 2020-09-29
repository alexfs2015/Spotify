package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.follow.FollowManager;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: qxg reason: default package */
public final class qxg {
    final CompositeDisposable a = new CompositeDisposable();
    private final rcu b;
    private final FollowManager c;
    private final qwa d;

    public qxg(rcu rcu, FollowManager followManager, qwa qwa, final a aVar) {
        this.b = rcu;
        this.c = followManager;
        this.d = qwa;
        aVar.a(new c() {
            public final void a() {
                qxg.this.a.c();
            }

            public final void aP_() {
                aVar.b(this);
            }
        });
    }

    public final void a(String str, boolean z) {
        this.a.a(this.b.a(str).c(1).a(this.d.b()).a((Consumer<? super T>) new $$Lambda$qxg$o2OTT0Iuu1VE5sdOtMxrta5ni0<Object>(this, z, str), (Consumer<? super Throwable>) $$Lambda$qxg$AB4jh8Pd47ve5Kn2_Anbng4NX0Y.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, String str, FollowManager.a aVar) {
        this.c.a(aVar);
        if (aVar.d != z) {
            this.c.a(str, z);
        }
    }
}
