package defpackage;

import java.util.Map;

/* renamed from: rnv reason: default package */
public final class rnv implements wig<rnu> {
    private final wzi<Map<String, rnw<?>>> a;

    private rnv(wzi<Map<String, rnw<?>>> wzi) {
        this.a = wzi;
    }

    public static rnv a(wzi<Map<String, rnw<?>>> wzi) {
        return new rnv(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rnu((Map) this.a.get());
    }
}
