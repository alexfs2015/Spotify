package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: qfv reason: default package */
public final class qfv implements vua<qfu> {
    private final wlc<qfw> a;
    private final wlc<Scheduler> b;
    private final wlc<qfy> c;
    private final wlc<qfs> d;
    private final wlc<ujc> e;
    private final wlc<a> f;

    private qfv(wlc<qfw> wlc, wlc<Scheduler> wlc2, wlc<qfy> wlc3, wlc<qfs> wlc4, wlc<ujc> wlc5, wlc<a> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static qfv a(wlc<qfw> wlc, wlc<Scheduler> wlc2, wlc<qfy> wlc3, wlc<qfs> wlc4, wlc<ujc> wlc5, wlc<a> wlc6) {
        qfv qfv = new qfv(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return qfv;
    }

    public final /* synthetic */ Object get() {
        qfu qfu = new qfu((qfw) this.a.get(), (Scheduler) this.b.get(), (qfy) this.c.get(), (qfs) this.d.get(), (ujc) this.e.get(), (a) this.f.get());
        return qfu;
    }
}
