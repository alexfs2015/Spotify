package defpackage;

import android.app.Activity;

/* renamed from: pwy reason: default package */
public final class pwy implements vua<qbm> {
    private final wlc<Activity> a;
    private final wlc<Boolean> b;

    private pwy(wlc<Activity> wlc, wlc<Boolean> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pwy a(wlc<Activity> wlc, wlc<Boolean> wlc2) {
        return new pwy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        Object obj;
        Activity activity = (Activity) this.a.get();
        if (((Boolean) this.b.get()).booleanValue()) {
            obj = new qbn(activity);
        } else {
            obj = new qbo();
        }
        return (qbm) vuf.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
