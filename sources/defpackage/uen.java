package defpackage;

import android.content.res.Resources;

/* renamed from: uen reason: default package */
public final class uen implements vua<uem> {
    private final wlc<Resources> a;

    private uen(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static uen a(wlc<Resources> wlc) {
        return new uen(wlc);
    }

    public final /* synthetic */ Object get() {
        return new uem((Resources) this.a.get());
    }
}
