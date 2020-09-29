package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;
import java.text.DateFormat;

/* renamed from: ohw reason: default package */
public final class ohw implements wig<ohv> {
    private final wzi<AgeValidator> a;
    private final wzi<Scheduler> b;
    private final wzi<oji> c;
    private final wzi<uun> d;
    private final wzi<ohk> e;
    private final wzi<kk> f;
    private final wzi<a> g;
    private final wzi<ftm> h;
    private final wzi<gcb> i;
    private final wzi<DateFormat> j;

    private ohw(wzi<AgeValidator> wzi, wzi<Scheduler> wzi2, wzi<oji> wzi3, wzi<uun> wzi4, wzi<ohk> wzi5, wzi<kk> wzi6, wzi<a> wzi7, wzi<ftm> wzi8, wzi<gcb> wzi9, wzi<DateFormat> wzi10) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
    }

    public static ohw a(wzi<AgeValidator> wzi, wzi<Scheduler> wzi2, wzi<oji> wzi3, wzi<uun> wzi4, wzi<ohk> wzi5, wzi<kk> wzi6, wzi<a> wzi7, wzi<ftm> wzi8, wzi<gcb> wzi9, wzi<DateFormat> wzi10) {
        ohw ohw = new ohw(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10);
        return ohw;
    }

    public final /* synthetic */ Object get() {
        ohv ohv = new ohv((AgeValidator) this.a.get(), (Scheduler) this.b.get(), (oji) this.c.get(), (uun) this.d.get(), (ohk) this.e.get(), (kk) this.f.get(), (a) this.g.get(), (ftm) this.h.get(), (gcb) this.i.get(), (DateFormat) this.j.get());
        return ohv;
    }
}
