package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: nmg reason: default package */
public final class nmg implements wig<nmf> {
    private final wzi<gwp> a;
    private final wzi<gwr> b;
    private final wzi<gwm> c;
    private final wzi<ObjectMapper> d;

    private nmg(wzi<gwp> wzi, wzi<gwr> wzi2, wzi<gwm> wzi3, wzi<ObjectMapper> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static nmg a(wzi<gwp> wzi, wzi<gwr> wzi2, wzi<gwm> wzi3, wzi<ObjectMapper> wzi4) {
        return new nmg(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        nmf nmf = new nmf((gwp) this.a.get(), (gwr) this.b.get(), (gwm) this.c.get());
        nmf.a = (ObjectMapper) this.d.get();
        return nmf;
    }
}
