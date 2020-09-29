package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: quc reason: default package */
public final class quc implements wig<qub> {
    private final wzi<qud> a;
    private final wzi<qqi> b;
    private final wzi<Scheduler> c;
    private final wzi<qtx> d;
    private final wzi<a> e;

    private quc(wzi<qud> wzi, wzi<qqi> wzi2, wzi<Scheduler> wzi3, wzi<qtx> wzi4, wzi<a> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static quc a(wzi<qud> wzi, wzi<qqi> wzi2, wzi<Scheduler> wzi3, wzi<qtx> wzi4, wzi<a> wzi5) {
        quc quc = new quc(wzi, wzi2, wzi3, wzi4, wzi5);
        return quc;
    }

    public final /* synthetic */ Object get() {
        qub qub = new qub((qud) this.a.get(), (qqi) this.b.get(), (Scheduler) this.c.get(), (qtx) this.d.get(), (a) this.e.get());
        return qub;
    }
}
