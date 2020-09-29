package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: lyu reason: default package */
public final class lyu implements lyx {
    private final Context a;
    private final szl b;

    public lyu(Context context, szl szl) {
        this.a = (Context) fbp.a(context);
        this.b = (szl) fbp.a(szl);
    }

    public final void a(lzp lzp) {
        Intent a2 = this.b.a(szk.a(ViewUris.ag.toString()).b(true).a());
        if (lzp != null) {
            a2.putExtra("EXTRA_TRANSITION_PARAMS", new srq(lzp.a(), lzp.b(), lzp.c()));
        }
        a.a(a2, rta.h);
        this.a.startActivity(a2);
    }
}
