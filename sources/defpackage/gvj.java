package defpackage;

import java.util.Map;

/* renamed from: gvj reason: default package */
public final class gvj implements gva {
    private final gvk b;
    private final gva c;

    private gvj(gvk gvk, gva gva) {
        this.b = (gvk) fay.a(gvk);
        this.c = (gva) fay.a(gva);
    }

    public static gva a(Map<String, gvk> map, gvk gvk, gva gva) {
        return new gvj(new gvi(map, gvk), gva);
    }

    public final void handleEvent(guy guy) {
        gzp gzp = (gzp) guy.b.events().get(guy.a);
        if (gzp != null) {
            this.b.handleCommand(gzp, guy);
        } else {
            this.c.handleEvent(guy);
        }
    }
}
