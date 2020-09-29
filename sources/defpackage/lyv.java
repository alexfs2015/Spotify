package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: lyv reason: default package */
public final class lyv implements gxk {
    private final lyx b;
    private final has c;

    public lyv(lyx lyx, has has) {
        this.b = (lyx) fbp.a(lyx);
        this.c = (has) fbp.a(has);
    }

    public final void handleCommand(hci hci, gwy gwy) {
        this.b.a((lzp) gwy.c.get("buttonData"));
        this.c.logInteraction(ViewUris.ag.toString(), gwy.b, "navigate-forward", null);
    }
}
