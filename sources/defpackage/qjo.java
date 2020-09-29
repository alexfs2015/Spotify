package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: qjo reason: default package */
public final class qjo implements vua<qjn> {
    private final wlc<qkq> a;
    private final wlc<qja> b;
    private final wlc<Scheduler> c;
    private final wlc<qir> d;
    private final wlc<a> e;

    private qjo(wlc<qkq> wlc, wlc<qja> wlc2, wlc<Scheduler> wlc3, wlc<qir> wlc4, wlc<a> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static qjo a(wlc<qkq> wlc, wlc<qja> wlc2, wlc<Scheduler> wlc3, wlc<qir> wlc4, wlc<a> wlc5) {
        qjo qjo = new qjo(wlc, wlc2, wlc3, wlc4, wlc5);
        return qjo;
    }

    public final /* synthetic */ Object get() {
        qjn qjn = new qjn((qkq) this.a.get(), (qja) this.b.get(), (Scheduler) this.c.get(), (qir) this.d.get(), (a) this.e.get());
        return qjn;
    }
}
