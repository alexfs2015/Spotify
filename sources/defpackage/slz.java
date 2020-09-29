package defpackage;

import android.app.Activity;
import android.content.Intent;

/* renamed from: slz reason: default package */
public final class slz implements vua<gbr<Intent>> {
    private final wlc<Activity> a;

    public static gbr<Intent> a(Activity activity) {
        return (gbr) vuf.a(CC.a(activity), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Activity) this.a.get());
    }
}
