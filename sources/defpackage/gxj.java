package defpackage;

import java.util.Map;

/* renamed from: gxj reason: default package */
public final class gxj implements gxa {
    private final gxk b;
    private final gxa c;

    private gxj(gxk gxk, gxa gxa) {
        this.b = (gxk) fbp.a(gxk);
        this.c = (gxa) fbp.a(gxa);
    }

    public static gxa a(Map<String, gxk> map, gxk gxk, gxa gxa) {
        return new gxj(new gxi(map, gxk), gxa);
    }

    public final void handleEvent(gwy gwy) {
        hci hci = (hci) gwy.b.events().get(gwy.a);
        if (hci != null) {
            this.b.handleCommand(hci, gwy);
        } else {
            this.c.handleEvent(gwy);
        }
    }
}
