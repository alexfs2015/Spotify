package defpackage;

import io.reactivex.Scheduler;

/* renamed from: qyn reason: default package */
public final class qyn implements wig<qym> {
    private final wzi<qyg> a;
    private final wzi<qye> b;
    private final wzi<Boolean> c;
    private final wzi<Scheduler> d;
    private final wzi<qyi> e;

    private qyn(wzi<qyg> wzi, wzi<qye> wzi2, wzi<Boolean> wzi3, wzi<Scheduler> wzi4, wzi<qyi> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static qyn a(wzi<qyg> wzi, wzi<qye> wzi2, wzi<Boolean> wzi3, wzi<Scheduler> wzi4, wzi<qyi> wzi5) {
        qyn qyn = new qyn(wzi, wzi2, wzi3, wzi4, wzi5);
        return qyn;
    }

    public final /* synthetic */ Object get() {
        qym qym = new qym((qyg) this.a.get(), (qye) this.b.get(), ((Boolean) this.c.get()).booleanValue(), (Scheduler) this.d.get(), (qyi) this.e.get());
        return qym;
    }
}
