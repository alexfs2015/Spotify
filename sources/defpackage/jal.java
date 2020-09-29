package defpackage;

import java.util.Map.Entry;

/* renamed from: jal reason: default package */
public final class jal implements vua<Entry<Integer, jai>> {
    private final wlc<jag> a;

    public static Entry<Integer, jai> a(jag jag) {
        return (Entry) vuf.a(CC.a(jag), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((jag) this.a.get());
    }
}
