package defpackage;

import android.content.res.Resources;

/* renamed from: tys reason: default package */
public final class tys implements wig<tyr> {
    private final wzi<Resources> a;

    private tys(wzi<Resources> wzi) {
        this.a = wzi;
    }

    public static tys a(wzi<Resources> wzi) {
        return new tys(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tyr((Resources) this.a.get());
    }
}
