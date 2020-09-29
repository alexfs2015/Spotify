package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;
import java.text.DateFormat;

/* renamed from: qfr reason: default package */
public final class qfr implements vua<qfq> {
    private final wlc<AgeValidator> a;
    private final wlc<Scheduler> b;
    private final wlc<qfy> c;
    private final wlc<ujc> d;
    private final wlc<qfs> e;
    private final wlc<kf> f;
    private final wlc<a> g;
    private final wlc<qfz> h;
    private final wlc<gbd> i;
    private final wlc<DateFormat> j;

    private qfr(wlc<AgeValidator> wlc, wlc<Scheduler> wlc2, wlc<qfy> wlc3, wlc<ujc> wlc4, wlc<qfs> wlc5, wlc<kf> wlc6, wlc<a> wlc7, wlc<qfz> wlc8, wlc<gbd> wlc9, wlc<DateFormat> wlc10) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
    }

    public static qfr a(wlc<AgeValidator> wlc, wlc<Scheduler> wlc2, wlc<qfy> wlc3, wlc<ujc> wlc4, wlc<qfs> wlc5, wlc<kf> wlc6, wlc<a> wlc7, wlc<qfz> wlc8, wlc<gbd> wlc9, wlc<DateFormat> wlc10) {
        qfr qfr = new qfr(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10);
        return qfr;
    }

    public final /* synthetic */ Object get() {
        qfq qfq = new qfq((AgeValidator) this.a.get(), (Scheduler) this.b.get(), (qfy) this.c.get(), (ujc) this.d.get(), (qfs) this.e.get(), (kf) this.f.get(), (a) this.g.get(), (qfz) this.h.get(), (gbd) this.i.get(), (DateFormat) this.j.get());
        return qfq;
    }
}
