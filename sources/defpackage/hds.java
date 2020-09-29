package defpackage;

import java.util.Map;

/* renamed from: hds reason: default package */
public final class hds implements vua<wud<Map<String, String>>> {
    private final wlc<hed> a;

    private hds(wlc<hed> wlc) {
        this.a = wlc;
    }

    public static hds a(wlc<hed> wlc) {
        return new hds(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(((hed) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
