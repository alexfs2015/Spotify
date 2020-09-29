package defpackage;

import android.app.Activity;

/* renamed from: iyt reason: default package */
public final class iyt implements wig<iys> {
    private final wzi<Activity> a;

    private iyt(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static iyt a(wzi<Activity> wzi) {
        return new iyt(wzi);
    }

    public final /* synthetic */ Object get() {
        return new iys((Activity) this.a.get());
    }
}
