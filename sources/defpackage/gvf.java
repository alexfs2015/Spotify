package defpackage;

import java.util.List;

/* renamed from: gvf reason: default package */
public final class gvf extends hao {
    private final gzt b;
    private final gve c;
    private final gve d;

    public static gvf a(gzz gzz, gve gve, gve gve2, gzt gzt) {
        return new gvf(gzz, gve, gve2, gzt);
    }

    private gvf(gzz gzz, gve gve, gve gve2, gzt gzt) {
        super(gzz);
        this.c = (gve) fay.a(gve);
        this.d = (gve) fay.a(gve2);
        this.b = gzt;
    }

    public final gzt header() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ List overlays() {
        return this.d;
    }

    public final /* bridge */ /* synthetic */ List body() {
        return this.c;
    }
}
