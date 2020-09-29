package defpackage;

import android.app.Activity;

/* renamed from: kot reason: default package */
public final class kot implements wig<kos> {
    private final wzi<Activity> a;
    private final wzi<szl> b;
    private final wzi<kyt> c;

    private kot(wzi<Activity> wzi, wzi<szl> wzi2, wzi<kyt> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static kot a(wzi<Activity> wzi, wzi<szl> wzi2, wzi<kyt> wzi3) {
        return new kot(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new kos((Activity) this.a.get(), (szl) this.b.get(), (kyt) this.c.get());
    }
}
