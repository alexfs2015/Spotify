package defpackage;

import java.util.Map;

/* renamed from: hgo reason: default package */
public final class hgo implements wig<xii<Map<String, String>>> {
    private final wzi<hgz> a;

    private hgo(wzi<hgz> wzi) {
        this.a = wzi;
    }

    public static hgo a(wzi<hgz> wzi) {
        return new hgo(wzi);
    }

    public final /* synthetic */ Object get() {
        return (xii) wil.a(((hgz) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
