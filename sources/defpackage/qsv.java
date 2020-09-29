package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: qsv reason: default package */
public final class qsv implements wig<qsu> {
    private final wzi<qrb> a;
    private final wzi<a> b;
    private final wzi<Scheduler> c;
    private final wzi<qru> d;
    private final wzi<qry> e;
    private final wzi<qrg> f;
    private final wzi<qrj> g;

    private qsv(wzi<qrb> wzi, wzi<a> wzi2, wzi<Scheduler> wzi3, wzi<qru> wzi4, wzi<qry> wzi5, wzi<qrg> wzi6, wzi<qrj> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static qsv a(wzi<qrb> wzi, wzi<a> wzi2, wzi<Scheduler> wzi3, wzi<qru> wzi4, wzi<qry> wzi5, wzi<qrg> wzi6, wzi<qrj> wzi7) {
        qsv qsv = new qsv(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return qsv;
    }

    public final /* synthetic */ Object get() {
        qsu qsu = new qsu(wif.b(this.a), (a) this.b.get(), (Scheduler) this.c.get(), (qru) this.d.get(), (qry) this.e.get(), (qrg) this.f.get(), (qrj) this.g.get());
        return qsu;
    }
}
