package defpackage;

import android.content.Context;

/* renamed from: uuu reason: default package */
public final class uuu implements wig<uut> {
    private final wzi<Context> a;
    private final wzi<vos> b;
    private final wzi<uvb> c;
    private final wzi<uuy> d;

    private uuu(wzi<Context> wzi, wzi<vos> wzi2, wzi<uvb> wzi3, wzi<uuy> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static uuu a(wzi<Context> wzi, wzi<vos> wzi2, wzi<uvb> wzi3, wzi<uuy> wzi4) {
        return new uuu(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new uut((Context) this.a.get(), (vos) this.b.get(), (uvb) this.c.get(), (uuy) this.d.get());
    }
}
