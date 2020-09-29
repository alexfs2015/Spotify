package defpackage;

import android.app.Activity;

/* renamed from: pfn reason: default package */
public final class pfn implements vua<gur> {
    private final wlc<gum> a;
    private final wlc<Activity> b;

    private pfn(wlc<gum> wlc, wlc<Activity> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pfn a(wlc<gum> wlc, wlc<Activity> wlc2) {
        return new pfn(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (gur) vuf.a(a.a().a((gum) this.a.get(), (Activity) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
