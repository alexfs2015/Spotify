package defpackage;

import android.app.Activity;

/* renamed from: pmz reason: default package */
public final class pmz implements wig<gwr> {
    private final wzi<gwm> a;
    private final wzi<Activity> b;

    private pmz(wzi<gwm> wzi, wzi<Activity> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pmz a(wzi<gwm> wzi, wzi<Activity> wzi2) {
        return new pmz(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (gwr) wil.a(a.a().a((gwm) this.a.get(), (Activity) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
