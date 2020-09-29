package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: tuj reason: default package */
public final class tuj implements vua<tui> {
    private final wlc<Context> a;
    private final wlc<Picasso> b;

    private tuj(wlc<Context> wlc, wlc<Picasso> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tuj a(wlc<Context> wlc, wlc<Picasso> wlc2) {
        return new tuj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tui((Context) this.a.get(), (Picasso) this.b.get());
    }
}
