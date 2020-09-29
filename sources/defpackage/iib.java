package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: iib reason: default package */
public final class iib implements wig<iia> {
    private final wzi<ihs> a;
    private final wzi<ihr> b;
    private final wzi<Picasso> c;

    private iib(wzi<ihs> wzi, wzi<ihr> wzi2, wzi<Picasso> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static iib a(wzi<ihs> wzi, wzi<ihr> wzi2, wzi<Picasso> wzi3) {
        return new iib(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new iia((ihs) this.a.get(), (ihr) this.b.get(), (Picasso) this.c.get());
    }
}
