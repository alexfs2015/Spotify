package defpackage;

import android.content.Context;

/* renamed from: mqt reason: default package */
public final class mqt implements wig<mqs> {
    private final wzi<Context> a;
    private final wzi<hhk> b;

    private mqt(wzi<Context> wzi, wzi<hhk> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mqt a(wzi<Context> wzi, wzi<hhk> wzi2) {
        return new mqt(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mqs((Context) this.a.get(), (hhk) this.b.get());
    }
}
