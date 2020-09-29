package defpackage;

import java.util.Map.Entry;

/* renamed from: izv reason: default package */
public final class izv implements vua<Entry<Integer, izr>> {
    private final wlc<jac> a;

    public static Entry<Integer, izr> a(jac jac) {
        return (Entry) vuf.a(CC.a(jac), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((jac) this.a.get());
    }
}
