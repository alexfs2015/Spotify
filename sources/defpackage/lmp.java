package defpackage;

import android.content.Context;

/* renamed from: lmp reason: default package */
public final class lmp implements wig<vhe> {
    private final wzi<Context> a;

    private lmp(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static lmp a(wzi<Context> wzi) {
        return new lmp(wzi);
    }

    public final /* synthetic */ Object get() {
        return (vhe) wil.a(new vhe((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
