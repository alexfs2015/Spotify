package defpackage;

import android.app.Activity;

/* renamed from: lyo reason: default package */
public final class lyo implements wig<lyn> {
    private final wzi<Activity> a;
    private final wzi<uvu> b;
    private final wzi<uxj> c;
    private final wzi<fqn> d;

    private lyo(wzi<Activity> wzi, wzi<uvu> wzi2, wzi<uxj> wzi3, wzi<fqn> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static lyo a(wzi<Activity> wzi, wzi<uvu> wzi2, wzi<uxj> wzi3, wzi<fqn> wzi4) {
        return new lyo(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new lyn((Activity) this.a.get(), (uvu) this.b.get(), (uxj) this.c.get(), (fqn) this.d.get());
    }
}
