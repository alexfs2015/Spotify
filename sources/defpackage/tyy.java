package defpackage;

import android.content.res.Resources;

/* renamed from: tyy reason: default package */
public final class tyy implements wig<tyx> {
    private final wzi<Resources> a;
    private final wzi<gcb> b;
    private final wzi<tyr> c;

    private tyy(wzi<Resources> wzi, wzi<gcb> wzi2, wzi<tyr> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static tyy a(wzi<Resources> wzi, wzi<gcb> wzi2, wzi<tyr> wzi3) {
        return new tyy(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new tyx((Resources) this.a.get(), (gcb) this.b.get(), (tyr) this.c.get());
    }
}
