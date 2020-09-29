package defpackage;

import android.graphics.Color;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: mty reason: default package */
public final class mty {
    private static final int e = Color.parseColor("#282828");
    private static final int f = Color.parseColor("#B3B3B3");
    private static final int g = Color.parseColor("#FFFFFF");
    final int a;
    final int b;
    final int c;
    final int d;

    public mty(gzq gzq) {
        if (gzq == null) {
            gzq = HubsImmutableComponentBundle.create();
        }
        this.a = gzq.intValue("background_start", e);
        this.b = gzq.intValue("background_end", e);
        this.c = gzq.intValue("title", f);
        this.d = gzq.intValue("text", g);
    }
}
