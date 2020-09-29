package defpackage;

import android.app.Activity;

/* renamed from: jlo reason: default package */
public final class jlo implements wig<jln> {
    private final wzi<Activity> a;

    private jlo(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static jlo a(wzi<Activity> wzi) {
        return new jlo(wzi);
    }

    public final /* synthetic */ Object get() {
        return new jln((Activity) this.a.get());
    }
}
