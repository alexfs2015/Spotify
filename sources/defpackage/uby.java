package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: uby reason: default package */
public final class uby implements wig<ubx> {
    private final wzi<Picasso> a;

    private uby(wzi<Picasso> wzi) {
        this.a = wzi;
    }

    public static uby a(wzi<Picasso> wzi) {
        return new uby(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ubx((Picasso) this.a.get());
    }
}
