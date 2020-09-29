package defpackage;

import android.app.Activity;

/* renamed from: kze reason: default package */
public final class kze implements vua<fpt> {
    private final wlc<Activity> a;

    private kze(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static kze a(wlc<Activity> wlc) {
        return new kze(wlc);
    }

    public final /* synthetic */ Object get() {
        return (fpt) vuf.a(fpu.a((Activity) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
