package defpackage;

import android.view.LayoutInflater;

/* renamed from: qqy reason: default package */
public final class qqy implements wig<qqx> {
    private final wzi<LayoutInflater> a;
    private final wzi<qqq> b;
    private final wzi<qrg> c;
    private final wzi<qsb> d;

    private qqy(wzi<LayoutInflater> wzi, wzi<qqq> wzi2, wzi<qrg> wzi3, wzi<qsb> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qqy a(wzi<LayoutInflater> wzi, wzi<qqq> wzi2, wzi<qrg> wzi3, wzi<qsb> wzi4) {
        return new qqy(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new qqx((LayoutInflater) this.a.get(), (qqq) this.b.get(), (qrg) this.c.get(), (qsb) this.d.get());
    }
}
