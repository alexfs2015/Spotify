package defpackage;

import java.util.Map.Entry;

/* renamed from: jao reason: default package */
public final class jao implements vua<Entry<Integer, jai>> {
    private final wlc<jaf> a;

    public static Entry<Integer, jai> a(jaf jaf) {
        return (Entry) vuf.a(CC.c(jaf), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((jaf) this.a.get());
    }
}
