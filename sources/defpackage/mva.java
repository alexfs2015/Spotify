package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: mva reason: default package */
public final class mva implements wig<muz> {
    private final wzi<Picasso> a;

    private mva(wzi<Picasso> wzi) {
        this.a = wzi;
    }

    public static mva a(wzi<Picasso> wzi) {
        return new mva(wzi);
    }

    public final /* synthetic */ Object get() {
        return new muz((Picasso) this.a.get());
    }
}
