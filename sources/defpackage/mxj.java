package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: mxj reason: default package */
public final class mxj implements wig<mxi> {
    private final wzi<Picasso> a;

    private mxj(wzi<Picasso> wzi) {
        this.a = wzi;
    }

    public static mxj a(wzi<Picasso> wzi) {
        return new mxj(wzi);
    }

    public final /* synthetic */ Object get() {
        return new mxi((Picasso) this.a.get());
    }
}
