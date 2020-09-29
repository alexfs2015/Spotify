package defpackage;

import android.app.ActivityManager;

/* renamed from: fps reason: default package */
public final class fps implements wig<fpr> {
    private final wzi<ActivityManager> a;
    private final wzi<fpw> b;
    private final wzi<fpt> c;

    public static fpr a(ActivityManager activityManager, Object obj, Object obj2) {
        return new fpr(activityManager, (fpw) obj, (fpt) obj2);
    }

    public final /* synthetic */ Object get() {
        return new fpr((ActivityManager) this.a.get(), (fpw) this.b.get(), (fpt) this.c.get());
    }
}
