package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Scheduler;

/* renamed from: ucl reason: default package */
public final class ucl implements vua<uck> {
    private final wlc<Context> a;
    private final wlc<uau> b;
    private final wlc<Scheduler> c;
    private final wlc<hec> d;
    private final wlc<kyj> e;
    private final wlc<NotificationManager> f;
    private final wlc<ToastieManager> g;
    private final wlc<ucs> h;

    private ucl(wlc<Context> wlc, wlc<uau> wlc2, wlc<Scheduler> wlc3, wlc<hec> wlc4, wlc<kyj> wlc5, wlc<NotificationManager> wlc6, wlc<ToastieManager> wlc7, wlc<ucs> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static ucl a(wlc<Context> wlc, wlc<uau> wlc2, wlc<Scheduler> wlc3, wlc<hec> wlc4, wlc<kyj> wlc5, wlc<NotificationManager> wlc6, wlc<ToastieManager> wlc7, wlc<ucs> wlc8) {
        ucl ucl = new ucl(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return ucl;
    }

    public final /* synthetic */ Object get() {
        uck uck = new uck((Context) this.a.get(), (uau) this.b.get(), (Scheduler) this.c.get(), (hec) this.d.get(), (kyj) this.e.get(), (NotificationManager) this.f.get(), (ToastieManager) this.g.get(), (ucs) this.h.get());
        return uck;
    }
}
