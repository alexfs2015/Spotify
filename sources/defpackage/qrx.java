package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: qrx reason: default package */
public final class qrx implements wig<qrw> {
    private final wzi<qsz> a;
    private final wzi<qrj> b;
    private final wzi<Scheduler> c;
    private final wzi<qrb> d;
    private final wzi<a> e;

    private qrx(wzi<qsz> wzi, wzi<qrj> wzi2, wzi<Scheduler> wzi3, wzi<qrb> wzi4, wzi<a> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static qrx a(wzi<qsz> wzi, wzi<qrj> wzi2, wzi<Scheduler> wzi3, wzi<qrb> wzi4, wzi<a> wzi5) {
        qrx qrx = new qrx(wzi, wzi2, wzi3, wzi4, wzi5);
        return qrx;
    }

    public final /* synthetic */ Object get() {
        qrw qrw = new qrw((qsz) this.a.get(), (qrj) this.b.get(), (Scheduler) this.c.get(), (qrb) this.d.get(), (a) this.e.get());
        return qrw;
    }
}
