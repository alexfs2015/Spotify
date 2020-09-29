package defpackage;

import java.util.Map.Entry;

/* renamed from: jan reason: default package */
public final class jan implements vua<Entry<Integer, jai>> {
    private final wlc<iyg> a;
    private final wlc<jba> b;

    public static Entry<Integer, jai> a(iyg iyg, Object obj) {
        return (Entry) vuf.a(CC.a(iyg, (jba) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((iyg) this.a.get(), this.b.get());
    }
}
