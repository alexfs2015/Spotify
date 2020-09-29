package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: uto reason: default package */
public final class uto {
    public final String a = ViewUris.ca.toString();
    public final jlr b;
    public final String c = uqo.aM.a();

    public uto(jlr jlr) {
        this.b = (jlr) fbp.a(jlr);
    }

    public final void a(boolean z) {
        jlr jlr = this.b;
        bf bfVar = new bf(null, this.c, null, 0, 0, this.a, "tap-camera-button", z ? "allow-permission" : "deny-permission", (double) jtp.a.a());
        jlr.a(bfVar);
    }
}
