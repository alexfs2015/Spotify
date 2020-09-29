package defpackage;

import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;

/* renamed from: oyz reason: default package */
public final class oyz implements oyy {
    private final String a;
    private final owu b;
    private final fsf c;
    private oym d;

    public oyz(fsf fsf, String str, owu owu) {
        this.c = fsf;
        this.a = str;
        this.b = owu;
    }

    public final void a(Show show) {
        String str;
        Covers b2 = show.b();
        if (b2 == null) {
            str = "";
        } else {
            str = b2.getImageUri(Size.NORMAL);
        }
        this.d = oym.a(str, this.a, show.a(), show.c(), show.f(), show.g());
        this.c.ap_();
    }

    public final void a(fyt fyt, oye oye) {
        oym oym = this.d;
        if (oym != null) {
            owu owu = this.b;
            owu.a = fyt;
            owu.a(fyt, oym, false);
        }
    }
}
