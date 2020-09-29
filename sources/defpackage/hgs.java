package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: hgs reason: default package */
public final class hgs implements wig<hgr> {
    private final wzi<ObjectMapper> a;

    private hgs(wzi<ObjectMapper> wzi) {
        this.a = wzi;
    }

    public static hgs a(wzi<ObjectMapper> wzi) {
        return new hgs(wzi);
    }

    public final /* synthetic */ Object get() {
        return new hgr((ObjectMapper) this.a.get());
    }
}
