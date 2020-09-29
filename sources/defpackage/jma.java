package defpackage;

import android.app.Activity;

/* renamed from: jma reason: default package */
public final class jma implements wig<jlz> {
    private final wzi<Activity> a;

    private jma(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static jma a(wzi<Activity> wzi) {
        return new jma(wzi);
    }

    public final /* synthetic */ Object get() {
        return new jlz((Activity) this.a.get());
    }
}
