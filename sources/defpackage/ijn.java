package defpackage;

import android.app.Application;

/* renamed from: ijn reason: default package */
public final class ijn implements wig<ijm> {
    private final wzi<ijp> a;
    private final wzi<ijj> b;
    private final wzi<Application> c;

    private ijn(wzi<ijp> wzi, wzi<ijj> wzi2, wzi<Application> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ijn a(wzi<ijp> wzi, wzi<ijj> wzi2, wzi<Application> wzi3) {
        return new ijn(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ijm((ijp) this.a.get(), (ijj) this.b.get(), (Application) this.c.get());
    }
}
