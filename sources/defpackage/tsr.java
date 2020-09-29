package defpackage;

import android.content.res.Resources;

/* renamed from: tsr reason: default package */
public final class tsr implements wig<tsq> {
    private final wzi<Resources> a;

    private tsr(wzi<Resources> wzi) {
        this.a = wzi;
    }

    public static tsr a(wzi<Resources> wzi) {
        return new tsr(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tsq((Resources) this.a.get());
    }
}
