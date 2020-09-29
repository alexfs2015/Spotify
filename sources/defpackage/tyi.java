package defpackage;

import android.content.Context;

/* renamed from: tyi reason: default package */
public final class tyi implements wig<tyh> {
    private final wzi<Context> a;
    private final wzi<tye> b;
    private final wzi<jpc> c;
    private final wzi<sso> d;

    private tyi(wzi<Context> wzi, wzi<tye> wzi2, wzi<jpc> wzi3, wzi<sso> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static tyi a(wzi<Context> wzi, wzi<tye> wzi2, wzi<jpc> wzi3, wzi<sso> wzi4) {
        return new tyi(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new tyh((Context) this.a.get(), (tye) this.b.get(), (jpc) this.c.get(), (sso) this.d.get());
    }
}
