package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.mobile.android.waze.model.WazeBannerModel;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: tod reason: default package */
public final class tod {
    final kew a;
    final CompositeDisposable b = new CompositeDisposable();
    final kfb c;
    final kfm d;

    public tod(a aVar, kew kew, kfb kfb, kfm kfm) {
        this.a = kew;
        this.c = kfb;
        this.d = kfm;
        aVar.a(new c() {
            public final void e() {
                Logger.c("WazeInteractor has resumed.", new Object[0]);
                tod.this.b.a(tod.this.a.a().a((Consumer<? super T>) new $$Lambda$tod$fxv5D4oYmDXgmTBrpHOHCH88LA<Object>(tod.this), (Consumer<? super Throwable>) $$Lambda$tod$KXtnrEzAkwn0aumRd_KuQ8h2wx4.INSTANCE));
                tod tod = tod.this;
                if (tod.a()) {
                    kfb kfb = tod.c;
                    Logger.c("Start WazeService by ping", new Object[0]);
                    Intent a2 = kfb.a(kfb.a);
                    a2.setAction("com.spotify.music.internal.service.waze.PING");
                    kfb.b.a(kfb.a, a2, "WazeLauncher", new Object[0]);
                }
            }

            public final void f() {
                Logger.c("WazeInteractor has paused.", new Object[0]);
                tod.this.b.c();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(WazeBannerModel wazeBannerModel) {
    }

    public final boolean a() {
        return this.d.b() && this.d.c() && this.d.d();
    }
}
