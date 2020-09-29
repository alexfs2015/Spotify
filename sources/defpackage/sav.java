package defpackage;

import android.app.Activity;

/* renamed from: sav reason: default package */
public final class sav implements wig<saq> {
    private final wzi<sar> a;
    private final wzi<Activity> b;

    private sav(wzi<sar> wzi, wzi<Activity> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sav a(wzi<sar> wzi, wzi<Activity> wzi2) {
        return new sav(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (saq) wil.a(((sar) this.a.get()).a(((Activity) this.b.get()).getClass().getSimpleName()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
