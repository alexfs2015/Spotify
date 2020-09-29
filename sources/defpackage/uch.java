package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: uch reason: default package */
public final class uch implements wig<ucg> {
    private final wzi<Picasso> a;
    private final wzi<ubu> b;

    private uch(wzi<Picasso> wzi, wzi<ubu> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uch a(wzi<Picasso> wzi, wzi<ubu> wzi2) {
        return new uch(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ucg((Picasso) this.a.get(), (ubu) this.b.get());
    }
}
