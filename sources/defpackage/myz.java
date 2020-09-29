package defpackage;

import android.graphics.Color;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: myz reason: default package */
public final class myz {
    private static final int e = Color.parseColor("#282828");
    private static final int f = Color.parseColor("#B3B3B3");
    private static final int g = Color.parseColor("#FFFFFF");
    final int a;
    final int b;
    final int c;
    final int d;

    public myz(hcj hcj) {
        if (hcj == null) {
            hcj = HubsImmutableComponentBundle.create();
        }
        this.a = hcj.intValue("background_start", e);
        this.b = hcj.intValue("background_end", e);
        this.c = hcj.intValue("title", f);
        this.d = hcj.intValue("text", g);
    }
}
