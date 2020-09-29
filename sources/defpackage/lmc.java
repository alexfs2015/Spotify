package defpackage;

import java.util.Set;

/* renamed from: lmc reason: default package */
public final class lmc implements wig<vex> {
    private final wzi<Set<vey>> a;

    private lmc(wzi<Set<vey>> wzi) {
        this.a = wzi;
    }

    public static lmc a(wzi<Set<vey>> wzi) {
        return new lmc(wzi);
    }

    public final /* synthetic */ Object get() {
        return (vex) wil.a(new vex((Set) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
