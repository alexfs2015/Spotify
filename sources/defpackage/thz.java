package defpackage;

import android.content.res.Resources;

/* renamed from: thz reason: default package */
public final class thz implements vua<thy> {
    private final wlc<Resources> a;

    private thz(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static thz a(wlc<Resources> wlc) {
        return new thz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new thy((Resources) this.a.get());
    }
}
