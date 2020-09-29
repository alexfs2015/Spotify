package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: rjo reason: default package */
public final class rjo implements vua<rjn> {
    private final wlc<Picasso> a;

    private rjo(wlc<Picasso> wlc) {
        this.a = wlc;
    }

    public static rjo a(wlc<Picasso> wlc) {
        return new rjo(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rjn((Picasso) this.a.get());
    }
}
