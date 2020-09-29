package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.io.Serializable;

/* renamed from: pvp reason: default package */
public final class pvp implements gvk {
    private final Scheduler b;
    private final uzi c;
    private final pvt d;
    /* access modifiers changed from: private */
    public final SerialDisposable e = new SerialDisposable();

    public pvp(Scheduler scheduler, final a aVar, uzi uzi, pvt pvt) {
        this.b = (Scheduler) fay.a(scheduler);
        this.c = (uzi) fay.a(uzi);
        this.d = (pvt) fay.a(pvt);
        aVar.a(new c() {
            public final void a() {
                pvp.this.e.a(Disposables.b());
            }

            public final void aP_() {
                aVar.b(this);
            }
        });
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String str = (String) fay.a(gzp.data().string("uri"));
        String str2 = (String) fay.a(gzp.data().string("playlistUri"));
        String string = gzp.data().string("trackUri");
        String str3 = fax.a(string) ? str : string;
        SerialDisposable serialDisposable = this.e;
        Completable a = this.c.a(str2).a(this.b);
        $$Lambda$pvp$_47uGtUV05jfzGvbIAEg8qm00J4 r1 = new $$Lambda$pvp$_47uGtUV05jfzGvbIAEg8qm00J4(this, str2, str3, str, guy);
        serialDisposable.a(a.a((Action) r1, (Consumer<? super Throwable>) new $$Lambda$pvp$jcPngXCL1utM1o0buLwwSWEa4m8<Object>(this, str, guy)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, guy guy) {
        this.d.handleCommand(pvt.a((String) Optional.c(jst.a(str).i(str2)).a(str3)), guy);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, guy guy, Throwable th) {
        Logger.e(th, "Failed to update on demand set.", new Object[0]);
        this.d.handleCommand(pvt.a(str), guy);
    }

    public static gzp a(String str, uim uim) {
        return haa.builder().a("addToOnDemandSetNavigateAndSaveToHistory").a("uri", (Serializable) fay.a(str)).a("playlistUri", (Serializable) fay.a(uim.a)).a("trackUri", uim.b).a();
    }
}
