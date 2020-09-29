package defpackage;

import android.content.Context;

/* renamed from: mlh reason: default package */
public final class mlh implements wig<fbu<Integer>> {
    private final wzi<Context> a;

    private mlh(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static mlh a(wzi<Context> wzi) {
        return new mlh(wzi);
    }

    public final /* synthetic */ Object get() {
        return (fbu) wil.a(CC.a((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
