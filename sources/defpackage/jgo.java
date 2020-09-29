package defpackage;

import android.app.Activity;

/* renamed from: jgo reason: default package */
public final class jgo implements wig<jgn> {
    private final wzi<jig> a;
    private final wzi<jgs> b;
    private final wzi<jui> c;
    private final wzi<Activity> d;

    private jgo(wzi<jig> wzi, wzi<jgs> wzi2, wzi<jui> wzi3, wzi<Activity> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static jgo a(wzi<jig> wzi, wzi<jgs> wzi2, wzi<jui> wzi3, wzi<Activity> wzi4) {
        return new jgo(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new jgn((jig) this.a.get(), (jgs) this.b.get(), (jui) this.c.get(), (Activity) this.d.get());
    }
}
