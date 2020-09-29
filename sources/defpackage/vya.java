package defpackage;

import android.app.Activity;

/* renamed from: vya reason: default package */
public final class vya implements wig<waq> {
    private final wzi<Activity> a;

    private vya(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static vya a(wzi<Activity> wzi) {
        return new vya(wzi);
    }

    public final /* synthetic */ Object get() {
        return (waq) wil.a(new waq((kf) ((Activity) this.a.get()), bso.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
