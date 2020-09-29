package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: kzh reason: default package */
public final class kzh implements vua<Bundle> {
    private final wlc<Activity> a;

    private kzh(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static kzh a(wlc<Activity> wlc) {
        return new kzh(wlc);
    }

    public static Bundle a(Activity activity) {
        return (Bundle) vuf.a(CC.a(activity), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Activity) this.a.get());
    }
}
