package defpackage;

import java.util.List;

/* renamed from: gxf reason: default package */
public final class gxf extends hdh {
    private final hcm b;
    private final gxe c;
    private final gxe d;

    private gxf(hcs hcs, gxe gxe, gxe gxe2, hcm hcm) {
        super(hcs);
        this.c = (gxe) fbp.a(gxe);
        this.d = (gxe) fbp.a(gxe2);
        this.b = hcm;
    }

    public static gxf a(hcs hcs, gxe gxe, gxe gxe2, hcm hcm) {
        return new gxf(hcs, gxe, gxe2, hcm);
    }

    public final /* bridge */ /* synthetic */ List body() {
        return this.c;
    }

    public final hcm header() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ List overlays() {
        return this.d;
    }
}
