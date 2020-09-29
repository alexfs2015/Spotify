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

/* renamed from: qel reason: default package */
public final class qel implements gxk {
    private final Scheduler b;
    private final vll c;
    private final qep d;
    /* access modifiers changed from: private */
    public final SerialDisposable e = new SerialDisposable();

    public qel(Scheduler scheduler, final a aVar, vll vll, qep qep) {
        this.b = (Scheduler) fbp.a(scheduler);
        this.c = (vll) fbp.a(vll);
        this.d = (qep) fbp.a(qep);
        aVar.a(new c() {
            public final void a() {
                qel.this.e.a(Disposables.b());
            }

            public final void aN_() {
                aVar.b(this);
            }
        });
    }

    public static hci a(String str, uua uua) {
        return hct.builder().a("addToOnDemandSetNavigateAndSaveToHistory").a("uri", (Serializable) fbp.a(str)).a("playlistUri", (Serializable) fbp.a(uua.a)).a("trackUri", uua.b).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, gwy gwy, Throwable th) {
        Logger.e(th, "Failed to update on demand set.", new Object[0]);
        this.d.handleCommand(qep.a(str), gwy);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, gwy gwy) {
        String str4;
        jva a = jva.a(str);
        int i = defpackage.jva.AnonymousClass1.a[a.b.ordinal()];
        if (i == 1 || i == 4 || i == 6 || i == 7) {
            StringBuilder sb = new StringBuilder(a.q());
            sb.append(':');
            sb.append("play:");
            sb.append(str2.replace("spotify:", ""));
            str4 = sb.toString();
        } else {
            str4 = a.h();
        }
        this.d.handleCommand(qep.a((String) Optional.c(str4).a(str3)), gwy);
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String str = (String) fbp.a(hci.data().string("uri"));
        String str2 = (String) fbp.a(hci.data().string("playlistUri"));
        String string = hci.data().string("trackUri");
        String str3 = fbo.a(string) ? str : string;
        SerialDisposable serialDisposable = this.e;
        Completable a = this.c.a(str2).a(this.b);
        $$Lambda$qel$1mvpHNWRaZRuG3hSftUQOdc1rZE r1 = new $$Lambda$qel$1mvpHNWRaZRuG3hSftUQOdc1rZE(this, str2, str3, str, gwy);
        serialDisposable.a(a.a((Action) r1, (Consumer<? super Throwable>) new $$Lambda$qel$nYy9yPeQRvGqpszrsTzjq_PafTo<Object>(this, str, gwy)));
    }
}
