package defpackage;

import android.content.Context;

/* renamed from: ksj reason: default package */
public final class ksj implements wig<ksi> {
    private final wzi<Context> a;
    private final wzi<ugl> b;
    private final wzi<ksb> c;
    private final wzi<kry> d;

    private ksj(wzi<Context> wzi, wzi<ugl> wzi2, wzi<ksb> wzi3, wzi<kry> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static ksj a(wzi<Context> wzi, wzi<ugl> wzi2, wzi<ksb> wzi3, wzi<kry> wzi4) {
        return new ksj(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new ksi((Context) this.a.get(), (ugl) this.b.get(), (ksb) this.c.get(), (kry) this.d.get());
    }
}
