package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: qsx reason: default package */
public final class qsx implements wig<qsw> {
    private final wzi<qrb> a;
    private final wzi<a> b;
    private final wzi<Scheduler> c;
    private final wzi<qsj> d;
    private final wzi<qrg> e;
    private final wzi<qrj> f;

    private qsx(wzi<qrb> wzi, wzi<a> wzi2, wzi<Scheduler> wzi3, wzi<qsj> wzi4, wzi<qrg> wzi5, wzi<qrj> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static qsx a(wzi<qrb> wzi, wzi<a> wzi2, wzi<Scheduler> wzi3, wzi<qsj> wzi4, wzi<qrg> wzi5, wzi<qrj> wzi6) {
        qsx qsx = new qsx(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return qsx;
    }

    public final /* synthetic */ Object get() {
        qsw qsw = new qsw(wif.b(this.a), (a) this.b.get(), (Scheduler) this.c.get(), (qsj) this.d.get(), (qrg) this.e.get(), (qrj) this.f.get());
        return qsw;
    }
}
