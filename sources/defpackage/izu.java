package defpackage;

import java.util.Map.Entry;

/* renamed from: izu reason: default package */
public final class izu implements vua<Entry<Integer, izr>> {
    private final wlc<jab> a;

    public static Entry<Integer, izr> a(jab jab) {
        return (Entry) vuf.a(CC.a(jab), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((jab) this.a.get());
    }
}
