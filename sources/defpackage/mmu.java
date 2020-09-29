package defpackage;

import android.content.Context;

/* renamed from: mmu reason: default package */
public final class mmu implements wig<mmt> {
    private final wzi<Context> a;
    private final wzi<mmo> b;

    private mmu(wzi<Context> wzi, wzi<mmo> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mmu a(wzi<Context> wzi, wzi<mmo> wzi2) {
        return new mmu(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mmt((Context) this.a.get(), (mmo) this.b.get());
    }
}
