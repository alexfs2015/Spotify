package defpackage;

import android.content.Context;

/* renamed from: hmg reason: default package */
public final class hmg implements wig<hmf> {
    private final wzi<Context> a;
    private final wzi<vvb> b;

    private hmg(wzi<Context> wzi, wzi<vvb> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hmg a(wzi<Context> wzi, wzi<vvb> wzi2) {
        return new hmg(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hmf((Context) this.a.get(), (vvb) this.b.get());
    }
}
