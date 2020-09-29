package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: ucd reason: default package */
public final class ucd implements wig<ucc> {
    private final wzi<Picasso> a;
    private final wzi<ubu> b;

    private ucd(wzi<Picasso> wzi, wzi<ubu> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ucd a(wzi<Picasso> wzi, wzi<ubu> wzi2) {
        return new ucd(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ucc((Picasso) this.a.get(), (ubu) this.b.get());
    }
}
