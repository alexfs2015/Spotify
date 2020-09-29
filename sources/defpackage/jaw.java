package defpackage;

import java.util.Map.Entry;

/* renamed from: jaw reason: default package */
public final class jaw implements vua<Entry<Integer, jai>> {
    private final wlc<jaf> a;

    public static Entry<Integer, jai> a(jaf jaf) {
        return (Entry) vuf.a(CC.a(jaf), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((jaf) this.a.get());
    }
}
