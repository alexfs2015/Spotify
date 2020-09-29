package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: uia reason: default package */
public final class uia {
    public final String a = ViewUris.cb.toString();
    public final jjf b;
    public final String c = udt.aM.a();

    public uia(jjf jjf) {
        this.b = (jjf) fay.a(jjf);
    }

    public final void a(boolean z) {
        jjf jjf = this.b;
        bg bgVar = new bg(null, this.c, null, 0, 0, this.a, "tap-camera-button", z ? "allow-permission" : "deny-permission", (double) jrf.a.a());
        jjf.a(bgVar);
    }
}
