package defpackage;

import java.util.Map.Entry;

/* renamed from: jav reason: default package */
public final class jav implements vua<Entry<Integer, jai>> {
    private final wlc<jaf> a;

    public static Entry<Integer, jai> a(jaf jaf) {
        return (Entry) vuf.a(CC.b(jaf), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((jaf) this.a.get());
    }
}
