package defpackage;

import android.content.Context;

/* renamed from: lkz reason: default package */
public final class lkz implements wig<scp> {
    private final wzi<Context> a;
    private final wzi<gcb> b;
    private final wzi<scu> c;
    private final wzi<jty> d;

    private lkz(wzi<Context> wzi, wzi<gcb> wzi2, wzi<scu> wzi3, wzi<jty> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static lkz a(wzi<Context> wzi, wzi<gcb> wzi2, wzi<scu> wzi3, wzi<jty> wzi4) {
        return new lkz(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (scp) wil.a(new lsy((Context) this.a.get(), (gcb) this.b.get(), (scu) this.c.get(), (jty) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
