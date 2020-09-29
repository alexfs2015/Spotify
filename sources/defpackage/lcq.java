package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: lcq reason: default package */
public final class lcq implements wig<Bundle> {
    private final wzi<Activity> a;

    private lcq(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static Bundle a(Activity activity) {
        return (Bundle) wil.a(CC.a(activity), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static lcq a(wzi<Activity> wzi) {
        return new lcq(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((Activity) this.a.get());
    }
}
