package defpackage;

import android.content.Context;

/* renamed from: kxw reason: default package */
public final class kxw implements wig<kxv> {
    private final wzi<kxs> a;
    private final wzi<Context> b;
    private final wzi<rzm> c;

    private kxw(wzi<kxs> wzi, wzi<Context> wzi2, wzi<rzm> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static kxw a(wzi<kxs> wzi, wzi<Context> wzi2, wzi<rzm> wzi3) {
        return new kxw(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new kxv((kxs) this.a.get(), (Context) this.b.get(), (rzm) this.c.get());
    }
}
