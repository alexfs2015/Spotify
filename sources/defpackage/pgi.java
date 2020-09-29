package defpackage;

import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;

/* renamed from: pgi reason: default package */
public final class pgi implements pgh {
    private final String a;
    private final peh b;
    private final fsz c;
    private pfy d;

    public pgi(fsz fsz, String str, peh peh) {
        this.c = fsz;
        this.a = str;
        this.b = peh;
    }

    public final void a(Show show) {
        Covers b2 = show.b();
        this.d = pfy.a(b2 == null ? "" : b2.getImageUri(Size.NORMAL), this.a, show.a(), show.c(), show.f(), show.g());
        this.c.ao_();
    }

    public final void a(fzn fzn, pfq pfq) {
        pfy pfy = this.d;
        if (pfy != null) {
            peh peh = this.b;
            peh.a = fzn;
            peh.a(fzn, pfy, false);
        }
    }
}
