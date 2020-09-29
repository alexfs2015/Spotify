package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: tpx reason: default package */
public final class tpx implements vua<tpw> {
    private final wlc<Picasso> a;

    private tpx(wlc<Picasso> wlc) {
        this.a = wlc;
    }

    public static tpx a(wlc<Picasso> wlc) {
        return new tpx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tpw((Picasso) this.a.get());
    }
}
