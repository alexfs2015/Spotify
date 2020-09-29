package defpackage;

import android.content.res.Resources;

/* renamed from: rmn reason: default package */
public final class rmn implements wig<rmm> {
    private final wzi<hgy> a;
    private final wzi<Resources> b;
    private final wzi<rmk> c;

    private rmn(wzi<hgy> wzi, wzi<Resources> wzi2, wzi<rmk> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static rmn a(wzi<hgy> wzi, wzi<Resources> wzi2, wzi<rmk> wzi3) {
        return new rmn(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new rmm((hgy) this.a.get(), (Resources) this.b.get(), (rmk) this.c.get());
    }
}
