package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: jio reason: default package */
public final class jio implements vua<jin> {
    private final wlc<Picasso> a;

    private jio(wlc<Picasso> wlc) {
        this.a = wlc;
    }

    public static jio a(wlc<Picasso> wlc) {
        return new jio(wlc);
    }

    public final /* synthetic */ Object get() {
        return new jin((Picasso) this.a.get());
    }
}
