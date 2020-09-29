package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: qym reason: default package */
public final class qym implements vua<qyl> {
    private final wlc<Activity> a;
    private final wlc<jvy> b;
    private final wlc<jrp> c;
    private final wlc<rnf> d;
    private final wlc<hvl> e;
    private final wlc<Scheduler> f;
    private final wlc<Scheduler> g;
    private final wlc<Scheduler> h;
    private final wlc<a> i;

    private qym(wlc<Activity> wlc, wlc<jvy> wlc2, wlc<jrp> wlc3, wlc<rnf> wlc4, wlc<hvl> wlc5, wlc<Scheduler> wlc6, wlc<Scheduler> wlc7, wlc<Scheduler> wlc8, wlc<a> wlc9) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
    }

    public static qym a(wlc<Activity> wlc, wlc<jvy> wlc2, wlc<jrp> wlc3, wlc<rnf> wlc4, wlc<hvl> wlc5, wlc<Scheduler> wlc6, wlc<Scheduler> wlc7, wlc<Scheduler> wlc8, wlc<a> wlc9) {
        qym qym = new qym(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return qym;
    }

    public final /* synthetic */ Object get() {
        qyl qyl = new qyl((Activity) this.a.get(), (jvy) this.b.get(), (jrp) this.c.get(), (rnf) this.d.get(), (hvl) this.e.get(), (Scheduler) this.f.get(), (Scheduler) this.g.get(), (Scheduler) this.h.get(), (a) this.i.get());
        return qyl;
    }
}
