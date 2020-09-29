package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: rhb reason: default package */
public final class rhb implements wig<rha> {
    private final wzi<Activity> a;
    private final wzi<jyg> b;
    private final wzi<jtz> c;
    private final wzi<rwl> d;
    private final wzi<hxx> e;
    private final wzi<Scheduler> f;
    private final wzi<Scheduler> g;
    private final wzi<a> h;

    private rhb(wzi<Activity> wzi, wzi<jyg> wzi2, wzi<jtz> wzi3, wzi<rwl> wzi4, wzi<hxx> wzi5, wzi<Scheduler> wzi6, wzi<Scheduler> wzi7, wzi<a> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static rhb a(wzi<Activity> wzi, wzi<jyg> wzi2, wzi<jtz> wzi3, wzi<rwl> wzi4, wzi<hxx> wzi5, wzi<Scheduler> wzi6, wzi<Scheduler> wzi7, wzi<a> wzi8) {
        rhb rhb = new rhb(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return rhb;
    }

    public final /* synthetic */ Object get() {
        rha rha = new rha((Activity) this.a.get(), (jyg) this.b.get(), (jtz) this.c.get(), (rwl) this.d.get(), (hxx) this.e.get(), (Scheduler) this.f.get(), (Scheduler) this.g.get(), (a) this.h.get());
        return rha;
    }
}
