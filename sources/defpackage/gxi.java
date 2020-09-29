package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: gxi reason: default package */
final class gxi implements gxk {
    private final Map<String, gxk> b;
    private final gxk c;

    gxi(Map<String, gxk> map, gxk gxk) {
        this.b = ImmutableMap.a(map);
        this.c = (gxk) fbp.a(gxk);
    }

    public final void handleCommand(hci hci, gwy gwy) {
        gxk gxk = (gxk) this.b.get(hci.name());
        if (gxk != null) {
            gxk.handleCommand(hci, gwy);
        } else {
            this.c.handleCommand(hci, gwy);
        }
    }
}
