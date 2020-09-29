package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Scheduler;

/* renamed from: upg reason: default package */
public final class upg implements wig<upf> {
    private final wzi<Context> a;
    private final wzi<unp> b;
    private final wzi<Scheduler> c;
    private final wzi<hgy> d;
    private final wzi<lbs> e;
    private final wzi<NotificationManager> f;
    private final wzi<ToastieManager> g;
    private final wzi<upn> h;

    private upg(wzi<Context> wzi, wzi<unp> wzi2, wzi<Scheduler> wzi3, wzi<hgy> wzi4, wzi<lbs> wzi5, wzi<NotificationManager> wzi6, wzi<ToastieManager> wzi7, wzi<upn> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static upg a(wzi<Context> wzi, wzi<unp> wzi2, wzi<Scheduler> wzi3, wzi<hgy> wzi4, wzi<lbs> wzi5, wzi<NotificationManager> wzi6, wzi<ToastieManager> wzi7, wzi<upn> wzi8) {
        upg upg = new upg(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return upg;
    }

    public final /* synthetic */ Object get() {
        upf upf = new upf((Context) this.a.get(), (unp) this.b.get(), (Scheduler) this.c.get(), (hgy) this.d.get(), (lbs) this.e.get(), (NotificationManager) this.f.get(), (ToastieManager) this.g.get(), (upn) this.h.get());
        return upf;
    }
}
