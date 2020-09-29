package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: mve reason: default package */
public final class mve implements wig<mvd> {
    private final wzi<Picasso> a;

    private mve(wzi<Picasso> wzi) {
        this.a = wzi;
    }

    public static mve a(wzi<Picasso> wzi) {
        return new mve(wzi);
    }

    public final /* synthetic */ Object get() {
        return new mvd((Picasso) this.a.get());
    }
}
