package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: tpv reason: default package */
public final class tpv implements vua<tpu> {
    private final wlc<Picasso> a;

    private tpv(wlc<Picasso> wlc) {
        this.a = wlc;
    }

    public static tpv a(wlc<Picasso> wlc) {
        return new tpv(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tpu((Picasso) this.a.get());
    }
}
