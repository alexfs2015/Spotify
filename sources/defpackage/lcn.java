package defpackage;

import android.app.Activity;

/* renamed from: lcn reason: default package */
public final class lcn implements wig<fqn> {
    private final wzi<Activity> a;

    private lcn(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static lcn a(wzi<Activity> wzi) {
        return new lcn(wzi);
    }

    public final /* synthetic */ Object get() {
        return (fqn) wil.a(fqo.a((Activity) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
