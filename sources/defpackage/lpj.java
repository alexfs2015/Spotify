package defpackage;

import android.app.Activity;

/* renamed from: lpj reason: default package */
public final class lpj implements wig<wbn> {
    private final wzi<Activity> a;

    private lpj(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static lpj a(wzi<Activity> wzi) {
        return new lpj(wzi);
    }

    public final /* synthetic */ Object get() {
        return (wbn) wil.a(new wbn((Activity) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
