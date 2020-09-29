package defpackage;

import android.content.Context;

/* renamed from: kei reason: default package */
public final class kei implements wig<keh> {
    private final wzi<Context> a;
    private final wzi<gfk<fli>> b;
    private final wzi<gcb> c;

    private kei(wzi<Context> wzi, wzi<gfk<fli>> wzi2, wzi<gcb> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static kei a(wzi<Context> wzi, wzi<gfk<fli>> wzi2, wzi<gcb> wzi3) {
        return new kei(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new keh((Context) this.a.get(), (gfk) this.b.get(), (gcb) this.c.get());
    }
}
