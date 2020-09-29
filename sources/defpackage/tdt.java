package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.mobile.android.waze.model.WazeBannerModel;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: tdt reason: default package */
public final class tdt {
    final kcv a;
    final CompositeDisposable b = new CompositeDisposable();
    final kda c;
    final kdl d;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(WazeBannerModel wazeBannerModel) {
    }

    public tdt(a aVar, kcv kcv, kda kda, kdl kdl) {
        this.a = kcv;
        this.c = kda;
        this.d = kdl;
        aVar.a(new c() {
            public final void e() {
                Logger.c("WazeInteractor has resumed.", new Object[0]);
                tdt.this.b.a(tdt.this.a.a().a((Consumer<? super T>) new $$Lambda$tdt$km8nc0pPMSPf96C0epVxTxeWU<Object>(tdt.this), (Consumer<? super Throwable>) $$Lambda$tdt$8Fjepg5ibCbnGIjkPziDJ5SPmY.INSTANCE));
                tdt tdt = tdt.this;
                if (tdt.a()) {
                    kda kda = tdt.c;
                    Logger.c("Start WazeService by ping", new Object[0]);
                    Intent a2 = kda.a(kda.a);
                    a2.setAction("com.spotify.music.internal.service.waze.PING");
                    kda.b.a(kda.a, a2, "WazeLauncher", new Object[0]);
                }
            }

            public final void f() {
                Logger.c("WazeInteractor has paused.", new Object[0]);
                tdt.this.b.c();
            }
        });
    }

    public final boolean a() {
        return this.d.b() && this.d.c() && this.d.d();
    }
}
