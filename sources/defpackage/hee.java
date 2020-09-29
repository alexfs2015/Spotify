package defpackage;

import android.app.Activity;

/* renamed from: hee reason: default package */
public final class hee implements wig<hed> {
    private final wzi<Activity> a;
    private final wzi<szl> b;

    private hee(wzi<Activity> wzi, wzi<szl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hee a(wzi<Activity> wzi, wzi<szl> wzi2) {
        return new hee(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hed((Activity) this.a.get(), (szl) this.b.get());
    }
}
