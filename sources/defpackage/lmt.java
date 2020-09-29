package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import java.util.List;
import java.util.Set;

/* renamed from: lmt reason: default package */
public final class lmt implements wig<List<wgs>> {
    private final wzi<Set<wgs>> a;
    private final wzi<vhf> b;

    private lmt(wzi<Set<wgs>> wzi, wzi<vhf> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lmt a(wzi<Set<wgs>> wzi, wzi<vhf> wzi2) {
        return new lmt(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        Set<wgs> set = (Set) this.a.get();
        vhf vhf = (vhf) this.b.get();
        a g = ImmutableList.g();
        for (wgs c : set) {
            g = g.c(c);
        }
        g.c(vhf);
        return (List) wil.a(g.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
