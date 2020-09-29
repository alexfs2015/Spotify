package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: gak reason: default package */
public final class gak {
    final gai a;
    glk b;
    private final gah c = new gah(0, -1);

    public gak(Context context) {
        a a2 = a.a(context);
        a2.b = R.raw.flare_vert;
        a2.c = R.raw.flare_frag;
        this.b = new glk(a2.a("aPosition", 0));
        this.c.a(-1.0f, 1.0f, 1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.a = new gai(this.c);
    }
}
