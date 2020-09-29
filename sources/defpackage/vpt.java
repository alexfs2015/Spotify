package defpackage;

import android.content.Context;

/* renamed from: vpt reason: default package */
public final class vpt implements wig<vps> {
    private final wzi<vpn> a;
    private final wzi<vqf> b;
    private final wzi<Context> c;
    private final wzi<vpv> d;

    private vpt(wzi<vpn> wzi, wzi<vqf> wzi2, wzi<Context> wzi3, wzi<vpv> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static vpt a(wzi<vpn> wzi, wzi<vqf> wzi2, wzi<Context> wzi3, wzi<vpv> wzi4) {
        return new vpt(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new vps((vpn) this.a.get(), (vqf) this.b.get(), (Context) this.c.get(), (vpv) this.d.get());
    }
}
