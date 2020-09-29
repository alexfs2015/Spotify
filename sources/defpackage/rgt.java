package defpackage;

import android.content.Context;

/* renamed from: rgt reason: default package */
public final class rgt implements wig<rgs> {
    private final wzi<Context> a;
    private final wzi<rfg> b;

    private rgt(wzi<Context> wzi, wzi<rfg> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rgt a(wzi<Context> wzi, wzi<rfg> wzi2) {
        return new rgt(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rgs((Context) this.a.get(), (rfg) this.b.get());
    }
}
