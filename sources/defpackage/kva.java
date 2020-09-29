package defpackage;

import android.content.Context;

/* renamed from: kva reason: default package */
public final class kva implements wig<kuz> {
    private final wzi<kvd> a;
    private final wzi<Context> b;

    private kva(wzi<kvd> wzi, wzi<Context> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kva a(wzi<kvd> wzi, wzi<Context> wzi2) {
        return new kva(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new kuz((kvd) this.a.get(), (Context) this.b.get());
    }
}
