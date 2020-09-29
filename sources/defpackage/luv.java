package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: luv reason: default package */
public final class luv implements luy {
    private final Context a;
    private final spe b;

    public luv(Context context, spe spe) {
        this.a = (Context) fay.a(context);
        this.b = (spe) fay.a(spe);
    }

    public final void a(lvq lvq) {
        Intent a2 = this.b.a(spd.a(ViewUris.ah.toString()).b(true).a());
        if (lvq != null) {
            a2.putExtra("EXTRA_TRANSITION_PARAMS", new shj(lvq.a(), lvq.b(), lvq.c()));
        }
        a.a(a2, rju.h);
        this.a.startActivity(a2);
    }
}
