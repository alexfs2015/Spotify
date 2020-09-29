package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: gvi reason: default package */
final class gvi implements gvk {
    private final Map<String, gvk> b;
    private final gvk c;

    gvi(Map<String, gvk> map, gvk gvk) {
        this.b = ImmutableMap.a(map);
        this.c = (gvk) fay.a(gvk);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        gvk gvk = (gvk) this.b.get(gzp.name());
        if (gvk != null) {
            gvk.handleCommand(gzp, guy);
        } else {
            this.c.handleCommand(gzp, guy);
        }
    }
}
