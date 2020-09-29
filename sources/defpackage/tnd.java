package defpackage;

import android.app.Activity;

/* renamed from: tnd reason: default package */
public final class tnd implements wig<tnc> {
    private final wzi<Activity> a;
    private final wzi<tmu> b;

    private tnd(wzi<Activity> wzi, wzi<tmu> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tnd a(wzi<Activity> wzi, wzi<tmu> wzi2) {
        return new tnd(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tnc((Activity) this.a.get(), (tmu) this.b.get());
    }
}
