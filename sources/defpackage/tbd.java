package defpackage;

import android.content.res.Resources;

/* renamed from: tbd reason: default package */
public final class tbd implements vua<tbc> {
    private final wlc<Resources> a;

    private tbd(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static tbd a(wlc<Resources> wlc) {
        return new tbd(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tbc((Resources) this.a.get());
    }
}
