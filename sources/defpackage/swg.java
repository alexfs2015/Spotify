package defpackage;

import android.app.Activity;
import android.content.Intent;

/* renamed from: swg reason: default package */
public final class swg implements wig<gcp<Intent>> {
    private final wzi<Activity> a;

    public static gcp<Intent> a(Activity activity) {
        return (gcp) wil.a(CC.a(activity), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Activity) this.a.get());
    }
}
