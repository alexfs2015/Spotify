package defpackage;

import android.content.res.Resources;

/* renamed from: mym reason: default package */
public final class mym implements vua<myl> {
    private final wlc<Resources> a;

    private mym(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static mym a(wlc<Resources> wlc) {
        return new mym(wlc);
    }

    public final /* synthetic */ Object get() {
        return new myl((Resources) this.a.get());
    }
}
