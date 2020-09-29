package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: oya reason: default package */
public final class oya implements vua<oxz> {
    private final wlc<Picasso> a;
    private final wlc<oxu> b;

    private oya(wlc<Picasso> wlc, wlc<oxu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static oya a(wlc<Picasso> wlc, wlc<oxu> wlc2) {
        return new oya(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new oxz(this.a, this.b);
    }
}
