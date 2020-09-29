package defpackage;

import android.app.Activity;

/* renamed from: ulc reason: default package */
public final class ulc implements wig<xir> {
    private final wzi<Activity> a;

    private ulc(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static ulc a(wzi<Activity> wzi) {
        return new ulc(wzi);
    }

    public final /* synthetic */ Object get() {
        return (xir) wil.a(CC.a((Activity) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
