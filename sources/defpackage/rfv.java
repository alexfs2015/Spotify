package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.follow.FollowManager;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: rfv reason: default package */
public final class rfv {
    final CompositeDisposable a = new CompositeDisposable();
    private final rls b;
    private final FollowManager c;
    private final rep d;

    public rfv(rls rls, FollowManager followManager, rep rep, final a aVar) {
        this.b = rls;
        this.c = followManager;
        this.d = rep;
        aVar.a(new c() {
            public final void a() {
                rfv.this.a.c();
            }

            public final void aN_() {
                aVar.b(this);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, String str, FollowManager.a aVar) {
        this.c.a(aVar);
        if (aVar.d != z) {
            this.c.a(str, z);
        }
    }

    public final void a(String str, boolean z) {
        this.a.a(this.b.a(str).c(1).a(this.d.b()).a((Consumer<? super T>) new $$Lambda$rfv$firJ_KkKl8XzJbaA7aOAkgclXh0<Object>(this, z, str), (Consumer<? super Throwable>) $$Lambda$rfv$wSbjPWMtx76hm8_W8fkR3bWsWQE.INSTANCE));
    }
}
