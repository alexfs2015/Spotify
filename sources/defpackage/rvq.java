package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: rvq reason: default package */
public final class rvq {
    private final rvv a;

    public rvq(rvv rvv) {
        this.a = rvv;
    }

    public final void a(String str) {
        if (ViewUris.V.toString().equals(str)) {
            this.a.j();
            return;
        }
        if (ViewUris.B.toString().equals(str)) {
            this.a.a(true);
        }
    }
}
