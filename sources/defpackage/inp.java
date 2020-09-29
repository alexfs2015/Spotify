package defpackage;

import android.content.Context;

/* renamed from: inp reason: default package */
public final class inp implements wig<ino> {
    private final wzi<Context> a;
    private final wzi<ing> b;

    private inp(wzi<Context> wzi, wzi<ing> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static inp a(wzi<Context> wzi, wzi<ing> wzi2) {
        return new inp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ino((Context) this.a.get(), (ing) this.b.get());
    }
}
