package defpackage;

import android.content.Context;

/* renamed from: mjh reason: default package */
public final class mjh implements wig<mjg> {
    private final wzi<Context> a;
    private final wzi<String> b;
    private final wzi<mji> c;
    private final wzi<mjk> d;

    private mjh(wzi<Context> wzi, wzi<String> wzi2, wzi<mji> wzi3, wzi<mjk> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mjh a(wzi<Context> wzi, wzi<String> wzi2, wzi<mji> wzi3, wzi<mjk> wzi4) {
        return new mjh(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new mjg((Context) this.a.get(), (String) this.b.get(), (mji) this.c.get(), (mjk) this.d.get());
    }
}
