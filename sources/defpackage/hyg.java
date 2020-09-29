package defpackage;

import android.content.res.Resources;

/* renamed from: hyg reason: default package */
public final class hyg implements vua<hyf> {
    private final wlc<Resources> a;

    private hyg(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static hyg a(wlc<Resources> wlc) {
        return new hyg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hyf((Resources) this.a.get());
    }
}
