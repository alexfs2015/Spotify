package defpackage;

import android.app.Application;

/* renamed from: obu reason: default package */
public final class obu implements wig<obt> {
    private final wzi<Application> a;
    private final wzi<seq> b;
    private final wzi<obs> c;

    private obu(wzi<Application> wzi, wzi<seq> wzi2, wzi<obs> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static obu a(wzi<Application> wzi, wzi<seq> wzi2, wzi<obs> wzi3) {
        return new obu(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new obt((Application) this.a.get(), (seq) this.b.get(), (obs) this.c.get());
    }
}
