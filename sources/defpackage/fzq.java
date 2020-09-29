package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: fzq reason: default package */
public final class fzq {
    final fzo a;
    gjz b;
    private final fzn c = new fzn(0, -1);

    public fzq(Context context) {
        a a2 = a.a(context);
        a2.b = R.raw.flare_vert;
        a2.c = R.raw.flare_frag;
        this.b = new gjz(a2.a("aPosition", 0));
        this.c.a(-1.0f, 1.0f, 1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.a = new fzo(this.c);
    }
}
