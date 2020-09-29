package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.ui.BadgesFactory;

/* renamed from: pka reason: default package */
public final class pka {
    public final wlc<Context> a;
    public final wlc<BadgesFactory> b;
    public final wlc<jwv> c;

    public pka(wlc<Context> wlc, wlc<BadgesFactory> wlc2, wlc<jwv> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
