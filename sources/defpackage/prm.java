package defpackage;

import android.os.Bundle;

/* renamed from: prm reason: default package */
public final class prm implements vua<prk> {
    private final wlc<Bundle> a;

    private prm(wlc<Bundle> wlc) {
        this.a = wlc;
    }

    public static prm a(wlc<Bundle> wlc) {
        return new prm(wlc);
    }

    public final /* synthetic */ Object get() {
        return (prk) vuf.a((prk) ((Bundle) this.a.get()).getParcelable("EXTRA_TRIGGER"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
