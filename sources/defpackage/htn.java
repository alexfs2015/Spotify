package defpackage;

import android.content.Context;

/* renamed from: htn reason: default package */
public final class htn implements wig<htm> {
    private final wzi<Context> a;
    private final wzi<hre> b;
    private final wzi<hga> c;
    private final wzi<jty> d;

    private htn(wzi<Context> wzi, wzi<hre> wzi2, wzi<hga> wzi3, wzi<jty> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static htn a(wzi<Context> wzi, wzi<hre> wzi2, wzi<hga> wzi3, wzi<jty> wzi4) {
        return new htn(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new htm((Context) this.a.get(), (hre) this.b.get(), (hga) this.c.get(), (jty) this.d.get());
    }
}
