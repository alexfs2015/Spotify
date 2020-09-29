package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: qsm reason: default package */
public final class qsm implements wig<qsl> {
    private final wzi<Boolean> a;
    private final wzi<Boolean> b;
    private final wzi<Integer> c;
    private final wzi<a> d;
    private final wzi<Scheduler> e;
    private final wzi<qsz> f;
    private final wzi<Observable<lbg>> g;
    private final wzi<qrj> h;
    private final wzi<qrg> i;
    private final wzi<qte> j;
    private final wzi<jlz> k;
    private final wzi<qqc> l;
    private final wzi<qqi> m;

    private qsm(wzi<Boolean> wzi, wzi<Boolean> wzi2, wzi<Integer> wzi3, wzi<a> wzi4, wzi<Scheduler> wzi5, wzi<qsz> wzi6, wzi<Observable<lbg>> wzi7, wzi<qrj> wzi8, wzi<qrg> wzi9, wzi<qte> wzi10, wzi<jlz> wzi11, wzi<qqc> wzi12, wzi<qqi> wzi13) {
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
        this.k = wzi11;
        this.l = wzi12;
        this.m = wzi13;
    }

    public static qsm a(wzi<Boolean> wzi, wzi<Boolean> wzi2, wzi<Integer> wzi3, wzi<a> wzi4, wzi<Scheduler> wzi5, wzi<qsz> wzi6, wzi<Observable<lbg>> wzi7, wzi<qrj> wzi8, wzi<qrg> wzi9, wzi<qte> wzi10, wzi<jlz> wzi11, wzi<qqc> wzi12, wzi<qqi> wzi13) {
        qsm qsm = new qsm(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10, wzi11, wzi12, wzi13);
        return qsm;
    }

    public final /* synthetic */ Object get() {
        qsl qsl = new qsl(((Boolean) this.a.get()).booleanValue(), ((Boolean) this.b.get()).booleanValue(), ((Integer) this.c.get()).intValue(), (a) this.d.get(), (Scheduler) this.e.get(), (qsz) this.f.get(), (Observable) this.g.get(), (qrj) this.h.get(), (qrg) this.i.get(), (qte) this.j.get(), (jlz) this.k.get(), (qqc) this.l.get(), (qqi) this.m.get());
        return qsl;
    }
}
