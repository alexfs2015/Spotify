package defpackage;

import android.content.Context;

/* renamed from: ogo reason: default package */
public final class ogo implements wig<ogn> {
    private final wzi<jyg> a;
    private final wzi<Context> b;

    private ogo(wzi<jyg> wzi, wzi<Context> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ogo a(wzi<jyg> wzi, wzi<Context> wzi2) {
        return new ogo(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ogn((jyg) this.a.get(), (Context) this.b.get());
    }
}
