package defpackage;

import android.content.Context;

/* renamed from: hrd reason: default package */
public final class hrd implements wig<hrc> {
    private final wzi<hre> a;
    private final wzi<Context> b;

    private hrd(wzi<hre> wzi, wzi<Context> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hrd a(wzi<hre> wzi, wzi<Context> wzi2) {
        return new hrd(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hrc((hre) this.a.get(), (Context) this.b.get());
    }
}
