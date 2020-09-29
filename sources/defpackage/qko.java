package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: qko reason: default package */
public final class qko implements vua<qkn> {
    private final wlc<qir> a;
    private final wlc<a> b;
    private final wlc<Scheduler> c;
    private final wlc<qka> d;
    private final wlc<qix> e;
    private final wlc<qja> f;

    private qko(wlc<qir> wlc, wlc<a> wlc2, wlc<Scheduler> wlc3, wlc<qka> wlc4, wlc<qix> wlc5, wlc<qja> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static qko a(wlc<qir> wlc, wlc<a> wlc2, wlc<Scheduler> wlc3, wlc<qka> wlc4, wlc<qix> wlc5, wlc<qja> wlc6) {
        qko qko = new qko(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return qko;
    }

    public final /* synthetic */ Object get() {
        qkn qkn = new qkn(vtz.b(this.a), (a) this.b.get(), (Scheduler) this.c.get(), (qka) this.d.get(), (qix) this.e.get(), (qja) this.f.get());
        return qkn;
    }
}
