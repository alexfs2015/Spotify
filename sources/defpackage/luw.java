package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: luw reason: default package */
public final class luw implements gvk {
    private final luy b;
    private final gxz c;

    public luw(luy luy, gxz gxz) {
        this.b = (luy) fay.a(luy);
        this.c = (gxz) fay.a(gxz);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        this.b.a((lvq) guy.c.get("buttonData"));
        this.c.logInteraction(ViewUris.ah.toString(), guy.b, "navigate-forward", null);
    }
}
