package defpackage;

import android.content.Context;

/* renamed from: llb reason: default package */
public final class llb implements wig<scp> {
    private final wzi<Context> a;
    private final wzi<gcb> b;
    private final wzi<scu> c;
    private final wzi<jty> d;

    private llb(wzi<Context> wzi, wzi<gcb> wzi2, wzi<scu> wzi3, wzi<jty> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static llb a(wzi<Context> wzi, wzi<gcb> wzi2, wzi<scu> wzi3, wzi<jty> wzi4) {
        return new llb(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (scp) wil.a(new sdq((Context) this.a.get(), (gcb) this.b.get(), (scu) this.c.get(), (jty) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
