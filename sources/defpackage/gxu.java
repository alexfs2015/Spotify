package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.ui.BadgesFactory;
import com.squareup.picasso.Picasso;

/* renamed from: gxu reason: default package */
public final class gxu implements vua<gxt> {
    private final wlc<Context> a;
    private final wlc<Picasso> b;
    private final wlc<BadgesFactory> c;

    private gxu(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<BadgesFactory> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static gxu a(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<BadgesFactory> wlc3) {
        return new gxu(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new gxt((Context) this.a.get(), (Picasso) this.b.get(), (BadgesFactory) this.c.get());
    }
}
