package defpackage;

import android.app.Activity;

/* renamed from: vyb reason: default package */
public final class vyb implements wig<wbn> {
    private final wzi<Activity> a;

    private vyb(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static vyb a(wzi<Activity> wzi) {
        return new vyb(wzi);
    }

    public final /* synthetic */ Object get() {
        return (wbn) wil.a(new wbn((Activity) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
