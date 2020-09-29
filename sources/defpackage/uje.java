package defpackage;

import android.content.Context;

/* renamed from: uje reason: default package */
public final class uje implements wig<ujc> {
    private final wzi<Context> a;
    private final wzi<ujf> b;
    private final wzi<jtz> c;
    private final wzi<hhc> d;

    private uje(wzi<Context> wzi, wzi<ujf> wzi2, wzi<jtz> wzi3, wzi<hhc> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static uje a(wzi<Context> wzi, wzi<ujf> wzi2, wzi<jtz> wzi3, wzi<hhc> wzi4) {
        return new uje(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new ujc((Context) this.a.get(), (ujf) this.b.get(), (jtz) this.c.get(), (hhc) this.d.get());
    }
}
