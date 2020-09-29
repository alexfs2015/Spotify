package defpackage;

import java.util.Set;

/* renamed from: sxg reason: default package */
public final class sxg implements wig<sxe> {
    private final wzi<Set<taa>> a;
    private final wzi<Set<taa>> b;

    public static sxe a(Set<taa> set, Set<taa> set2) {
        return (sxe) wil.a(CC.a(set, set2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Set) this.a.get(), (Set) this.b.get());
    }
}
