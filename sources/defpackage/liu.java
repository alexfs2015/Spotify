package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import java.util.List;
import java.util.Set;

/* renamed from: liu reason: default package */
public final class liu implements vua<List<vsm>> {
    private final wlc<Set<vsm>> a;
    private final wlc<uvo> b;

    private liu(wlc<Set<vsm>> wlc, wlc<uvo> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static liu a(wlc<Set<vsm>> wlc, wlc<uvo> wlc2) {
        return new liu(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        Set<vsm> set = (Set) this.a.get();
        uvo uvo = (uvo) this.b.get();
        a g = ImmutableList.g();
        for (vsm c : set) {
            g = g.c(c);
        }
        g.c(uvo);
        return (List) vuf.a(g.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
