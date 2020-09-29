package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: sfa reason: default package */
public final class sfa {
    private final sff a;

    public sfa(sff sff) {
        this.a = sff;
    }

    public final void a(String str) {
        if (ViewUris.U.toString().equals(str)) {
            this.a.j();
            return;
        }
        if (ViewUris.A.toString().equals(str)) {
            this.a.a(true);
        }
    }
}
