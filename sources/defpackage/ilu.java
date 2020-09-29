package defpackage;

import android.content.res.Resources;

/* renamed from: ilu reason: default package */
public final class ilu implements vua<ilt> {
    private final wlc<ilr> a;
    private final wlc<Resources> b;

    private ilu(wlc<ilr> wlc, wlc<Resources> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ilu a(wlc<ilr> wlc, wlc<Resources> wlc2) {
        return new ilu(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ilt((ilr) this.a.get(), (Resources) this.b.get());
    }
}
