package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: msi reason: default package */
public final class msi implements vua<msh> {
    private final wlc<Picasso> a;

    private msi(wlc<Picasso> wlc) {
        this.a = wlc;
    }

    public static msi a(wlc<Picasso> wlc) {
        return new msi(wlc);
    }

    public final /* synthetic */ Object get() {
        return new msh((Picasso) this.a.get());
    }
}
