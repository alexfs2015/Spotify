package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: nlo reason: default package */
public final class nlo implements vua<nln> {
    private final wlc<Picasso> a;

    private nlo(wlc<Picasso> wlc) {
        this.a = wlc;
    }

    public static nlo a(wlc<Picasso> wlc) {
        return new nlo(wlc);
    }

    public final /* synthetic */ Object get() {
        return new nln(this.a);
    }
}
